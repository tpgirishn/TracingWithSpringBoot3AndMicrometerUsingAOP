
package config.trace;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A sample of a server's disk usage.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "read_iops",
    "write_iops"
})
public class Disk {

    /**
     * Number of read operations in I/O sizes of 16KB blocks.
     * (Required)
     * 
     */
    @JsonProperty("read_iops")
    @JsonPropertyDescription("Number of read operations in I/O sizes of 16KB blocks.")
    private Integer read_iops;
    /**
     * Number of write operations in I/O sizes of 16KB blocks.
     * (Required)
     * 
     */
    @JsonProperty("write_iops")
    @JsonPropertyDescription("Number of write operations in I/O sizes of 16KB blocks.")
    private Integer write_iops;

    /**
     * Number of read operations in I/O sizes of 16KB blocks.
     * (Required)
     * 
     */
    @JsonProperty("read_iops")
    public Integer getRead_iops() {
        return read_iops;
    }

    /**
     * Number of read operations in I/O sizes of 16KB blocks.
     * (Required)
     * 
     */
    @JsonProperty("read_iops")
    public void setRead_iops(Integer read_iops) {
        this.read_iops = read_iops;
    }

    public Disk withRead_iops(Integer read_iops) {
        this.read_iops = read_iops;
        return this;
    }

    /**
     * Number of write operations in I/O sizes of 16KB blocks.
     * (Required)
     * 
     */
    @JsonProperty("write_iops")
    public Integer getWrite_iops() {
        return write_iops;
    }

    /**
     * Number of write operations in I/O sizes of 16KB blocks.
     * (Required)
     * 
     */
    @JsonProperty("write_iops")
    public void setWrite_iops(Integer write_iops) {
        this.write_iops = write_iops;
    }

    public Disk withWrite_iops(Integer write_iops) {
        this.write_iops = write_iops;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Disk.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("read_iops");
        sb.append('=');
        sb.append(((this.read_iops == null)?"<null>":this.read_iops));
        sb.append(',');
        sb.append("write_iops");
        sb.append('=');
        sb.append(((this.write_iops == null)?"<null>":this.write_iops));
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
        result = ((result* 31)+((this.write_iops == null)? 0 :this.write_iops.hashCode()));
        result = ((result* 31)+((this.read_iops == null)? 0 :this.read_iops.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Disk) == false) {
            return false;
        }
        Disk rhs = ((Disk) other);
        return (((this.write_iops == rhs.write_iops)||((this.write_iops!= null)&&this.write_iops.equals(rhs.write_iops)))&&((this.read_iops == rhs.read_iops)||((this.read_iops!= null)&&this.read_iops.equals(rhs.read_iops))));
    }

}
