
package config.trace;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Represents a task or job execution, typically for background tasks or jobs.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "attempt",
    "id",
    "queue_name"
})
public class Job {

    /**
     * The attempt number, if applicable.
     * 
     */
    @JsonProperty("attempt")
    @JsonPropertyDescription("The attempt number, if applicable.")
    private Integer attempt;
    /**
     * A unique identifier for the job or task.
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A unique identifier for the job or task.")
    private String id;
    /**
     * The name of the queue being processes, if applicable.
     * 
     */
    @JsonProperty("queue_name")
    @JsonPropertyDescription("The name of the queue being processes, if applicable.")
    private String queue_name;

    /**
     * The attempt number, if applicable.
     * 
     */
    @JsonProperty("attempt")
    public Integer getAttempt() {
        return attempt;
    }

    /**
     * The attempt number, if applicable.
     * 
     */
    @JsonProperty("attempt")
    public void setAttempt(Integer attempt) {
        this.attempt = attempt;
    }

    public Job withAttempt(Integer attempt) {
        this.attempt = attempt;
        return this;
    }

    /**
     * A unique identifier for the job or task.
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * A unique identifier for the job or task.
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Job withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * The name of the queue being processes, if applicable.
     * 
     */
    @JsonProperty("queue_name")
    public String getQueue_name() {
        return queue_name;
    }

    /**
     * The name of the queue being processes, if applicable.
     * 
     */
    @JsonProperty("queue_name")
    public void setQueue_name(String queue_name) {
        this.queue_name = queue_name;
    }

    public Job withQueue_name(String queue_name) {
        this.queue_name = queue_name;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Job.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("attempt");
        sb.append('=');
        sb.append(((this.attempt == null)?"<null>":this.attempt));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("queue_name");
        sb.append('=');
        sb.append(((this.queue_name == null)?"<null>":this.queue_name));
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
        result = ((result* 31)+((this.queue_name == null)? 0 :this.queue_name.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.attempt == null)? 0 :this.attempt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Job) == false) {
            return false;
        }
        Job rhs = ((Job) other);
        return ((((this.queue_name == rhs.queue_name)||((this.queue_name!= null)&&this.queue_name.equals(rhs.queue_name)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.attempt == rhs.attempt)||((this.attempt!= null)&&this.attempt.equals(rhs.attempt))));
    }

}
