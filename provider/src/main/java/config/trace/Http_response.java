
package config.trace;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Represents a HTTP response event, both outgoing and incoming. Note the direction field.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "body",
    "content_length",
    "direction",
    "headers",
    "headers_json",
    "request_id",
    "service_name",
    "status",
    "time_ms",
    "request"
})
public class Http_response {

    /**
     * The body of the HTTP request / response.
     * 
     */
    @JsonProperty("body")
    @JsonPropertyDescription("The body of the HTTP request / response.")
    private String body;
    /**
     * The value of the Content-Length header representing the size of the request in decimal number of octets.
     * 
     */
    @JsonProperty("content_length")
    @JsonPropertyDescription("The value of the Content-Length header representing the size of the request in decimal number of octets.")
    private Integer content_length;
    /**
     * The direction of the HTTP request and response (incoming or outgoing).
     * 
     */
    @JsonProperty("direction")
    @JsonPropertyDescription("The direction of the HTTP request and response (incoming or outgoing).")
    private config.trace.Http_request.Http_direction direction;
    /**
     * An object representing *select* HTTP headers that need to be searched or graphed.
     * 
     */
    @JsonProperty("headers")
    @JsonPropertyDescription("An object representing *select* HTTP headers that need to be searched or graphed.")
    private Http_headers headers;
    /**
     * An encoded JSON string representing *all* HTTP headers. This is used for request inspection without the overhead of creating and indexing fields for every header.
     * 
     */
    @JsonProperty("headers_json")
    @JsonPropertyDescription("An encoded JSON string representing *all* HTTP headers. This is used for request inspection without the overhead of creating and indexing fields for every header.")
    private String headers_json;
    /**
     * An ID that uniquely identifies the request and can be used to trace requests.
     * 
     */
    @JsonProperty("request_id")
    @JsonPropertyDescription("An ID that uniquely identifies the request and can be used to trace requests.")
    private String request_id;
    /**
     * A short label / name for the service you are sending the request to, ex: elasticsearch
     * 
     */
    @JsonProperty("service_name")
    @JsonPropertyDescription("A short label / name for the service you are sending the request to, ex: elasticsearch")
    private String service_name;
    /**
     * The status as defined by the HTTP status codes.
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status as defined by the HTTP status codes.")
    private Integer status;
    /**
     * The duration, in fractional milliseconds, that it took to complete this event.
     * 
     */
    @JsonProperty("time_ms")
    @JsonPropertyDescription("The duration, in fractional milliseconds, that it took to complete this event.")
    private Double time_ms;
    /**
     * The request being responded to. This couples the request data with the response event avoiding the need for joins or external data dependencies. In many cases the data must be coupled with this event because it is represented as a single event (nginx, apache web server, and other reverse proxy servers).
     * 
     */
    @JsonProperty("request")
    @JsonPropertyDescription("The request being responded to. This couples the request data with the response event avoiding the need for joins or external data dependencies. In many cases the data must be coupled with this event because it is represented as a single event (nginx, apache web server, and other reverse proxy servers).")
    private Request request;

    /**
     * The body of the HTTP request / response.
     * 
     */
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    /**
     * The body of the HTTP request / response.
     * 
     */
    @JsonProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    public Http_response withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * The value of the Content-Length header representing the size of the request in decimal number of octets.
     * 
     */
    @JsonProperty("content_length")
    public Integer getContent_length() {
        return content_length;
    }

    /**
     * The value of the Content-Length header representing the size of the request in decimal number of octets.
     * 
     */
    @JsonProperty("content_length")
    public void setContent_length(Integer content_length) {
        this.content_length = content_length;
    }

    public Http_response withContent_length(Integer content_length) {
        this.content_length = content_length;
        return this;
    }

    /**
     * The direction of the HTTP request and response (incoming or outgoing).
     * 
     */
    @JsonProperty("direction")
    public config.trace.Http_request.Http_direction getDirection() {
        return direction;
    }

    /**
     * The direction of the HTTP request and response (incoming or outgoing).
     * 
     */
    @JsonProperty("direction")
    public void setDirection(config.trace.Http_request.Http_direction direction) {
        this.direction = direction;
    }

    public Http_response withDirection(config.trace.Http_request.Http_direction direction) {
        this.direction = direction;
        return this;
    }

    /**
     * An object representing *select* HTTP headers that need to be searched or graphed.
     * 
     */
    @JsonProperty("headers")
    public Http_headers getHeaders() {
        return headers;
    }

    /**
     * An object representing *select* HTTP headers that need to be searched or graphed.
     * 
     */
    @JsonProperty("headers")
    public void setHeaders(Http_headers headers) {
        this.headers = headers;
    }

    public Http_response withHeaders(Http_headers headers) {
        this.headers = headers;
        return this;
    }

    /**
     * An encoded JSON string representing *all* HTTP headers. This is used for request inspection without the overhead of creating and indexing fields for every header.
     * 
     */
    @JsonProperty("headers_json")
    public String getHeaders_json() {
        return headers_json;
    }

    /**
     * An encoded JSON string representing *all* HTTP headers. This is used for request inspection without the overhead of creating and indexing fields for every header.
     * 
     */
    @JsonProperty("headers_json")
    public void setHeaders_json(String headers_json) {
        this.headers_json = headers_json;
    }

    public Http_response withHeaders_json(String headers_json) {
        this.headers_json = headers_json;
        return this;
    }

    /**
     * An ID that uniquely identifies the request and can be used to trace requests.
     * 
     */
    @JsonProperty("request_id")
    public String getRequest_id() {
        return request_id;
    }

    /**
     * An ID that uniquely identifies the request and can be used to trace requests.
     * 
     */
    @JsonProperty("request_id")
    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public Http_response withRequest_id(String request_id) {
        this.request_id = request_id;
        return this;
    }

    /**
     * A short label / name for the service you are sending the request to, ex: elasticsearch
     * 
     */
    @JsonProperty("service_name")
    public String getService_name() {
        return service_name;
    }

    /**
     * A short label / name for the service you are sending the request to, ex: elasticsearch
     * 
     */
    @JsonProperty("service_name")
    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public Http_response withService_name(String service_name) {
        this.service_name = service_name;
        return this;
    }

    /**
     * The status as defined by the HTTP status codes.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public Integer getStatus() {
        return status;
    }

    /**
     * The status as defined by the HTTP status codes.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    public Http_response withStatus(Integer status) {
        this.status = status;
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

    public Http_response withTime_ms(Double time_ms) {
        this.time_ms = time_ms;
        return this;
    }

    /**
     * The request being responded to. This couples the request data with the response event avoiding the need for joins or external data dependencies. In many cases the data must be coupled with this event because it is represented as a single event (nginx, apache web server, and other reverse proxy servers).
     * 
     */
    @JsonProperty("request")
    public Request getRequest() {
        return request;
    }

    /**
     * The request being responded to. This couples the request data with the response event avoiding the need for joins or external data dependencies. In many cases the data must be coupled with this event because it is represented as a single event (nginx, apache web server, and other reverse proxy servers).
     * 
     */
    @JsonProperty("request")
    public void setRequest(Request request) {
        this.request = request;
    }

    public Http_response withRequest(Request request) {
        this.request = request;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Http_response.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("body");
        sb.append('=');
        sb.append(((this.body == null)?"<null>":this.body));
        sb.append(',');
        sb.append("content_length");
        sb.append('=');
        sb.append(((this.content_length == null)?"<null>":this.content_length));
        sb.append(',');
        sb.append("direction");
        sb.append('=');
        sb.append(((this.direction == null)?"<null>":this.direction));
        sb.append(',');
        sb.append("headers");
        sb.append('=');
        sb.append(((this.headers == null)?"<null>":this.headers));
        sb.append(',');
        sb.append("headers_json");
        sb.append('=');
        sb.append(((this.headers_json == null)?"<null>":this.headers_json));
        sb.append(',');
        sb.append("request_id");
        sb.append('=');
        sb.append(((this.request_id == null)?"<null>":this.request_id));
        sb.append(',');
        sb.append("service_name");
        sb.append('=');
        sb.append(((this.service_name == null)?"<null>":this.service_name));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("time_ms");
        sb.append('=');
        sb.append(((this.time_ms == null)?"<null>":this.time_ms));
        sb.append(',');
        sb.append("request");
        sb.append('=');
        sb.append(((this.request == null)?"<null>":this.request));
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
        result = ((result* 31)+((this.headers == null)? 0 :this.headers.hashCode()));
        result = ((result* 31)+((this.request == null)? 0 :this.request.hashCode()));
        result = ((result* 31)+((this.service_name == null)? 0 :this.service_name.hashCode()));
        result = ((result* 31)+((this.time_ms == null)? 0 :this.time_ms.hashCode()));
        result = ((result* 31)+((this.headers_json == null)? 0 :this.headers_json.hashCode()));
        result = ((result* 31)+((this.body == null)? 0 :this.body.hashCode()));
        result = ((result* 31)+((this.request_id == null)? 0 :this.request_id.hashCode()));
        result = ((result* 31)+((this.content_length == null)? 0 :this.content_length.hashCode()));
        result = ((result* 31)+((this.direction == null)? 0 :this.direction.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Http_response) == false) {
            return false;
        }
        Http_response rhs = ((Http_response) other);
        return (((((((((((this.headers == rhs.headers)||((this.headers!= null)&&this.headers.equals(rhs.headers)))&&((this.request == rhs.request)||((this.request!= null)&&this.request.equals(rhs.request))))&&((this.service_name == rhs.service_name)||((this.service_name!= null)&&this.service_name.equals(rhs.service_name))))&&((this.time_ms == rhs.time_ms)||((this.time_ms!= null)&&this.time_ms.equals(rhs.time_ms))))&&((this.headers_json == rhs.headers_json)||((this.headers_json!= null)&&this.headers_json.equals(rhs.headers_json))))&&((this.body == rhs.body)||((this.body!= null)&&this.body.equals(rhs.body))))&&((this.request_id == rhs.request_id)||((this.request_id!= null)&&this.request_id.equals(rhs.request_id))))&&((this.content_length == rhs.content_length)||((this.content_length!= null)&&this.content_length.equals(rhs.content_length))))&&((this.direction == rhs.direction)||((this.direction!= null)&&this.direction.equals(rhs.direction))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
