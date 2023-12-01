
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
 * Represents a HTTP request, both incoming and outgoing. Note the direction field.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "body",
    "content_length",
    "direction",
    "headers",
    "headers_json",
    "host",
    "method",
    "path",
    "port",
    "query_string",
    "request_id",
    "scheme",
    "service_name"
})
public class Http_request {

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
    private Http_request.Http_direction direction;
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
     * The target host of the HTTP request. This may not be the same as the real hostname of the server.
     * 
     */
    @JsonProperty("host")
    @JsonPropertyDescription("The target host of the HTTP request. This may not be the same as the real hostname of the server.")
    private String host;
    /**
     * The HTTP method for the request.
     * (Required)
     * 
     */
    @JsonProperty("method")
    @JsonPropertyDescription("The HTTP method for the request.")
    private config.trace.Http.Http_method method;
    /**
     * The path of the HTTP request.
     * 
     */
    @JsonProperty("path")
    @JsonPropertyDescription("The path of the HTTP request.")
    private String path;
    /**
     * The target port of the HTTP request. This may be different than the port the server is listening on.
     * 
     */
    @JsonProperty("port")
    @JsonPropertyDescription("The target port of the HTTP request. This may be different than the port the server is listening on.")
    private Integer port;
    /**
     * The query parameters present on the URL.
     * 
     */
    @JsonProperty("query_string")
    @JsonPropertyDescription("The query parameters present on the URL.")
    private String query_string;
    /**
     * An ID that uniquely identifies the request and can be used to trace requests.
     * 
     */
    @JsonProperty("request_id")
    @JsonPropertyDescription("An ID that uniquely identifies the request and can be used to trace requests.")
    private String request_id;
    /**
     * The HTTP request scheme.
     * 
     */
    @JsonProperty("scheme")
    @JsonPropertyDescription("The HTTP request scheme.")
    private Http_request.Http_scheme scheme;
    /**
     * A short label / name for the service you are sending the request to, ex: elasticsearch
     * 
     */
    @JsonProperty("service_name")
    @JsonPropertyDescription("A short label / name for the service you are sending the request to, ex: elasticsearch")
    private String service_name;

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

    public Http_request withBody(String body) {
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

    public Http_request withContent_length(Integer content_length) {
        this.content_length = content_length;
        return this;
    }

    /**
     * The direction of the HTTP request and response (incoming or outgoing).
     * 
     */
    @JsonProperty("direction")
    public Http_request.Http_direction getDirection() {
        return direction;
    }

    /**
     * The direction of the HTTP request and response (incoming or outgoing).
     * 
     */
    @JsonProperty("direction")
    public void setDirection(Http_request.Http_direction direction) {
        this.direction = direction;
    }

    public Http_request withDirection(Http_request.Http_direction direction) {
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

    public Http_request withHeaders(Http_headers headers) {
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

    public Http_request withHeaders_json(String headers_json) {
        this.headers_json = headers_json;
        return this;
    }

    /**
     * The target host of the HTTP request. This may not be the same as the real hostname of the server.
     * 
     */
    @JsonProperty("host")
    public String getHost() {
        return host;
    }

    /**
     * The target host of the HTTP request. This may not be the same as the real hostname of the server.
     * 
     */
    @JsonProperty("host")
    public void setHost(String host) {
        this.host = host;
    }

    public Http_request withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * The HTTP method for the request.
     * (Required)
     * 
     */
    @JsonProperty("method")
    public config.trace.Http.Http_method getMethod() {
        return method;
    }

    /**
     * The HTTP method for the request.
     * (Required)
     * 
     */
    @JsonProperty("method")
    public void setMethod(config.trace.Http.Http_method method) {
        this.method = method;
    }

    public Http_request withMethod(config.trace.Http.Http_method method) {
        this.method = method;
        return this;
    }

    /**
     * The path of the HTTP request.
     * 
     */
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    /**
     * The path of the HTTP request.
     * 
     */
    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    public Http_request withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * The target port of the HTTP request. This may be different than the port the server is listening on.
     * 
     */
    @JsonProperty("port")
    public Integer getPort() {
        return port;
    }

    /**
     * The target port of the HTTP request. This may be different than the port the server is listening on.
     * 
     */
    @JsonProperty("port")
    public void setPort(Integer port) {
        this.port = port;
    }

    public Http_request withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * The query parameters present on the URL.
     * 
     */
    @JsonProperty("query_string")
    public String getQuery_string() {
        return query_string;
    }

    /**
     * The query parameters present on the URL.
     * 
     */
    @JsonProperty("query_string")
    public void setQuery_string(String query_string) {
        this.query_string = query_string;
    }

    public Http_request withQuery_string(String query_string) {
        this.query_string = query_string;
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

    public Http_request withRequest_id(String request_id) {
        this.request_id = request_id;
        return this;
    }

    /**
     * The HTTP request scheme.
     * 
     */
    @JsonProperty("scheme")
    public Http_request.Http_scheme getScheme() {
        return scheme;
    }

    /**
     * The HTTP request scheme.
     * 
     */
    @JsonProperty("scheme")
    public void setScheme(Http_request.Http_scheme scheme) {
        this.scheme = scheme;
    }

    public Http_request withScheme(Http_request.Http_scheme scheme) {
        this.scheme = scheme;
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

    public Http_request withService_name(String service_name) {
        this.service_name = service_name;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Http_request.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
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
        sb.append("host");
        sb.append('=');
        sb.append(((this.host == null)?"<null>":this.host));
        sb.append(',');
        sb.append("method");
        sb.append('=');
        sb.append(((this.method == null)?"<null>":this.method));
        sb.append(',');
        sb.append("path");
        sb.append('=');
        sb.append(((this.path == null)?"<null>":this.path));
        sb.append(',');
        sb.append("port");
        sb.append('=');
        sb.append(((this.port == null)?"<null>":this.port));
        sb.append(',');
        sb.append("query_string");
        sb.append('=');
        sb.append(((this.query_string == null)?"<null>":this.query_string));
        sb.append(',');
        sb.append("request_id");
        sb.append('=');
        sb.append(((this.request_id == null)?"<null>":this.request_id));
        sb.append(',');
        sb.append("scheme");
        sb.append('=');
        sb.append(((this.scheme == null)?"<null>":this.scheme));
        sb.append(',');
        sb.append("service_name");
        sb.append('=');
        sb.append(((this.service_name == null)?"<null>":this.service_name));
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
        result = ((result* 31)+((this.method == null)? 0 :this.method.hashCode()));
        result = ((result* 31)+((this.scheme == null)? 0 :this.scheme.hashCode()));
        result = ((result* 31)+((this.service_name == null)? 0 :this.service_name.hashCode()));
        result = ((result* 31)+((this.body == null)? 0 :this.body.hashCode()));
        result = ((result* 31)+((this.path == null)? 0 :this.path.hashCode()));
        result = ((result* 31)+((this.port == null)? 0 :this.port.hashCode()));
        result = ((result* 31)+((this.host == null)? 0 :this.host.hashCode()));
        result = ((result* 31)+((this.headers_json == null)? 0 :this.headers_json.hashCode()));
        result = ((result* 31)+((this.request_id == null)? 0 :this.request_id.hashCode()));
        result = ((result* 31)+((this.content_length == null)? 0 :this.content_length.hashCode()));
        result = ((result* 31)+((this.query_string == null)? 0 :this.query_string.hashCode()));
        result = ((result* 31)+((this.direction == null)? 0 :this.direction.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Http_request) == false) {
            return false;
        }
        Http_request rhs = ((Http_request) other);
        return ((((((((((((((this.headers == rhs.headers)||((this.headers!= null)&&this.headers.equals(rhs.headers)))&&((this.method == rhs.method)||((this.method!= null)&&this.method.equals(rhs.method))))&&((this.scheme == rhs.scheme)||((this.scheme!= null)&&this.scheme.equals(rhs.scheme))))&&((this.service_name == rhs.service_name)||((this.service_name!= null)&&this.service_name.equals(rhs.service_name))))&&((this.body == rhs.body)||((this.body!= null)&&this.body.equals(rhs.body))))&&((this.path == rhs.path)||((this.path!= null)&&this.path.equals(rhs.path))))&&((this.port == rhs.port)||((this.port!= null)&&this.port.equals(rhs.port))))&&((this.host == rhs.host)||((this.host!= null)&&this.host.equals(rhs.host))))&&((this.headers_json == rhs.headers_json)||((this.headers_json!= null)&&this.headers_json.equals(rhs.headers_json))))&&((this.request_id == rhs.request_id)||((this.request_id!= null)&&this.request_id.equals(rhs.request_id))))&&((this.content_length == rhs.content_length)||((this.content_length!= null)&&this.content_length.equals(rhs.content_length))))&&((this.query_string == rhs.query_string)||((this.query_string!= null)&&this.query_string.equals(rhs.query_string))))&&((this.direction == rhs.direction)||((this.direction!= null)&&this.direction.equals(rhs.direction))));
    }


    /**
     * The direction of the HTTP request and response (incoming or outgoing).
     * 
     */
    public enum Http_direction {

        INCOMING("incoming"),
        OUTGOING("outgoing");
        private final String value;
        private final static Map<String, Http_request.Http_direction> CONSTANTS = new HashMap<String, Http_request.Http_direction>();

        static {
            for (Http_request.Http_direction c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Http_direction(String value) {
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
        public static Http_request.Http_direction fromValue(String value) {
            Http_request.Http_direction constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * The HTTP request scheme.
     * 
     */
    public enum Http_scheme {

        HTTP("http"),
        HTTPS("https");
        private final String value;
        private final static Map<String, Http_request.Http_scheme> CONSTANTS = new HashMap<String, Http_request.Http_scheme>();

        static {
            for (Http_request.Http_scheme c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Http_scheme(String value) {
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
        public static Http_request.Http_scheme fromValue(String value) {
            Http_request.Http_scheme constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
