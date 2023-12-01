
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
 * Context about the HTTP request currently being processed (if any)
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "host",
    "method",
    "path",
    "remote_addr",
    "request_id"
})
public class Http {

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
    private Http.Http_method method;
    /**
     * The path of the HTTP request.
     * 
     */
    @JsonProperty("path")
    @JsonPropertyDescription("The path of the HTTP request.")
    private String path;
    /**
     * The IP address of the computer that issued the request.
     * 
     */
    @JsonProperty("remote_addr")
    @JsonPropertyDescription("The IP address of the computer that issued the request.")
    private String remote_addr;
    /**
     * An ID that uniquely identifies the request and can be used to trace requests.
     * 
     */
    @JsonProperty("request_id")
    @JsonPropertyDescription("An ID that uniquely identifies the request and can be used to trace requests.")
    private String request_id;

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

    public Http withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * The HTTP method for the request.
     * (Required)
     * 
     */
    @JsonProperty("method")
    public Http.Http_method getMethod() {
        return method;
    }

    /**
     * The HTTP method for the request.
     * (Required)
     * 
     */
    @JsonProperty("method")
    public void setMethod(Http.Http_method method) {
        this.method = method;
    }

    public Http withMethod(Http.Http_method method) {
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

    public Http withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * The IP address of the computer that issued the request.
     * 
     */
    @JsonProperty("remote_addr")
    public String getRemote_addr() {
        return remote_addr;
    }

    /**
     * The IP address of the computer that issued the request.
     * 
     */
    @JsonProperty("remote_addr")
    public void setRemote_addr(String remote_addr) {
        this.remote_addr = remote_addr;
    }

    public Http withRemote_addr(String remote_addr) {
        this.remote_addr = remote_addr;
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

    public Http withRequest_id(String request_id) {
        this.request_id = request_id;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Http.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
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
        sb.append("remote_addr");
        sb.append('=');
        sb.append(((this.remote_addr == null)?"<null>":this.remote_addr));
        sb.append(',');
        sb.append("request_id");
        sb.append('=');
        sb.append(((this.request_id == null)?"<null>":this.request_id));
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
        result = ((result* 31)+((this.host == null)? 0 :this.host.hashCode()));
        result = ((result* 31)+((this.path == null)? 0 :this.path.hashCode()));
        result = ((result* 31)+((this.remote_addr == null)? 0 :this.remote_addr.hashCode()));
        result = ((result* 31)+((this.method == null)? 0 :this.method.hashCode()));
        result = ((result* 31)+((this.request_id == null)? 0 :this.request_id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Http) == false) {
            return false;
        }
        Http rhs = ((Http) other);
        return ((((((this.host == rhs.host)||((this.host!= null)&&this.host.equals(rhs.host)))&&((this.path == rhs.path)||((this.path!= null)&&this.path.equals(rhs.path))))&&((this.remote_addr == rhs.remote_addr)||((this.remote_addr!= null)&&this.remote_addr.equals(rhs.remote_addr))))&&((this.method == rhs.method)||((this.method!= null)&&this.method.equals(rhs.method))))&&((this.request_id == rhs.request_id)||((this.request_id!= null)&&this.request_id.equals(rhs.request_id))));
    }


    /**
     * The HTTP method for the request.
     * 
     */
    public enum Http_method {

        CONNECT("CONNECT"),
        DELETE("DELETE"),
        GET("GET"),
        HEAD("HEAD"),
        OPTIONS("OPTIONS"),
        PATCH("PATCH"),
        POST("POST"),
        PUT("PUT"),
        TRACE("TRACE");
        private final String value;
        private final static Map<String, Http.Http_method> CONSTANTS = new HashMap<String, Http.Http_method>();

        static {
            for (Http.Http_method c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Http_method(String value) {
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
        public static Http.Http_method fromValue(String value) {
            Http.Http_method constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
