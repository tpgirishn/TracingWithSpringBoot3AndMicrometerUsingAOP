
package config.trace;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Information about the Amazon EC2 instance
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ami_id",
    "hostname",
    "instance_id",
    "instance_type",
    "public_hostname"
})
public class Aws_ec2 {

    /**
     * Amazon Machine Image (AMI) identifier that the instance was launched from
     * (Required)
     * 
     */
    @JsonProperty("ami_id")
    @JsonPropertyDescription("Amazon Machine Image (AMI) identifier that the instance was launched from")
    private String ami_id;
    /**
     * Hostname of the instance assigned by AWS. The operating system may report a different hostname based on configuration.
     * 
     */
    @JsonProperty("hostname")
    @JsonPropertyDescription("Hostname of the instance assigned by AWS. The operating system may report a different hostname based on configuration.")
    private String hostname;
    /**
     * The unique identifier for the EC2 instance
     * (Required)
     * 
     */
    @JsonProperty("instance_id")
    @JsonPropertyDescription("The unique identifier for the EC2 instance")
    private String instance_id;
    /**
     * The instance type of the EC2 image (for example, `t2.small`)
     * (Required)
     * 
     */
    @JsonProperty("instance_type")
    @JsonPropertyDescription("The instance type of the EC2 image (for example, `t2.small`)")
    private String instance_type;
    /**
     * Public hostname assigned by AWS to the EC2 instance. The operating system may report a different hostname based on configuration.
     * 
     */
    @JsonProperty("public_hostname")
    @JsonPropertyDescription("Public hostname assigned by AWS to the EC2 instance. The operating system may report a different hostname based on configuration.")
    private String public_hostname;

    /**
     * Amazon Machine Image (AMI) identifier that the instance was launched from
     * (Required)
     * 
     */
    @JsonProperty("ami_id")
    public String getAmi_id() {
        return ami_id;
    }

    /**
     * Amazon Machine Image (AMI) identifier that the instance was launched from
     * (Required)
     * 
     */
    @JsonProperty("ami_id")
    public void setAmi_id(String ami_id) {
        this.ami_id = ami_id;
    }

    public Aws_ec2 withAmi_id(String ami_id) {
        this.ami_id = ami_id;
        return this;
    }

    /**
     * Hostname of the instance assigned by AWS. The operating system may report a different hostname based on configuration.
     * 
     */
    @JsonProperty("hostname")
    public String getHostname() {
        return hostname;
    }

    /**
     * Hostname of the instance assigned by AWS. The operating system may report a different hostname based on configuration.
     * 
     */
    @JsonProperty("hostname")
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public Aws_ec2 withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * The unique identifier for the EC2 instance
     * (Required)
     * 
     */
    @JsonProperty("instance_id")
    public String getInstance_id() {
        return instance_id;
    }

    /**
     * The unique identifier for the EC2 instance
     * (Required)
     * 
     */
    @JsonProperty("instance_id")
    public void setInstance_id(String instance_id) {
        this.instance_id = instance_id;
    }

    public Aws_ec2 withInstance_id(String instance_id) {
        this.instance_id = instance_id;
        return this;
    }

    /**
     * The instance type of the EC2 image (for example, `t2.small`)
     * (Required)
     * 
     */
    @JsonProperty("instance_type")
    public String getInstance_type() {
        return instance_type;
    }

    /**
     * The instance type of the EC2 image (for example, `t2.small`)
     * (Required)
     * 
     */
    @JsonProperty("instance_type")
    public void setInstance_type(String instance_type) {
        this.instance_type = instance_type;
    }

    public Aws_ec2 withInstance_type(String instance_type) {
        this.instance_type = instance_type;
        return this;
    }

    /**
     * Public hostname assigned by AWS to the EC2 instance. The operating system may report a different hostname based on configuration.
     * 
     */
    @JsonProperty("public_hostname")
    public String getPublic_hostname() {
        return public_hostname;
    }

    /**
     * Public hostname assigned by AWS to the EC2 instance. The operating system may report a different hostname based on configuration.
     * 
     */
    @JsonProperty("public_hostname")
    public void setPublic_hostname(String public_hostname) {
        this.public_hostname = public_hostname;
    }

    public Aws_ec2 withPublic_hostname(String public_hostname) {
        this.public_hostname = public_hostname;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Aws_ec2 .class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("ami_id");
        sb.append('=');
        sb.append(((this.ami_id == null)?"<null>":this.ami_id));
        sb.append(',');
        sb.append("hostname");
        sb.append('=');
        sb.append(((this.hostname == null)?"<null>":this.hostname));
        sb.append(',');
        sb.append("instance_id");
        sb.append('=');
        sb.append(((this.instance_id == null)?"<null>":this.instance_id));
        sb.append(',');
        sb.append("instance_type");
        sb.append('=');
        sb.append(((this.instance_type == null)?"<null>":this.instance_type));
        sb.append(',');
        sb.append("public_hostname");
        sb.append('=');
        sb.append(((this.public_hostname == null)?"<null>":this.public_hostname));
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
        result = ((result* 31)+((this.public_hostname == null)? 0 :this.public_hostname.hashCode()));
        result = ((result* 31)+((this.ami_id == null)? 0 :this.ami_id.hashCode()));
        result = ((result* 31)+((this.hostname == null)? 0 :this.hostname.hashCode()));
        result = ((result* 31)+((this.instance_id == null)? 0 :this.instance_id.hashCode()));
        result = ((result* 31)+((this.instance_type == null)? 0 :this.instance_type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Aws_ec2) == false) {
            return false;
        }
        Aws_ec2 rhs = ((Aws_ec2) other);
        return ((((((this.public_hostname == rhs.public_hostname)||((this.public_hostname!= null)&&this.public_hostname.equals(rhs.public_hostname)))&&((this.ami_id == rhs.ami_id)||((this.ami_id!= null)&&this.ami_id.equals(rhs.ami_id))))&&((this.hostname == rhs.hostname)||((this.hostname!= null)&&this.hostname.equals(rhs.hostname))))&&((this.instance_id == rhs.instance_id)||((this.instance_id!= null)&&this.instance_id.equals(rhs.instance_id))))&&((this.instance_type == rhs.instance_type)||((this.instance_type!= null)&&this.instance_type.equals(rhs.instance_type))));
    }

}
