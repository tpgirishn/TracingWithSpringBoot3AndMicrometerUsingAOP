
package config.trace;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "app_name",
    "file",
    "function",
    "line"
})
public class Backtrace {

    /**
     * Application name, if applicable. For example, erlang / elixir have multiple apps within the same umbrella project.
     * 
     */
    @JsonProperty("app_name")
    @JsonPropertyDescription("Application name, if applicable. For example, erlang / elixir have multiple apps within the same umbrella project.")
    private String app_name;
    /**
     * The line file path.
     * (Required)
     * 
     */
    @JsonProperty("file")
    @JsonPropertyDescription("The line file path.")
    private String file;
    /**
     * The calling function name.
     * (Required)
     * 
     */
    @JsonProperty("function")
    @JsonPropertyDescription("The calling function name.")
    private String function;
    /**
     * The calling line number.
     * (Required)
     * 
     */
    @JsonProperty("line")
    @JsonPropertyDescription("The calling line number.")
    private Integer line;

    /**
     * Application name, if applicable. For example, erlang / elixir have multiple apps within the same umbrella project.
     * 
     */
    @JsonProperty("app_name")
    public String getApp_name() {
        return app_name;
    }

    /**
     * Application name, if applicable. For example, erlang / elixir have multiple apps within the same umbrella project.
     * 
     */
    @JsonProperty("app_name")
    public void setApp_name(String app_name) {
        this.app_name = app_name;
    }

    public Backtrace withApp_name(String app_name) {
        this.app_name = app_name;
        return this;
    }

    /**
     * The line file path.
     * (Required)
     * 
     */
    @JsonProperty("file")
    public String getFile() {
        return file;
    }

    /**
     * The line file path.
     * (Required)
     * 
     */
    @JsonProperty("file")
    public void setFile(String file) {
        this.file = file;
    }

    public Backtrace withFile(String file) {
        this.file = file;
        return this;
    }

    /**
     * The calling function name.
     * (Required)
     * 
     */
    @JsonProperty("function")
    public String getFunction() {
        return function;
    }

    /**
     * The calling function name.
     * (Required)
     * 
     */
    @JsonProperty("function")
    public void setFunction(String function) {
        this.function = function;
    }

    public Backtrace withFunction(String function) {
        this.function = function;
        return this;
    }

    /**
     * The calling line number.
     * (Required)
     * 
     */
    @JsonProperty("line")
    public Integer getLine() {
        return line;
    }

    /**
     * The calling line number.
     * (Required)
     * 
     */
    @JsonProperty("line")
    public void setLine(Integer line) {
        this.line = line;
    }

    public Backtrace withLine(Integer line) {
        this.line = line;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Backtrace.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("app_name");
        sb.append('=');
        sb.append(((this.app_name == null)?"<null>":this.app_name));
        sb.append(',');
        sb.append("file");
        sb.append('=');
        sb.append(((this.file == null)?"<null>":this.file));
        sb.append(',');
        sb.append("function");
        sb.append('=');
        sb.append(((this.function == null)?"<null>":this.function));
        sb.append(',');
        sb.append("line");
        sb.append('=');
        sb.append(((this.line == null)?"<null>":this.line));
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
        result = ((result* 31)+((this.app_name == null)? 0 :this.app_name.hashCode()));
        result = ((result* 31)+((this.file == null)? 0 :this.file.hashCode()));
        result = ((result* 31)+((this.line == null)? 0 :this.line.hashCode()));
        result = ((result* 31)+((this.function == null)? 0 :this.function.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Backtrace) == false) {
            return false;
        }
        Backtrace rhs = ((Backtrace) other);
        return (((((this.app_name == rhs.app_name)||((this.app_name!= null)&&this.app_name.equals(rhs.app_name)))&&((this.file == rhs.file)||((this.file!= null)&&this.file.equals(rhs.file))))&&((this.line == rhs.line)||((this.line!= null)&&this.line.equals(rhs.line))))&&((this.function == rhs.function)||((this.function!= null)&&this.function.equals(rhs.function))));
    }

}
