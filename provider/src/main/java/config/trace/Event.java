
package config.trace;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A controlled representation of the event this log line represents.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "channel_join",
    "channel_receive",
    "controller_call",
    "custom",
    "error",
    "http_request",
    "http_response",
    "resource_sample",
    "sql_query",
    "template_render"
})
public class Event {

    /**
     * Represents the joining of a multi-plexed websocket channel.
     * 
     */
    @JsonProperty("channel_join")
    @JsonPropertyDescription("Represents the joining of a multi-plexed websocket channel.")
    private Channel_join channel_join;
    /**
     * Represents the receiption of an event on a multi-plexed websocket channel.
     * 
     */
    @JsonProperty("channel_receive")
    @JsonPropertyDescription("Represents the receiption of an event on a multi-plexed websocket channel.")
    private Channel_receive channel_receive;
    /**
     * Represents the calling of a controller, typically logged immediately after the request is routed.
     * 
     */
    @JsonProperty("controller_call")
    @JsonPropertyDescription("Represents the calling of a controller, typically logged immediately after the request is routed.")
    private Controller_call controller_call;
    /**
     * An open ended object used for custom event data. Only a single root key is allowed, this represents the event type and avoids type collisions in the context of the entire schema.
     * 
     */
    @JsonProperty("custom")
    @JsonPropertyDescription("An open ended object used for custom event data. Only a single root key is allowed, this represents the event type and avoids type collisions in the context of the entire schema.")
    private Custom__1 custom;
    /**
     * Represents an error or exception.
     * 
     */
    @JsonProperty("error")
    @JsonPropertyDescription("Represents an error or exception.")
    private Error error;
    /**
     * Represents a HTTP request, both incoming and outgoing. Note the direction field.
     * 
     */
    @JsonProperty("http_request")
    @JsonPropertyDescription("Represents a HTTP request, both incoming and outgoing. Note the direction field.")
    private Http_request http_request;
    /**
     * Represents a HTTP response event, both outgoing and incoming. Note the direction field.
     * 
     */
    @JsonProperty("http_response")
    @JsonPropertyDescription("Represents a HTTP response event, both outgoing and incoming. Note the direction field.")
    private Http_response http_response;
    /**
     * Represents a resource usage sample for a target server, application, or both.
     * 
     */
    @JsonProperty("resource_sample")
    @JsonPropertyDescription("Represents a resource usage sample for a target server, application, or both.")
    private Resource_sample resource_sample;
    /**
     * An outgoing SQL query sent from the application.
     * 
     */
    @JsonProperty("sql_query")
    @JsonPropertyDescription("An outgoing SQL query sent from the application.")
    private Sql_query sql_query;
    /**
     * Rendering a template to be sent to the client via the HTTP response.
     * 
     */
    @JsonProperty("template_render")
    @JsonPropertyDescription("Rendering a template to be sent to the client via the HTTP response.")
    private Template_render template_render;

    /**
     * Represents the joining of a multi-plexed websocket channel.
     * 
     */
    @JsonProperty("channel_join")
    public Channel_join getChannel_join() {
        return channel_join;
    }

    /**
     * Represents the joining of a multi-plexed websocket channel.
     * 
     */
    @JsonProperty("channel_join")
    public void setChannel_join(Channel_join channel_join) {
        this.channel_join = channel_join;
    }

    public Event withChannel_join(Channel_join channel_join) {
        this.channel_join = channel_join;
        return this;
    }

    /**
     * Represents the receiption of an event on a multi-plexed websocket channel.
     * 
     */
    @JsonProperty("channel_receive")
    public Channel_receive getChannel_receive() {
        return channel_receive;
    }

    /**
     * Represents the receiption of an event on a multi-plexed websocket channel.
     * 
     */
    @JsonProperty("channel_receive")
    public void setChannel_receive(Channel_receive channel_receive) {
        this.channel_receive = channel_receive;
    }

    public Event withChannel_receive(Channel_receive channel_receive) {
        this.channel_receive = channel_receive;
        return this;
    }

    /**
     * Represents the calling of a controller, typically logged immediately after the request is routed.
     * 
     */
    @JsonProperty("controller_call")
    public Controller_call getController_call() {
        return controller_call;
    }

    /**
     * Represents the calling of a controller, typically logged immediately after the request is routed.
     * 
     */
    @JsonProperty("controller_call")
    public void setController_call(Controller_call controller_call) {
        this.controller_call = controller_call;
    }

    public Event withController_call(Controller_call controller_call) {
        this.controller_call = controller_call;
        return this;
    }

    /**
     * An open ended object used for custom event data. Only a single root key is allowed, this represents the event type and avoids type collisions in the context of the entire schema.
     * 
     */
    @JsonProperty("custom")
    public Custom__1 getCustom() {
        return custom;
    }

    /**
     * An open ended object used for custom event data. Only a single root key is allowed, this represents the event type and avoids type collisions in the context of the entire schema.
     * 
     */
    @JsonProperty("custom")
    public void setCustom(Custom__1 custom) {
        this.custom = custom;
    }

    public Event withCustom(Custom__1 custom) {
        this.custom = custom;
        return this;
    }

    /**
     * Represents an error or exception.
     * 
     */
    @JsonProperty("error")
    public Error getError() {
        return error;
    }

    /**
     * Represents an error or exception.
     * 
     */
    @JsonProperty("error")
    public void setError(Error error) {
        this.error = error;
    }

    public Event withError(Error error) {
        this.error = error;
        return this;
    }

    /**
     * Represents a HTTP request, both incoming and outgoing. Note the direction field.
     * 
     */
    @JsonProperty("http_request")
    public Http_request getHttp_request() {
        return http_request;
    }

    /**
     * Represents a HTTP request, both incoming and outgoing. Note the direction field.
     * 
     */
    @JsonProperty("http_request")
    public void setHttp_request(Http_request http_request) {
        this.http_request = http_request;
    }

    public Event withHttp_request(Http_request http_request) {
        this.http_request = http_request;
        return this;
    }

    /**
     * Represents a HTTP response event, both outgoing and incoming. Note the direction field.
     * 
     */
    @JsonProperty("http_response")
    public Http_response getHttp_response() {
        return http_response;
    }

    /**
     * Represents a HTTP response event, both outgoing and incoming. Note the direction field.
     * 
     */
    @JsonProperty("http_response")
    public void setHttp_response(Http_response http_response) {
        this.http_response = http_response;
    }

    public Event withHttp_response(Http_response http_response) {
        this.http_response = http_response;
        return this;
    }

    /**
     * Represents a resource usage sample for a target server, application, or both.
     * 
     */
    @JsonProperty("resource_sample")
    public Resource_sample getResource_sample() {
        return resource_sample;
    }

    /**
     * Represents a resource usage sample for a target server, application, or both.
     * 
     */
    @JsonProperty("resource_sample")
    public void setResource_sample(Resource_sample resource_sample) {
        this.resource_sample = resource_sample;
    }

    public Event withResource_sample(Resource_sample resource_sample) {
        this.resource_sample = resource_sample;
        return this;
    }

    /**
     * An outgoing SQL query sent from the application.
     * 
     */
    @JsonProperty("sql_query")
    public Sql_query getSql_query() {
        return sql_query;
    }

    /**
     * An outgoing SQL query sent from the application.
     * 
     */
    @JsonProperty("sql_query")
    public void setSql_query(Sql_query sql_query) {
        this.sql_query = sql_query;
    }

    public Event withSql_query(Sql_query sql_query) {
        this.sql_query = sql_query;
        return this;
    }

    /**
     * Rendering a template to be sent to the client via the HTTP response.
     * 
     */
    @JsonProperty("template_render")
    public Template_render getTemplate_render() {
        return template_render;
    }

    /**
     * Rendering a template to be sent to the client via the HTTP response.
     * 
     */
    @JsonProperty("template_render")
    public void setTemplate_render(Template_render template_render) {
        this.template_render = template_render;
    }

    public Event withTemplate_render(Template_render template_render) {
        this.template_render = template_render;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Event.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("channel_join");
        sb.append('=');
        sb.append(((this.channel_join == null)?"<null>":this.channel_join));
        sb.append(',');
        sb.append("channel_receive");
        sb.append('=');
        sb.append(((this.channel_receive == null)?"<null>":this.channel_receive));
        sb.append(',');
        sb.append("controller_call");
        sb.append('=');
        sb.append(((this.controller_call == null)?"<null>":this.controller_call));
        sb.append(',');
        sb.append("custom");
        sb.append('=');
        sb.append(((this.custom == null)?"<null>":this.custom));
        sb.append(',');
        sb.append("error");
        sb.append('=');
        sb.append(((this.error == null)?"<null>":this.error));
        sb.append(',');
        sb.append("http_request");
        sb.append('=');
        sb.append(((this.http_request == null)?"<null>":this.http_request));
        sb.append(',');
        sb.append("http_response");
        sb.append('=');
        sb.append(((this.http_response == null)?"<null>":this.http_response));
        sb.append(',');
        sb.append("resource_sample");
        sb.append('=');
        sb.append(((this.resource_sample == null)?"<null>":this.resource_sample));
        sb.append(',');
        sb.append("sql_query");
        sb.append('=');
        sb.append(((this.sql_query == null)?"<null>":this.sql_query));
        sb.append(',');
        sb.append("template_render");
        sb.append('=');
        sb.append(((this.template_render == null)?"<null>":this.template_render));
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
        result = ((result* 31)+((this.http_response == null)? 0 :this.http_response.hashCode()));
        result = ((result* 31)+((this.channel_join == null)? 0 :this.channel_join.hashCode()));
        result = ((result* 31)+((this.controller_call == null)? 0 :this.controller_call.hashCode()));
        result = ((result* 31)+((this.custom == null)? 0 :this.custom.hashCode()));
        result = ((result* 31)+((this.sql_query == null)? 0 :this.sql_query.hashCode()));
        result = ((result* 31)+((this.template_render == null)? 0 :this.template_render.hashCode()));
        result = ((result* 31)+((this.channel_receive == null)? 0 :this.channel_receive.hashCode()));
        result = ((result* 31)+((this.http_request == null)? 0 :this.http_request.hashCode()));
        result = ((result* 31)+((this.error == null)? 0 :this.error.hashCode()));
        result = ((result* 31)+((this.resource_sample == null)? 0 :this.resource_sample.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Event) == false) {
            return false;
        }
        Event rhs = ((Event) other);
        return (((((((((((this.http_response == rhs.http_response)||((this.http_response!= null)&&this.http_response.equals(rhs.http_response)))&&((this.channel_join == rhs.channel_join)||((this.channel_join!= null)&&this.channel_join.equals(rhs.channel_join))))&&((this.controller_call == rhs.controller_call)||((this.controller_call!= null)&&this.controller_call.equals(rhs.controller_call))))&&((this.custom == rhs.custom)||((this.custom!= null)&&this.custom.equals(rhs.custom))))&&((this.sql_query == rhs.sql_query)||((this.sql_query!= null)&&this.sql_query.equals(rhs.sql_query))))&&((this.template_render == rhs.template_render)||((this.template_render!= null)&&this.template_render.equals(rhs.template_render))))&&((this.channel_receive == rhs.channel_receive)||((this.channel_receive!= null)&&this.channel_receive.equals(rhs.channel_receive))))&&((this.http_request == rhs.http_request)||((this.http_request!= null)&&this.http_request.equals(rhs.http_request))))&&((this.error == rhs.error)||((this.error!= null)&&this.error.equals(rhs.error))))&&((this.resource_sample == rhs.resource_sample)||((this.resource_sample!= null)&&this.resource_sample.equals(rhs.resource_sample))));
    }

}
