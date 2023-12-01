
package config.trace;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A sample of the current server processor usage.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "load_avg_1m",
    "load_avg_5m",
    "load_avg_15m"
})
public class Cpu {

    /**
     * The load average for the processor in the last 1 minute. This reflects the number of CPU tasks that are in the ready queue (i.e. waiting to be processed).
     * (Required)
     * 
     */
    @JsonProperty("load_avg_1m")
    @JsonPropertyDescription("The load average for the processor in the last 1 minute. This reflects the number of CPU tasks that are in the ready queue (i.e. waiting to be processed).")
    private Double load_avg_1m;
    /**
     * The load average for the processor in the last 5 minutes. This reflects the number of CPU tasks that are in the ready queue (i.e. waiting to be processed).
     * 
     */
    @JsonProperty("load_avg_5m")
    @JsonPropertyDescription("The load average for the processor in the last 5 minutes. This reflects the number of CPU tasks that are in the ready queue (i.e. waiting to be processed).")
    private Double load_avg_5m;
    /**
     * The load average for the processor in the last 10 minutes. This reflects the number of CPU tasks that are in the ready queue (i.e. waiting to be processed).
     * 
     */
    @JsonProperty("load_avg_15m")
    @JsonPropertyDescription("The load average for the processor in the last 10 minutes. This reflects the number of CPU tasks that are in the ready queue (i.e. waiting to be processed).")
    private Double load_avg_15m;

    /**
     * The load average for the processor in the last 1 minute. This reflects the number of CPU tasks that are in the ready queue (i.e. waiting to be processed).
     * (Required)
     * 
     */
    @JsonProperty("load_avg_1m")
    public Double getLoad_avg_1m() {
        return load_avg_1m;
    }

    /**
     * The load average for the processor in the last 1 minute. This reflects the number of CPU tasks that are in the ready queue (i.e. waiting to be processed).
     * (Required)
     * 
     */
    @JsonProperty("load_avg_1m")
    public void setLoad_avg_1m(Double load_avg_1m) {
        this.load_avg_1m = load_avg_1m;
    }

    public Cpu withLoad_avg_1m(Double load_avg_1m) {
        this.load_avg_1m = load_avg_1m;
        return this;
    }

    /**
     * The load average for the processor in the last 5 minutes. This reflects the number of CPU tasks that are in the ready queue (i.e. waiting to be processed).
     * 
     */
    @JsonProperty("load_avg_5m")
    public Double getLoad_avg_5m() {
        return load_avg_5m;
    }

    /**
     * The load average for the processor in the last 5 minutes. This reflects the number of CPU tasks that are in the ready queue (i.e. waiting to be processed).
     * 
     */
    @JsonProperty("load_avg_5m")
    public void setLoad_avg_5m(Double load_avg_5m) {
        this.load_avg_5m = load_avg_5m;
    }

    public Cpu withLoad_avg_5m(Double load_avg_5m) {
        this.load_avg_5m = load_avg_5m;
        return this;
    }

    /**
     * The load average for the processor in the last 10 minutes. This reflects the number of CPU tasks that are in the ready queue (i.e. waiting to be processed).
     * 
     */
    @JsonProperty("load_avg_15m")
    public Double getLoad_avg_15m() {
        return load_avg_15m;
    }

    /**
     * The load average for the processor in the last 10 minutes. This reflects the number of CPU tasks that are in the ready queue (i.e. waiting to be processed).
     * 
     */
    @JsonProperty("load_avg_15m")
    public void setLoad_avg_15m(Double load_avg_15m) {
        this.load_avg_15m = load_avg_15m;
    }

    public Cpu withLoad_avg_15m(Double load_avg_15m) {
        this.load_avg_15m = load_avg_15m;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Cpu.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("load_avg_1m");
        sb.append('=');
        sb.append(((this.load_avg_1m == null)?"<null>":this.load_avg_1m));
        sb.append(',');
        sb.append("load_avg_5m");
        sb.append('=');
        sb.append(((this.load_avg_5m == null)?"<null>":this.load_avg_5m));
        sb.append(',');
        sb.append("load_avg_15m");
        sb.append('=');
        sb.append(((this.load_avg_15m == null)?"<null>":this.load_avg_15m));
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
        result = ((result* 31)+((this.load_avg_5m == null)? 0 :this.load_avg_5m.hashCode()));
        result = ((result* 31)+((this.load_avg_15m == null)? 0 :this.load_avg_15m.hashCode()));
        result = ((result* 31)+((this.load_avg_1m == null)? 0 :this.load_avg_1m.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Cpu) == false) {
            return false;
        }
        Cpu rhs = ((Cpu) other);
        return ((((this.load_avg_5m == rhs.load_avg_5m)||((this.load_avg_5m!= null)&&this.load_avg_5m.equals(rhs.load_avg_5m)))&&((this.load_avg_15m == rhs.load_avg_15m)||((this.load_avg_15m!= null)&&this.load_avg_15m.equals(rhs.load_avg_15m))))&&((this.load_avg_1m == rhs.load_avg_1m)||((this.load_avg_1m!= null)&&this.load_avg_1m.equals(rhs.load_avg_1m))));
    }

}
