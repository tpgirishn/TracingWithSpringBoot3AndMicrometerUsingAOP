package au.com.dius.pactworkshop.provider;

import com.thoughtworks.tracing.config.LoggingAspect;
import com.thoughtworks.tracing.config.TracingConfig;
import config.trace.TraceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.observation.ObservationAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.tracing.MicrometerTracingAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.tracing.zipkin.ZipkinAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication(exclude = {MicrometerTracingAutoConfiguration.class, ObservationAutoConfiguration.class})
@Import({TraceConfig.class, TracingConfig.class, LoggingAspect.class})
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }

}
