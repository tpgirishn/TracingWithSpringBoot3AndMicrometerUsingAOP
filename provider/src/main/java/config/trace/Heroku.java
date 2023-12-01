
package config.trace;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Contextual information for the Heroku platform.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dyno_type",
    "dyno_id",
    "source"
})
public class Heroku {

    /**
     * The dyno type for the process (web, worker, router, etc)
     * (Required)
     * 
     */
    @JsonProperty("dyno_type")
    @JsonPropertyDescription("The dyno type for the process (web, worker, router, etc)")
    private String dyno_type;
    /**
     * The dyno ID for the process.
     * 
     */
    @JsonProperty("dyno_id")
    @JsonPropertyDescription("The dyno ID for the process.")
    private Integer dyno_id;
    /**
     * The source of the log message. For example, Heroku can send log messages for the web.1 dyno from both within the app and Heroku itself.
     * (Required)
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("The source of the log message. For example, Heroku can send log messages for the web.1 dyno from both within the app and Heroku itself.")
    private Heroku.Source source;

    /**
     * The dyno type for the process (web, worker, router, etc)
     * (Required)
     * 
     */
    @JsonProperty("dyno_type")
    public String getDyno_type() {
        return dyno_type;
    }

    /**
     * The dyno type for the process (web, worker, router, etc)
     * (Required)
     * 
     */
    @JsonProperty("dyno_type")
    public void setDyno_type(String dyno_type) {
        this.dyno_type = dyno_type;
    }

    public Heroku withDyno_type(String dyno_type) {
        this.dyno_type = dyno_type;
        return this;
    }

    /**
     * The dyno ID for the process.
     * 
     */
    @JsonProperty("dyno_id")
    public Integer getDyno_id() {
        return dyno_id;
    }

    /**
     * The dyno ID for the process.
     * 
     */
    @JsonProperty("dyno_id")
    public void setDyno_id(Integer dyno_id) {
        this.dyno_id = dyno_id;
    }

    public Heroku withDyno_id(Integer dyno_id) {
        this.dyno_id = dyno_id;
        return this;
    }

    /**
     * The source of the log message. For example, Heroku can send log messages for the web.1 dyno from both within the app and Heroku itself.
     * (Required)
     * 
     */
    @JsonProperty("source")
    public Heroku.Source getSource() {
        return source;
    }

    /**
     * The source of the log message. For example, Heroku can send log messages for the web.1 dyno from both within the app and Heroku itself.
     * (Required)
     * 
     */
    @JsonProperty("source")
    public void setSource(Heroku.Source source) {
        this.source = source;
    }

    public Heroku withSource(Heroku.Source source) {
        this.source = source;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Heroku.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("dyno_type");
        sb.append('=');
        sb.append(((this.dyno_type == null)?"<null>":this.dyno_type));
        sb.append(',');
        sb.append("dyno_id");
        sb.append('=');
        sb.append(((this.dyno_id == null)?"<null>":this.dyno_id));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
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
        result = ((result* 31)+((this.dyno_type == null)? 0 :this.dyno_type.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.dyno_id == null)? 0 :this.dyno_id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Heroku) == false) {
            return false;
        }
        Heroku rhs = ((Heroku) other);
        return ((((this.dyno_type == rhs.dyno_type)||((this.dyno_type!= null)&&this.dyno_type.equals(rhs.dyno_type)))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.dyno_id == rhs.dyno_id)||((this.dyno_id!= null)&&this.dyno_id.equals(rhs.dyno_id))));
    }


    /**
     * The source of the log message. For example, Heroku can send log messages for the web.1 dyno from both within the app and Heroku itself.
     * 
     */
    public enum Source {

        APP("app"),
        HEROKU("heroku");
        private final String value;
        private final static Map<String, Heroku.Source> CONSTANTS = new HashMap<String, Heroku.Source>();

        static {
            for (Heroku.Source c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Source(String value) {
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
        public static Heroku.Source fromValue(String value) {
            Heroku.Source constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
