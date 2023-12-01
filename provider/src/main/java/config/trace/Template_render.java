
package config.trace;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Rendering a template to be sent to the client via the HTTP response.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "time_ms"
})
public class Template_render {

    /**
     * The unique name of the template. This generally includes the path.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The unique name of the template. This generally includes the path.")
    private String name;
    /**
     * The duration, in fractional milliseconds, that it took to complete this event.
     * (Required)
     * 
     */
    @JsonProperty("time_ms")
    @JsonPropertyDescription("The duration, in fractional milliseconds, that it took to complete this event.")
    private Double time_ms;

    /**
     * The unique name of the template. This generally includes the path.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The unique name of the template. This generally includes the path.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Template_render withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The duration, in fractional milliseconds, that it took to complete this event.
     * (Required)
     * 
     */
    @JsonProperty("time_ms")
    public Double getTime_ms() {
        return time_ms;
    }

    /**
     * The duration, in fractional milliseconds, that it took to complete this event.
     * (Required)
     * 
     */
    @JsonProperty("time_ms")
    public void setTime_ms(Double time_ms) {
        this.time_ms = time_ms;
    }

    public Template_render withTime_ms(Double time_ms) {
        this.time_ms = time_ms;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Template_render.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("time_ms");
        sb.append('=');
        sb.append(((this.time_ms == null)?"<null>":this.time_ms));
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
        result = ((result* 31)+((this.time_ms == null)? 0 :this.time_ms.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Template_render) == false) {
            return false;
        }
        Template_render rhs = ((Template_render) other);
        return (((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.time_ms == rhs.time_ms)||((this.time_ms!= null)&&this.time_ms.equals(rhs.time_ms))));
    }

}
