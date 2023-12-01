package com.thoughtworks.tracing.config;

import org.springframework.stereotype.Component;

@Component
public interface TraceConfigInterface {
    String toJsonString();
}
