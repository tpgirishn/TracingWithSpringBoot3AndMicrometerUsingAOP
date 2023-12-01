package com.thoughtworks.tracing.config;

import io.micrometer.observation.aop.ObservedAspect;
import io.micrometer.tracing.Tracer;
import io.micrometer.tracing.otel.bridge.*;
import io.opentelemetry.context.propagation.ContextPropagators;
import io.opentelemetry.exporter.zipkin.ZipkinSpanExporterBuilder;
import io.opentelemetry.extension.trace.propagation.B3Propagator;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.trace.SdkTracerProvider;
import io.opentelemetry.sdk.trace.export.BatchSpanProcessor;
import io.opentelemetry.sdk.trace.export.SpanExporter;
import org.springframework.context.annotation.Bean;
import zipkin2.reporter.urlconnection.URLConnectionSender;

import java.util.Collections;
import java.util.List;

import static io.opentelemetry.sdk.trace.samplers.Sampler.alwaysOn;

public class TracingConfig {

    @Bean
    public Tracer tracer() {
        /*
        ThreadLocalCurrentTraceContext braveCurrentTraceContext = ThreadLocalCurrentTraceContext.newBuilder()
                .addScopeDecorator(MDCScopeDecorator.get())
                .build();
        BraveCurrentTraceContext bridgeContext = new BraveCurrentTraceContext(braveCurrentTraceContext);

        Tracing tracing = Tracing.newBuilder()
                .currentTraceContext(braveCurrentTraceContext)
                .supportsJoin(false)
                .traceId128Bit(true)
                .propagationFactory(BaggagePropagation.newFactoryBuilder(B3Propagation.FACTORY)
                        .build())
                .sampler(Sampler.ALWAYS_SAMPLE)
                .build();

        brave.Tracer braveTracer = tracing.tracer();
        return  new BraveTracer(braveTracer, bridgeContext, new BraveBaggageManager());*/
        SpanExporter spanExporter = new ZipkinSpanExporterBuilder()
                .setSender(URLConnectionSender.create("http://localhost:9411/api/v2/spans"))
                .build();

        // [OTel component] SdkTracerProvider is an SDK implementation for TracerProvider
        SdkTracerProvider sdkTracerProvider = SdkTracerProvider.builder()
                .setSampler(alwaysOn())
                .addSpanProcessor(BatchSpanProcessor.builder(spanExporter).build())
                .build();

        // [OTel component] The SDK implementation of OpenTelemetry
        OpenTelemetrySdk openTelemetrySdk = OpenTelemetrySdk.builder()
                .setTracerProvider(sdkTracerProvider)
                .setPropagators(ContextPropagators.create(B3Propagator.injectingSingleHeader()))
                .build();

        // [OTel component] Tracer is a component that handles the life-cycle of a span
        io.opentelemetry.api.trace.Tracer otelTracer = openTelemetrySdk.getTracerProvider()
                .get("io.micrometer.micrometer-tracing");

        // [Micrometer Tracing component] A Micrometer Tracing wrapper for OTel
        OtelCurrentTraceContext otelCurrentTraceContext = new OtelCurrentTraceContext();
        // [Micrometer Tracing component] A Micrometer Tracing listener for setting up MDC
        Slf4JEventListener slf4JEventListener = new Slf4JEventListener();

        // [Micrometer Tracing component] A Micrometer Tracing listener for setting
        // Baggage in MDC. Customizable
        // with correlation fields (currently we're setting empty list)
        Slf4JBaggageEventListener slf4JBaggageEventListener = new Slf4JBaggageEventListener(Collections.emptyList());

        // [Micrometer Tracing component] A Micrometer Tracing wrapper for OTel's Tracer.
        // You can consider
        // customizing the baggage manager with correlation and remote fields (currently
        // we're setting empty lists)
        return new OtelTracer(otelTracer, otelCurrentTraceContext, event -> {
            slf4JEventListener.onEvent(event);
            slf4JBaggageEventListener.onEvent(event);
        }, new OtelBaggageManager(otelCurrentTraceContext, Collections.emptyList(), Collections.emptyList()));
    }
}
