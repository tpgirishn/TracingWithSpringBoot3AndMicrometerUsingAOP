
package config.trace;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Represents the joining of a multi-plexed websocket channel.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "channel",
    "topic",
    "metadata_json"
})
public class Channel_join {

    /**
     * The name of the channel being joined.
     * (Required)
     * 
     */
    @JsonProperty("channel")
    @JsonPropertyDescription("The name of the channel being joined.")
    private String channel;
    /**
     * The name of the channel topic being joined.
     * (Required)
     * 
     */
    @JsonProperty("topic")
    @JsonPropertyDescription("The name of the channel topic being joined.")
    private String topic;
    /**
     * A JSON encoded string representing additional metadata. This provides insight without the overhead of creating and indexing fields.
     * 
     */
    @JsonProperty("metadata_json")
    @JsonPropertyDescription("A JSON encoded string representing additional metadata. This provides insight without the overhead of creating and indexing fields.")
    private String metadata_json;

    /**
     * The name of the channel being joined.
     * (Required)
     * 
     */
    @JsonProperty("channel")
    public String getChannel() {
        return channel;
    }

    /**
     * The name of the channel being joined.
     * (Required)
     * 
     */
    @JsonProperty("channel")
    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Channel_join withChannel(String channel) {
        this.channel = channel;
        return this;
    }

    /**
     * The name of the channel topic being joined.
     * (Required)
     * 
     */
    @JsonProperty("topic")
    public String getTopic() {
        return topic;
    }

    /**
     * The name of the channel topic being joined.
     * (Required)
     * 
     */
    @JsonProperty("topic")
    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Channel_join withTopic(String topic) {
        this.topic = topic;
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

    public Channel_join withMetadata_json(String metadata_json) {
        this.metadata_json = metadata_json;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Channel_join.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("channel");
        sb.append('=');
        sb.append(((this.channel == null)?"<null>":this.channel));
        sb.append(',');
        sb.append("topic");
        sb.append('=');
        sb.append(((this.topic == null)?"<null>":this.topic));
        sb.append(',');
        sb.append("metadata_json");
        sb.append('=');
        sb.append(((this.metadata_json == null)?"<null>":this.metadata_json));
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
        result = ((result* 31)+((this.channel == null)? 0 :this.channel.hashCode()));
        result = ((result* 31)+((this.topic == null)? 0 :this.topic.hashCode()));
        result = ((result* 31)+((this.metadata_json == null)? 0 :this.metadata_json.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Channel_join) == false) {
            return false;
        }
        Channel_join rhs = ((Channel_join) other);
        return ((((this.channel == rhs.channel)||((this.channel!= null)&&this.channel.equals(rhs.channel)))&&((this.topic == rhs.topic)||((this.topic!= null)&&this.topic.equals(rhs.topic))))&&((this.metadata_json == rhs.metadata_json)||((this.metadata_json!= null)&&this.metadata_json.equals(rhs.metadata_json))));
    }

}
