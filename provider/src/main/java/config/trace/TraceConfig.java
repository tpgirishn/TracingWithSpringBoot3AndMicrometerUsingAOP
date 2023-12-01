
package config.trace;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.thoughtworks.tracing.config.TraceConfigInterface;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


/**
 * Official JSON schema for Timber log events (https://github.com/timberio/log-event-json-schema)
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dt",
    "level",
    "severity",
    "message",
    "time_ms",
    "context",
    "event"
})
@Component("traceConfig")
public class TraceConfig implements TraceConfigInterface {
    ObjectWriter ow = new ObjectMapper().findAndRegisterModules().writer().withDefaultPrettyPrinter();
    /**
     * The IOS8601 formatted datetime when the log was generated.
     * (Required)
     * 
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm", timezone = "UTC")
    @JsonProperty("dt")
    @JsonPropertyDescription("The IOS8601 formatted datetime when the log was generated.")
    private LocalDateTime dt;
    /**
     * The descriptive level of the log in string format. The available options adhere to the Syslog 5424 specification.
     * 
     */
    @JsonProperty("level")
    @JsonPropertyDescription("The descriptive level of the log in string format. The available options adhere to the Syslog 5424 specification.")
    private TraceConfig.Level level;
    /**
     * The numerical severity of the message represented by an integer between 0 and 7. The available options adhere to the Syslog 5424 specification.
     * 
     */
    @JsonProperty("severity")
    @JsonPropertyDescription("The numerical severity of the message represented by an integer between 0 and 7. The available options adhere to the Syslog 5424 specification.")
    private Integer severity = 0;
    /**
     * The raw log event message, formatting stripped.
     * (Required)
     * 
     */
    @JsonProperty("message")
    @JsonPropertyDescription("The raw log event message, formatting stripped.")
    private String message;
    /**
     * The duration, in fractional milliseconds, that it took to complete this event.
     * 
     */
    @JsonProperty("time_ms")
    @JsonPropertyDescription("The duration, in fractional milliseconds, that it took to complete this event.")
    private Double time_ms;
    /**
     * Contextual metadata about the environment the event takes place in
     * 
     */
    @JsonProperty("context")
    @JsonPropertyDescription("Contextual metadata about the environment the event takes place in")
    private Context context;
    /**
     * A controlled representation of the event this log line represents.
     * 
     */
    @JsonProperty("event")
    @JsonPropertyDescription("A controlled representation of the event this log line represents.")
    private Event event;

    /**
     * The IOS8601 formatted datetime when the log was generated.
     * (Required)
     * 
     */
    @JsonProperty("dt")
    public LocalDateTime getDt() {
        return dt;
    }

    /**
     * The IOS8601 formatted datetime when the log was generated.
     * (Required)
     * 
     */
    @JsonProperty("dt")
    public void setDt(LocalDateTime dt) {
        this.dt = dt;
    }

    public TraceConfig withDt(LocalDateTime dt) {
        this.dt = dt;
        return this;
    }

    /**
     * The descriptive level of the log in string format. The available options adhere to the Syslog 5424 specification.
     * 
     */
    @JsonProperty("level")
    public TraceConfig.Level getLevel() {
        return level;
    }

    /**
     * The descriptive level of the log in string format. The available options adhere to the Syslog 5424 specification.
     * 
     */
    @JsonProperty("level")
    public void setLevel(TraceConfig.Level level) {
        this.level = level;
    }

    public TraceConfig withLevel(TraceConfig.Level level) {
        this.level = level;
        return this;
    }

    /**
     * The numerical severity of the message represented by an integer between 0 and 7. The available options adhere to the Syslog 5424 specification.
     * 
     */
    @JsonProperty("severity")
    public Integer getSeverity() {
        return severity;
    }

    /**
     * The numerical severity of the message represented by an integer between 0 and 7. The available options adhere to the Syslog 5424 specification.
     * 
     */
    @JsonProperty("severity")
    public void setSeverity(Integer severity) {
        this.severity = severity;
    }

    public TraceConfig withSeverity(Integer severity) {
        this.severity = severity;
        return this;
    }

    /**
     * The raw log event message, formatting stripped.
     * (Required)
     * 
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * The raw log event message, formatting stripped.
     * (Required)
     * 
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    public TraceConfig withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * The duration, in fractional milliseconds, that it took to complete this event.
     * 
     */
    @JsonProperty("time_ms")
    public Double getTime_ms() {
        return time_ms;
    }

    /**
     * The duration, in fractional milliseconds, that it took to complete this event.
     * 
     */
    @JsonProperty("time_ms")
    public void setTime_ms(Double time_ms) {
        this.time_ms = time_ms;
    }

    public TraceConfig withTime_ms(Double time_ms) {
        this.time_ms = time_ms;
        return this;
    }

    /**
     * Contextual metadata about the environment the event takes place in
     * 
     */
    @JsonProperty("context")
    public Context getContext() {
        return context;
    }

    /**
     * Contextual metadata about the environment the event takes place in
     * 
     */
    @JsonProperty("context")
    public void setContext(Context context) {
        this.context = context;
    }

    public TraceConfig withContext(Context context) {
        this.context = context;
        return this;
    }

    /**
     * A controlled representation of the event this log line represents.
     * 
     */
    @JsonProperty("event")
    public Event getEvent() {
        return event;
    }

    /**
     * A controlled representation of the event this log line represents.
     * 
     */
    @JsonProperty("event")
    public void setEvent(Event event) {
        this.event = event;
    }

    public TraceConfig withEvent(Event event) {
        this.event = event;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TraceConfig.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("dt");
        sb.append('=');
        sb.append(((this.dt == null)? org.joda.time.LocalDateTime.now() :this.dt));
        sb.append(',');
        sb.append("level");
        sb.append('=');
        sb.append(((this.level == null)?"<null>":this.level));
        sb.append(',');
        sb.append("severity");
        sb.append('=');
        sb.append(((this.severity == null)?"<null>":this.severity));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
        sb.append(',');
        sb.append("time_ms");
        sb.append('=');
        sb.append(((this.time_ms == null)?"<null>":this.time_ms));
        sb.append(',');
        sb.append("context");
        sb.append('=');
        sb.append(((this.context == null)?"<null>":this.context));
        sb.append(',');
        sb.append("event");
        sb.append('=');
        sb.append(((this.event == null)?"<null>":this.event));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.dt == null)? 0 :this.dt.hashCode()));
        result = ((result* 31)+((this.severity == null)? 0 :this.severity.hashCode()));
        result = ((result* 31)+((this.level == null)? 0 :this.level.hashCode()));
        result = ((result* 31)+((this.time_ms == null)? 0 :this.time_ms.hashCode()));
        result = ((result* 31)+((this.context == null)? 0 :this.context.hashCode()));
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        result = ((result* 31)+((this.event == null)? 0 :this.event.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TraceConfig) == false) {
            return false;
        }
        TraceConfig rhs = ((TraceConfig) other);
        return ((((((((this.dt == rhs.dt)||((this.dt!= null)&&this.dt.equals(rhs.dt)))&&((this.severity == rhs.severity)||((this.severity!= null)&&this.severity.equals(rhs.severity))))&&((this.level == rhs.level)||((this.level!= null)&&this.level.equals(rhs.level))))&&((this.time_ms == rhs.time_ms)||((this.time_ms!= null)&&this.time_ms.equals(rhs.time_ms))))&&((this.context == rhs.context)||((this.context!= null)&&this.context.equals(rhs.context))))&&((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message))))&&((this.event == rhs.event)||((this.event!= null)&&this.event.equals(rhs.event))));
    }

    @Override
    public String toJsonString() {

        try {
            this.dt = LocalDateTime.now();
            this.level = Level.INFO;
            this.severity = 0;
            this.message = "A random message";
            return ow.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * The descriptive level of the log in string format. The available options adhere to the Syslog 5424 specification.
     * 
     */
    public enum Level {

        DEBUG("debug"),
        INFO("info"),
        NOTICE("notice"),
        WARN("warn"),
        ERROR("error"),
        CRITICAL("critical"),
        ALERT("alert"),
        EMERGENCY("emergency");
        private final String value;
        private final static Map<String, TraceConfig.Level> CONSTANTS = new HashMap<String, TraceConfig.Level>();

        static {
            for (TraceConfig.Level c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Level(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static TraceConfig.Level fromValue(String value) {
            TraceConfig.Level constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
