package com.thoughtworks.tracing.config;

import io.micrometer.observation.Observation;
import io.micrometer.observation.ObservationRegistry;
import io.micrometer.observation.aop.ObservedAspect;
import io.micrometer.tracing.Span;
import io.micrometer.tracing.Tracer;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static net.logstash.logback.argument.StructuredArguments.entries;

@Component
@Aspect
public class LoggingAspect {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(LoggingAspect.class);
    private final Tracer tracer;
    private final TraceConfigInterface traceConfig;
    @Autowired
    public LoggingAspect(Tracer tracer, @Qualifier("traceConfig") TraceConfigInterface traceConfig) {
        this.tracer = tracer;
        this.traceConfig = traceConfig;
    }

    @Pointcut("@annotation(Log)")
    public void logPointcut(){
    }

    @Around("logPointcut()")
    public Object logAllMethodCallsAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        Span span = tracer.nextSpan();
        tracer.withSpan(span);
        span.name(joinPoint.getSignature().getName());
        span.tag("input", Arrays.toString(joinPoint.getArgs()));
        span.tag("additionalJsonProps", traceConfig.toJsonString());
        log.info("Entering Method with name " + joinPoint.getSignature().getName() + " invoked with arguments " + Arrays.toString(joinPoint.getArgs()));
        Object result = joinPoint.proceed();
        span.tag("output", result.toString());
        log.info("Exiting Method with name " + joinPoint.getSignature().getName() + " with result " + result);
        span.end();
        tracer.withSpan(span).close();
        return result;

    }


}
