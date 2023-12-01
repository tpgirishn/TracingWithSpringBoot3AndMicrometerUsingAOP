
package config.trace;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Represents an error or exception.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "backtrace",
    "message",
    "metadata_json",
    "name"
})
public class Error {

    /**
     * An optional array of lines, representing the call stack, leading up to the error.
     * 
     */
    @JsonProperty("backtrace")
    @JsonPropertyDescription("An optional array of lines, representing the call stack, leading up to the error.")
    private List<Backtrace> backtrace = new ArrayList<Backtrace>();
    /**
     * Optional message describing the error.
     * 
     */
    @JsonProperty("message")
    @JsonPropertyDescription("Optional message describing the error.")
    private String message;
    /**
     * A JSON encoded string representing additional metadata. This provides insight without the overhead of creating and indexing fields.
     * 
     */
    @JsonProperty("metadata_json")
    @JsonPropertyDescription("A JSON encoded string representing additional metadata. This provides insight without the overhead of creating and indexing fields.")
    private String metadata_json;
    /**
     * Required name of the error.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Required name of the error.")
    private String name;

    /**
     * An optional array of lines, representing the call stack, leading up to the error.
     * 
     */
    @JsonProperty("backtrace")
    public List<Backtrace> getBacktrace() {
        return backtrace;
    }

    /**
     * An optional array of lines, representing the call stack, leading up to the error.
     * 
     */
    @JsonProperty("backtrace")
    public void setBacktrace(List<Backtrace> backtrace) {
        this.backtrace = backtrace;
    }

    public Error withBacktrace(List<Backtrace> backtrace) {
        this.backtrace = backtrace;
        return this;
    }

    /**
     * Optional message describing the error.
     * 
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * Optional message describing the error.
     * 
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    public Error withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * A JSON encoded string representing additional metadata. This provides insight without the overhead of creating and indexing fields.
     * 
     */
    @JsonProperty("metadata_json")
    public String getMetadata_json() {
        return metadata_json;
    }

    /**
     * A JSON encoded string representing additional metadata. This provides insight without the overhead of creating and indexing fields.
     * 
     */
    @JsonProperty("metadata_json")
    public void setMetadata_json(String metadata_json) {
        this.metadata_json = metadata_json;
    }

    public Error withMetadata_json(String metadata_json) {
        this.metadata_json = metadata_json;
        return this;
    }

    /**
     * Required name of the error.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Required name of the error.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Error withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Error.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("backtrace");
        sb.append('=');
        sb.append(((this.backtrace == null)?"<null>":this.backtrace));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
        sb.append(',');
        sb.append("metadata_json");
        sb.append('=');
        sb.append(((this.metadata_json == null)?"<null>":this.metadata_json));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        result = ((result* 31)+((this.backtrace == null)? 0 :this.backtrace.hashCode()));
        result = ((result* 31)+((this.metadata_json == null)? 0 :this.metadata_json.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Error) == false) {
            return false;
        }
        Error rhs = ((Error) other);
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message))))&&((this.backtrace == rhs.backtrace)||((this.backtrace!= null)&&this.backtrace.equals(rhs.backtrace))))&&((this.metadata_json == rhs.metadata_json)||((this.metadata_json!= null)&&this.metadata_json.equals(rhs.metadata_json))));
    }

}
