
package config.trace;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Host and system level details tha the log was generated on.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "hostname",
    "ip",
    "pid",
    "process_name"
})
public class System {

    /**
     * The system's hostname.
     * 
     */
    @JsonProperty("hostname")
    @JsonPropertyDescription("The system's hostname.")
    private String hostname;
    /**
     * The system's IP address (v4 or v6).
     * 
     */
    @JsonProperty("ip")
    @JsonPropertyDescription("The system's IP address (v4 or v6).")
    private String ip;
    /**
     * The originating process ID as defined by the `pid` command in Unix.
     * 
     */
    @JsonProperty("pid")
    @JsonPropertyDescription("The originating process ID as defined by the `pid` command in Unix.")
    private Integer pid;
    /**
     * The originating process name.
     * 
     */
    @JsonProperty("process_name")
    @JsonPropertyDescription("The originating process name.")
    private String process_name;

    /**
     * The system's hostname.
     * 
     */
    @JsonProperty("hostname")
    public String getHostname() {
        return hostname;
    }

    /**
     * The system's hostname.
     * 
     */
    @JsonProperty("hostname")
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public System withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * The system's IP address (v4 or v6).
     * 
     */
    @JsonProperty("ip")
    public String getIp() {
        return ip;
    }

    /**
     * The system's IP address (v4 or v6).
     * 
     */
    @JsonProperty("ip")
    public void setIp(String ip) {
        this.ip = ip;
    }

    public System withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * The originating process ID as defined by the `pid` command in Unix.
     * 
     */
    @JsonProperty("pid")
    public Integer getPid() {
        return pid;
    }

    /**
     * The originating process ID as defined by the `pid` command in Unix.
     * 
     */
    @JsonProperty("pid")
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public System withPid(Integer pid) {
        this.pid = pid;
        return this;
    }

    /**
     * The originating process name.
     * 
     */
    @JsonProperty("process_name")
    public String getProcess_name() {
        return process_name;
    }

    /**
     * The originating process name.
     * 
     */
    @JsonProperty("process_name")
    public void setProcess_name(String process_name) {
        this.process_name = process_name;
    }

    public System withProcess_name(String process_name) {
        this.process_name = process_name;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(System.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("hostname");
        sb.append('=');
        sb.append(((this.hostname == null)?"<null>":this.hostname));
        sb.append(',');
        sb.append("ip");
        sb.append('=');
        sb.append(((this.ip == null)?"<null>":this.ip));
        sb.append(',');
        sb.append("pid");
        sb.append('=');
        sb.append(((this.pid == null)?"<null>":this.pid));
        sb.append(',');
        sb.append("process_name");
        sb.append('=');
        sb.append(((this.process_name == null)?"<null>":this.process_name));
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
        result = ((result* 31)+((this.hostname == null)? 0 :this.hostname.hashCode()));
        result = ((result* 31)+((this.pid == null)? 0 :this.pid.hashCode()));
        result = ((result* 31)+((this.process_name == null)? 0 :this.process_name.hashCode()));
        result = ((result* 31)+((this.ip == null)? 0 :this.ip.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof System) == false) {
            return false;
        }
        System rhs = ((System) other);
        return (((((this.hostname == rhs.hostname)||((this.hostname!= null)&&this.hostname.equals(rhs.hostname)))&&((this.pid == rhs.pid)||((this.pid!= null)&&this.pid.equals(rhs.pid))))&&((this.process_name == rhs.process_name)||((this.process_name!= null)&&this.process_name.equals(rhs.process_name))))&&((this.ip == rhs.ip)||((this.ip!= null)&&this.ip.equals(rhs.ip))));
    }

}
