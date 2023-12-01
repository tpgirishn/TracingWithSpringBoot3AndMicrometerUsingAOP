
package config.trace;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Represents the language runtime details.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "application",
    "class_name",
    "file",
    "function",
    "line",
    "module_name",
    "vm_pid"
})
public class Runtime {

    /**
     * The current application name
     * 
     */
    @JsonProperty("application")
    @JsonPropertyDescription("The current application name")
    private String application;
    /**
     * The current class name, if applicable.
     * 
     */
    @JsonProperty("class_name")
    @JsonPropertyDescription("The current class name, if applicable.")
    private String class_name;
    /**
     * The current file path from the root of the project.
     * 
     */
    @JsonProperty("file")
    @JsonPropertyDescription("The current file path from the root of the project.")
    private String file;
    /**
     * The current function name, if applicable.
     * 
     */
    @JsonProperty("function")
    @JsonPropertyDescription("The current function name, if applicable.")
    private String function;
    /**
     * The current line number with in the file.
     * 
     */
    @JsonProperty("line")
    @JsonPropertyDescription("The current line number with in the file.")
    private Integer line;
    /**
     * The current module name, if applicable.
     * 
     */
    @JsonProperty("module_name")
    @JsonPropertyDescription("The current module name, if applicable.")
    private String module_name;
    /**
     * The logical process ID as defined by the current language, if applicable.
     * 
     */
    @JsonProperty("vm_pid")
    @JsonPropertyDescription("The logical process ID as defined by the current language, if applicable.")
    private String vm_pid;

    /**
     * The current application name
     * 
     */
    @JsonProperty("application")
    public String getApplication() {
        return application;
    }

    /**
     * The current application name
     * 
     */
    @JsonProperty("application")
    public void setApplication(String application) {
        this.application = application;
    }

    public Runtime withApplication(String application) {
        this.application = application;
        return this;
    }

    /**
     * The current class name, if applicable.
     * 
     */
    @JsonProperty("class_name")
    public String getClass_name() {
        return class_name;
    }

    /**
     * The current class name, if applicable.
     * 
     */
    @JsonProperty("class_name")
    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public Runtime withClass_name(String class_name) {
        this.class_name = class_name;
        return this;
    }

    /**
     * The current file path from the root of the project.
     * 
     */
    @JsonProperty("file")
    public String getFile() {
        return file;
    }

    /**
     * The current file path from the root of the project.
     * 
     */
    @JsonProperty("file")
    public void setFile(String file) {
        this.file = file;
    }

    public Runtime withFile(String file) {
        this.file = file;
        return this;
    }

    /**
     * The current function name, if applicable.
     * 
     */
    @JsonProperty("function")
    public String getFunction() {
        return function;
    }

    /**
     * The current function name, if applicable.
     * 
     */
    @JsonProperty("function")
    public void setFunction(String function) {
        this.function = function;
    }

    public Runtime withFunction(String function) {
        this.function = function;
        return this;
    }

    /**
     * The current line number with in the file.
     * 
     */
    @JsonProperty("line")
    public Integer getLine() {
        return line;
    }

    /**
     * The current line number with in the file.
     * 
     */
    @JsonProperty("line")
    public void setLine(Integer line) {
        this.line = line;
    }

    public Runtime withLine(Integer line) {
        this.line = line;
        return this;
    }

    /**
     * The current module name, if applicable.
     * 
     */
    @JsonProperty("module_name")
    public String getModule_name() {
        return module_name;
    }

    /**
     * The current module name, if applicable.
     * 
     */
    @JsonProperty("module_name")
    public void setModule_name(String module_name) {
        this.module_name = module_name;
    }

    public Runtime withModule_name(String module_name) {
        this.module_name = module_name;
        return this;
    }

    /**
     * The logical process ID as defined by the current language, if applicable.
     * 
     */
    @JsonProperty("vm_pid")
    public String getVm_pid() {
        return vm_pid;
    }

    /**
     * The logical process ID as defined by the current language, if applicable.
     * 
     */
    @JsonProperty("vm_pid")
    public void setVm_pid(String vm_pid) {
        this.vm_pid = vm_pid;
    }

    public Runtime withVm_pid(String vm_pid) {
        this.vm_pid = vm_pid;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Runtime.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("application");
        sb.append('=');
        sb.append(((this.application == null)?"<null>":this.application));
        sb.append(',');
        sb.append("class_name");
        sb.append('=');
        sb.append(((this.class_name == null)?"<null>":this.class_name));
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
        sb.append("module_name");
        sb.append('=');
        sb.append(((this.module_name == null)?"<null>":this.module_name));
        sb.append(',');
        sb.append("vm_pid");
        sb.append('=');
        sb.append(((this.vm_pid == null)?"<null>":this.vm_pid));
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
        result = ((result* 31)+((this.file == null)? 0 :this.file.hashCode()));
        result = ((result* 31)+((this.application == null)? 0 :this.application.hashCode()));
        result = ((result* 31)+((this.line == null)? 0 :this.line.hashCode()));
        result = ((result* 31)+((this.function == null)? 0 :this.function.hashCode()));
        result = ((result* 31)+((this.module_name == null)? 0 :this.module_name.hashCode()));
        result = ((result* 31)+((this.vm_pid == null)? 0 :this.vm_pid.hashCode()));
        result = ((result* 31)+((this.class_name == null)? 0 :this.class_name.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Runtime) == false) {
            return false;
        }
        Runtime rhs = ((Runtime) other);
        return ((((((((this.file == rhs.file)||((this.file!= null)&&this.file.equals(rhs.file)))&&((this.application == rhs.application)||((this.application!= null)&&this.application.equals(rhs.application))))&&((this.line == rhs.line)||((this.line!= null)&&this.line.equals(rhs.line))))&&((this.function == rhs.function)||((this.function!= null)&&this.function.equals(rhs.function))))&&((this.module_name == rhs.module_name)||((this.module_name!= null)&&this.module_name.equals(rhs.module_name))))&&((this.vm_pid == rhs.vm_pid)||((this.vm_pid!= null)&&this.vm_pid.equals(rhs.vm_pid))))&&((this.class_name == rhs.class_name)||((this.class_name!= null)&&this.class_name.equals(rhs.class_name))));
    }

}
