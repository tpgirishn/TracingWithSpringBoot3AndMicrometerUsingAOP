
package config.trace;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Represents the receiption of an event on a multi-plexed websocket channel.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "channel",
    "topic",
    "event",
    "metadata_json"
})
public class Channel_receive {

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
     * The name of the event being received.
     * (Required)
     * 
     */
    @JsonProperty("event")
    @JsonPropertyDescription("The name of the event being received.")
    private String event;
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

    public Channel_receive withChannel(String channel) {
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

    public Channel_receive withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * The name of the event being received.
     * (Required)
     * 
     */
    @JsonProperty("event")
    public String getEvent() {
        return event;
    }

    /**
     * The name of the event being received.
     * (Required)
     * 
     */
    @JsonProperty("event")
    public void setEvent(String event) {
        this.event = event;
    }

    public Channel_receive withEvent(String event) {
        this.event = event;
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

    public Channel_receive withMetadata_json(String metadata_json) {
        this.metadata_json = metadata_json;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Channel_receive.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("channel");
        sb.append('=');
        sb.append(((this.channel == null)?"<null>":this.channel));
        sb.append(',');
        sb.append("topic");
        sb.append('=');
        sb.append(((this.topic == null)?"<null>":this.topic));
        sb.append(',');
        sb.append("event");
        sb.append('=');
        sb.append(((this.event == null)?"<null>":this.event));
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
        result = ((result* 31)+((this.event == null)? 0 :this.event.hashCode()));
        result = ((result* 31)+((this.metadata_json == null)? 0 :this.metadata_json.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Channel_receive) == false) {
            return false;
        }
        Channel_receive rhs = ((Channel_receive) other);
        return (((((this.channel == rhs.channel)||((this.channel!= null)&&this.channel.equals(rhs.channel)))&&((this.topic == rhs.topic)||((this.topic!= null)&&this.topic.equals(rhs.topic))))&&((this.event == rhs.event)||((this.event!= null)&&this.event.equals(rhs.event))))&&((this.metadata_json == rhs.metadata_json)||((this.metadata_json!= null)&&this.metadata_json.equals(rhs.metadata_json))));
    }

}
