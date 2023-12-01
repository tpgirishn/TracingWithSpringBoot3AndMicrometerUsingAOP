
package config.trace;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A sample of cache statistics and state.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "active_connections",
    "index_cache_hit_rate",
    "evicted_keys"
})
public class Cache {

    /**
     * The number of active connections established with the database.
     * 
     */
    @JsonProperty("active_connections")
    @JsonPropertyDescription("The number of active connections established with the database.")
    private Integer active_connections;
    /**
     * The ratio of successful reads out of all read operations.
     * 
     */
    @JsonProperty("index_cache_hit_rate")
    @JsonPropertyDescription("The ratio of successful reads out of all read operations.")
    private Double index_cache_hit_rate;
    /**
     * The number of evicted keys.
     * 
     */
    @JsonProperty("evicted_keys")
    @JsonPropertyDescription("The number of evicted keys.")
    private Integer evicted_keys;

    /**
     * The number of active connections established with the database.
     * 
     */
    @JsonProperty("active_connections")
    public Integer getActive_connections() {
        return active_connections;
    }

    /**
     * The number of active connections established with the database.
     * 
     */
    @JsonProperty("active_connections")
    public void setActive_connections(Integer active_connections) {
        this.active_connections = active_connections;
    }

    public Cache withActive_connections(Integer active_connections) {
        this.active_connections = active_connections;
        return this;
    }

    /**
     * The ratio of successful reads out of all read operations.
     * 
     */
    @JsonProperty("index_cache_hit_rate")
    public Double getIndex_cache_hit_rate() {
        return index_cache_hit_rate;
    }

    /**
     * The ratio of successful reads out of all read operations.
     * 
     */
    @JsonProperty("index_cache_hit_rate")
    public void setIndex_cache_hit_rate(Double index_cache_hit_rate) {
        this.index_cache_hit_rate = index_cache_hit_rate;
    }

    public Cache withIndex_cache_hit_rate(Double index_cache_hit_rate) {
        this.index_cache_hit_rate = index_cache_hit_rate;
        return this;
    }

    /**
     * The number of evicted keys.
     * 
     */
    @JsonProperty("evicted_keys")
    public Integer getEvicted_keys() {
        return evicted_keys;
    }

    /**
     * The number of evicted keys.
     * 
     */
    @JsonProperty("evicted_keys")
    public void setEvicted_keys(Integer evicted_keys) {
        this.evicted_keys = evicted_keys;
    }

    public Cache withEvicted_keys(Integer evicted_keys) {
        this.evicted_keys = evicted_keys;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Cache.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("active_connections");
        sb.append('=');
        sb.append(((this.active_connections == null)?"<null>":this.active_connections));
        sb.append(',');
        sb.append("index_cache_hit_rate");
        sb.append('=');
        sb.append(((this.index_cache_hit_rate == null)?"<null>":this.index_cache_hit_rate));
        sb.append(',');
        sb.append("evicted_keys");
        sb.append('=');
        sb.append(((this.evicted_keys == null)?"<null>":this.evicted_keys));
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
        result = ((result* 31)+((this.index_cache_hit_rate == null)? 0 :this.index_cache_hit_rate.hashCode()));
        result = ((result* 31)+((this.evicted_keys == null)? 0 :this.evicted_keys.hashCode()));
        result = ((result* 31)+((this.active_connections == null)? 0 :this.active_connections.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Cache) == false) {
            return false;
        }
        Cache rhs = ((Cache) other);
        return ((((this.index_cache_hit_rate == rhs.index_cache_hit_rate)||((this.index_cache_hit_rate!= null)&&this.index_cache_hit_rate.equals(rhs.index_cache_hit_rate)))&&((this.evicted_keys == rhs.evicted_keys)||((this.evicted_keys!= null)&&this.evicted_keys.equals(rhs.evicted_keys))))&&((this.active_connections == rhs.active_connections)||((this.active_connections!= null)&&this.active_connections.equals(rhs.active_connections))));
    }

}
