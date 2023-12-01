
package config.trace;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A sample of a server's memory usage.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cache_mb",
    "free_mb",
    "pgpgin",
    "pgpgout",
    "rss_mb",
    "swap_mb",
    "total_mb"
})
public class Memory {

    /**
     * The portion of the memory used for disk cache.
     * 
     */
    @JsonProperty("cache_mb")
    @JsonPropertyDescription("The portion of the memory used for disk cache.")
    private Double cache_mb;
    /**
     * The amount of free memory availabe in megabytes.
     * 
     */
    @JsonProperty("free_mb")
    @JsonPropertyDescription("The amount of free memory availabe in megabytes.")
    private Double free_mb;
    /**
     * The cumulative total of the pages read from disk. Sudden high variations on this number can indicate short duration spikes in swap usage. The other memory related metrics are point in time snapshots and can miss short spikes.
     * 
     */
    @JsonProperty("pgpgin")
    @JsonPropertyDescription("The cumulative total of the pages read from disk. Sudden high variations on this number can indicate short duration spikes in swap usage. The other memory related metrics are point in time snapshots and can miss short spikes.")
    private Double pgpgin;
    /**
     * The cumulative total of the pages written to disk. Sudden high variations on this number can indicate short duration spikes in swap usage. The other memory related metrics are point in time snapshots and can miss short spikes.
     * 
     */
    @JsonProperty("pgpgout")
    @JsonPropertyDescription("The cumulative total of the pages written to disk. Sudden high variations on this number can indicate short duration spikes in swap usage. The other memory related metrics are point in time snapshots and can miss short spikes.")
    private Double pgpgout;
    /**
     * The portion of the memory being used by the target application oin megabytes.
     * 
     */
    @JsonProperty("rss_mb")
    @JsonPropertyDescription("The portion of the memory being used by the target application oin megabytes.")
    private Double rss_mb;
    /**
     * The portion of the memory stored on disk. Swap usually indicates a shortage of memory in megabytes.
     * 
     */
    @JsonProperty("swap_mb")
    @JsonPropertyDescription("The portion of the memory stored on disk. Swap usually indicates a shortage of memory in megabytes.")
    private Double swap_mb;
    /**
     * The sum of the rss, cache, and swap that equals the total memory being used in megabytes.
     * (Required)
     * 
     */
    @JsonProperty("total_mb")
    @JsonPropertyDescription("The sum of the rss, cache, and swap that equals the total memory being used in megabytes.")
    private Double total_mb;

    /**
     * The portion of the memory used for disk cache.
     * 
     */
    @JsonProperty("cache_mb")
    public Double getCache_mb() {
        return cache_mb;
    }

    /**
     * The portion of the memory used for disk cache.
     * 
     */
    @JsonProperty("cache_mb")
    public void setCache_mb(Double cache_mb) {
        this.cache_mb = cache_mb;
    }

    public Memory withCache_mb(Double cache_mb) {
        this.cache_mb = cache_mb;
        return this;
    }

    /**
     * The amount of free memory availabe in megabytes.
     * 
     */
    @JsonProperty("free_mb")
    public Double getFree_mb() {
        return free_mb;
    }

    /**
     * The amount of free memory availabe in megabytes.
     * 
     */
    @JsonProperty("free_mb")
    public void setFree_mb(Double free_mb) {
        this.free_mb = free_mb;
    }

    public Memory withFree_mb(Double free_mb) {
        this.free_mb = free_mb;
        return this;
    }

    /**
     * The cumulative total of the pages read from disk. Sudden high variations on this number can indicate short duration spikes in swap usage. The other memory related metrics are point in time snapshots and can miss short spikes.
     * 
     */
    @JsonProperty("pgpgin")
    public Double getPgpgin() {
        return pgpgin;
    }

    /**
     * The cumulative total of the pages read from disk. Sudden high variations on this number can indicate short duration spikes in swap usage. The other memory related metrics are point in time snapshots and can miss short spikes.
     * 
     */
    @JsonProperty("pgpgin")
    public void setPgpgin(Double pgpgin) {
        this.pgpgin = pgpgin;
    }

    public Memory withPgpgin(Double pgpgin) {
        this.pgpgin = pgpgin;
        return this;
    }

    /**
     * The cumulative total of the pages written to disk. Sudden high variations on this number can indicate short duration spikes in swap usage. The other memory related metrics are point in time snapshots and can miss short spikes.
     * 
     */
    @JsonProperty("pgpgout")
    public Double getPgpgout() {
        return pgpgout;
    }

    /**
     * The cumulative total of the pages written to disk. Sudden high variations on this number can indicate short duration spikes in swap usage. The other memory related metrics are point in time snapshots and can miss short spikes.
     * 
     */
    @JsonProperty("pgpgout")
    public void setPgpgout(Double pgpgout) {
        this.pgpgout = pgpgout;
    }

    public Memory withPgpgout(Double pgpgout) {
        this.pgpgout = pgpgout;
        return this;
    }

    /**
     * The portion of the memory being used by the target application oin megabytes.
     * 
     */
    @JsonProperty("rss_mb")
    public Double getRss_mb() {
        return rss_mb;
    }

    /**
     * The portion of the memory being used by the target application oin megabytes.
     * 
     */
    @JsonProperty("rss_mb")
    public void setRss_mb(Double rss_mb) {
        this.rss_mb = rss_mb;
    }

    public Memory withRss_mb(Double rss_mb) {
        this.rss_mb = rss_mb;
        return this;
    }

    /**
     * The portion of the memory stored on disk. Swap usually indicates a shortage of memory in megabytes.
     * 
     */
    @JsonProperty("swap_mb")
    public Double getSwap_mb() {
        return swap_mb;
    }

    /**
     * The portion of the memory stored on disk. Swap usually indicates a shortage of memory in megabytes.
     * 
     */
    @JsonProperty("swap_mb")
    public void setSwap_mb(Double swap_mb) {
        this.swap_mb = swap_mb;
    }

    public Memory withSwap_mb(Double swap_mb) {
        this.swap_mb = swap_mb;
        return this;
    }

    /**
     * The sum of the rss, cache, and swap that equals the total memory being used in megabytes.
     * (Required)
     * 
     */
    @JsonProperty("total_mb")
    public Double getTotal_mb() {
        return total_mb;
    }

    /**
     * The sum of the rss, cache, and swap that equals the total memory being used in megabytes.
     * (Required)
     * 
     */
    @JsonProperty("total_mb")
    public void setTotal_mb(Double total_mb) {
        this.total_mb = total_mb;
    }

    public Memory withTotal_mb(Double total_mb) {
        this.total_mb = total_mb;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Memory.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("cache_mb");
        sb.append('=');
        sb.append(((this.cache_mb == null)?"<null>":this.cache_mb));
        sb.append(',');
        sb.append("free_mb");
        sb.append('=');
        sb.append(((this.free_mb == null)?"<null>":this.free_mb));
        sb.append(',');
        sb.append("pgpgin");
        sb.append('=');
        sb.append(((this.pgpgin == null)?"<null>":this.pgpgin));
        sb.append(',');
        sb.append("pgpgout");
        sb.append('=');
        sb.append(((this.pgpgout == null)?"<null>":this.pgpgout));
        sb.append(',');
        sb.append("rss_mb");
        sb.append('=');
        sb.append(((this.rss_mb == null)?"<null>":this.rss_mb));
        sb.append(',');
        sb.append("swap_mb");
        sb.append('=');
        sb.append(((this.swap_mb == null)?"<null>":this.swap_mb));
        sb.append(',');
        sb.append("total_mb");
        sb.append('=');
        sb.append(((this.total_mb == null)?"<null>":this.total_mb));
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
        result = ((result* 31)+((this.rss_mb == null)? 0 :this.rss_mb.hashCode()));
        result = ((result* 31)+((this.pgpgout == null)? 0 :this.pgpgout.hashCode()));
        result = ((result* 31)+((this.total_mb == null)? 0 :this.total_mb.hashCode()));
        result = ((result* 31)+((this.swap_mb == null)? 0 :this.swap_mb.hashCode()));
        result = ((result* 31)+((this.free_mb == null)? 0 :this.free_mb.hashCode()));
        result = ((result* 31)+((this.cache_mb == null)? 0 :this.cache_mb.hashCode()));
        result = ((result* 31)+((this.pgpgin == null)? 0 :this.pgpgin.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Memory) == false) {
            return false;
        }
        Memory rhs = ((Memory) other);
        return ((((((((this.rss_mb == rhs.rss_mb)||((this.rss_mb!= null)&&this.rss_mb.equals(rhs.rss_mb)))&&((this.pgpgout == rhs.pgpgout)||((this.pgpgout!= null)&&this.pgpgout.equals(rhs.pgpgout))))&&((this.total_mb == rhs.total_mb)||((this.total_mb!= null)&&this.total_mb.equals(rhs.total_mb))))&&((this.swap_mb == rhs.swap_mb)||((this.swap_mb!= null)&&this.swap_mb.equals(rhs.swap_mb))))&&((this.free_mb == rhs.free_mb)||((this.free_mb!= null)&&this.free_mb.equals(rhs.free_mb))))&&((this.cache_mb == rhs.cache_mb)||((this.cache_mb!= null)&&this.cache_mb.equals(rhs.cache_mb))))&&((this.pgpgin == rhs.pgpgin)||((this.pgpgin!= null)&&this.pgpgin.equals(rhs.pgpgin))));
    }

}
