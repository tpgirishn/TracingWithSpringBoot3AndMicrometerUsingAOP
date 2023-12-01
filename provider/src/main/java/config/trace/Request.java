
package config.trace;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The request being responded to. This couples the request data with the response event avoiding the need for joins or external data dependencies. In many cases the data must be coupled with this event because it is represented as a single event (nginx, apache web server, and other reverse proxy servers).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "host",
    "method",
    "path",
    "scheme"
})
public class Request {

    /**
     * The target host of the HTTP request. This may not be the same as the real hostname of the server.
     * 
     */
    @JsonProperty("host")
    @JsonPropertyDescription("The target host of the HTTP request. This may not be the same as the real hostname of the server.")
    private String host;
    /**
     * The HTTP method for the request.
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
     * The HTTP request scheme.
     * 
     */
    @JsonProperty("scheme")
    @JsonPropertyDescription("The HTTP request scheme.")
    private config.trace.Http_request.Http_scheme scheme;

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

    public Request withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * The HTTP method for the request.
     * 
     */
    @JsonProperty("method")
    public config.trace.Http.Http_method getMethod() {
        return method;
    }

    /**
     * The HTTP method for the request.
     * 
     */
    @JsonProperty("method")
    public void setMethod(config.trace.Http.Http_method method) {
        this.method = method;
    }

    public Request withMethod(config.trace.Http.Http_method method) {
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

    public Request withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * The HTTP request scheme.
     * 
     */
    @JsonProperty("scheme")
    public config.trace.Http_request.Http_scheme getScheme() {
        return scheme;
    }

    /**
     * The HTTP request scheme.
     * 
     */
    @JsonProperty("scheme")
    public void setScheme(config.trace.Http_request.Http_scheme scheme) {
        this.scheme = scheme;
    }

    public Request withScheme(config.trace.Http_request.Http_scheme scheme) {
        this.scheme = scheme;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Request.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
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
        sb.append("scheme");
        sb.append('=');
        sb.append(((this.scheme == null)?"<null>":this.scheme));
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
        result = ((result* 31)+((this.method == null)? 0 :this.method.hashCode()));
        result = ((result* 31)+((this.scheme == null)? 0 :this.scheme.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Request) == false) {
            return false;
        }
        Request rhs = ((Request) other);
        return (((((this.host == rhs.host)||((this.host!= null)&&this.host.equals(rhs.host)))&&((this.path == rhs.path)||((this.path!= null)&&this.path.equals(rhs.path))))&&((this.method == rhs.method)||((this.method!= null)&&this.method.equals(rhs.method))))&&((this.scheme == rhs.scheme)||((this.scheme!= null)&&this.scheme.equals(rhs.scheme))));
    }

}
