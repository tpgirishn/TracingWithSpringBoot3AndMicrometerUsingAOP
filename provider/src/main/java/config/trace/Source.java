
package config.trace;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Context about the source of the log
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "file_name"
})
public class Source {

    /**
     * The name of the file the log was read from (e.g., "nodejs.log")
     * 
     */
    @JsonProperty("file_name")
    @JsonPropertyDescription("The name of the file the log was read from (e.g., \"nodejs.log\")")
    private String file_name;

    /**
     * The name of the file the log was read from (e.g., "nodejs.log")
     * 
     */
    @JsonProperty("file_name")
    public String getFile_name() {
        return file_name;
    }

    /**
     * The name of the file the log was read from (e.g., "nodejs.log")
     * 
     */
    @JsonProperty("file_name")
    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public Source withFile_name(String file_name) {
        this.file_name = file_name;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Source.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("file_name");
        sb.append('=');
        sb.append(((this.file_name == null)?"<null>":this.file_name));
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
        result = ((result* 31)+((this.file_name == null)? 0 :this.file_name.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Source) == false) {
            return false;
        }
        Source rhs = ((Source) other);
        return ((this.file_name == rhs.file_name)||((this.file_name!= null)&&this.file_name.equals(rhs.file_name)));
    }

}
