
package config.trace;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Represents a resource usage sample for a target server, application, or both.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cpu",
    "cache",
    "database",
    "disk",
    "memory"
})
public class Resource_sample {

    /**
     * A sample of the current server processor usage.
     * 
     */
    @JsonProperty("cpu")
    @JsonPropertyDescription("A sample of the current server processor usage.")
    private Cpu cpu;
    /**
     * A sample of cache statistics and state.
     * 
     */
    @JsonProperty("cache")
    @JsonPropertyDescription("A sample of cache statistics and state.")
    private Cache cache;
    /**
     * A sample of database statistics and state.
     * 
     */
    @JsonProperty("database")
    @JsonPropertyDescription("A sample of database statistics and state.")
    private Database database;
    /**
     * A sample of a server's disk usage.
     * 
     */
    @JsonProperty("disk")
    @JsonPropertyDescription("A sample of a server's disk usage.")
    private Disk disk;
    /**
     * A sample of a server's memory usage.
     * 
     */
    @JsonProperty("memory")
    @JsonPropertyDescription("A sample of a server's memory usage.")
    private Memory memory;

    /**
     * A sample of the current server processor usage.
     * 
     */
    @JsonProperty("cpu")
    public Cpu getCpu() {
        return cpu;
    }

    /**
     * A sample of the current server processor usage.
     * 
     */
    @JsonProperty("cpu")
    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Resource_sample withCpu(Cpu cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * A sample of cache statistics and state.
     * 
     */
    @JsonProperty("cache")
    public Cache getCache() {
        return cache;
    }

    /**
     * A sample of cache statistics and state.
     * 
     */
    @JsonProperty("cache")
    public void setCache(Cache cache) {
        this.cache = cache;
    }

    public Resource_sample withCache(Cache cache) {
        this.cache = cache;
        return this;
    }

    /**
     * A sample of database statistics and state.
     * 
     */
    @JsonProperty("database")
    public Database getDatabase() {
        return database;
    }

    /**
     * A sample of database statistics and state.
     * 
     */
    @JsonProperty("database")
    public void setDatabase(Database database) {
        this.database = database;
    }

    public Resource_sample withDatabase(Database database) {
        this.database = database;
        return this;
    }

    /**
     * A sample of a server's disk usage.
     * 
     */
    @JsonProperty("disk")
    public Disk getDisk() {
        return disk;
    }

    /**
     * A sample of a server's disk usage.
     * 
     */
    @JsonProperty("disk")
    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public Resource_sample withDisk(Disk disk) {
        this.disk = disk;
        return this;
    }

    /**
     * A sample of a server's memory usage.
     * 
     */
    @JsonProperty("memory")
    public Memory getMemory() {
        return memory;
    }

    /**
     * A sample of a server's memory usage.
     * 
     */
    @JsonProperty("memory")
    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Resource_sample withMemory(Memory memory) {
        this.memory = memory;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Resource_sample.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("cpu");
        sb.append('=');
        sb.append(((this.cpu == null)?"<null>":this.cpu));
        sb.append(',');
        sb.append("cache");
        sb.append('=');
        sb.append(((this.cache == null)?"<null>":this.cache));
        sb.append(',');
        sb.append("database");
        sb.append('=');
        sb.append(((this.database == null)?"<null>":this.database));
        sb.append(',');
        sb.append("disk");
        sb.append('=');
        sb.append(((this.disk == null)?"<null>":this.disk));
        sb.append(',');
        sb.append("memory");
        sb.append('=');
        sb.append(((this.memory == null)?"<null>":this.memory));
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
        result = ((result* 31)+((this.cpu == null)? 0 :this.cpu.hashCode()));
        result = ((result* 31)+((this.cache == null)? 0 :this.cache.hashCode()));
        result = ((result* 31)+((this.database == null)? 0 :this.database.hashCode()));
        result = ((result* 31)+((this.disk == null)? 0 :this.disk.hashCode()));
        result = ((result* 31)+((this.memory == null)? 0 :this.memory.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Resource_sample) == false) {
            return false;
        }
        Resource_sample rhs = ((Resource_sample) other);
        return ((((((this.cpu == rhs.cpu)||((this.cpu!= null)&&this.cpu.equals(rhs.cpu)))&&((this.cache == rhs.cache)||((this.cache!= null)&&this.cache.equals(rhs.cache))))&&((this.database == rhs.database)||((this.database!= null)&&this.database.equals(rhs.database))))&&((this.disk == rhs.disk)||((this.disk!= null)&&this.disk.equals(rhs.disk))))&&((this.memory == rhs.memory)||((this.memory!= null)&&this.memory.equals(rhs.memory))));
    }

}
