
package config.trace;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A sample of database statistics and state.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "db_size",
    "tables",
    "active_connections",
    "current_transaction",
    "index_cache_hit_rate",
    "table_cache_hit_rate",
    "waiting_connections"
})
public class Database {

    /**
     * The number of bytes contained in the database. This includes all table and index data on disk, including database bloat.
     * 
     */
    @JsonProperty("db_size")
    @JsonPropertyDescription("The number of bytes contained in the database. This includes all table and index data on disk, including database bloat.")
    private Integer db_size;
    /**
     * The number of tables in the database
     * 
     */
    @JsonProperty("tables")
    @JsonPropertyDescription("The number of tables in the database")
    private Integer tables;
    /**
     * The number of active connections established with the database.
     * 
     */
    @JsonProperty("active_connections")
    @JsonPropertyDescription("The number of active connections established with the database.")
    private Integer active_connections;
    /**
     * The current transaction ID, which can be used to track writes over time.
     * 
     */
    @JsonProperty("current_transaction")
    @JsonPropertyDescription("The current transaction ID, which can be used to track writes over time.")
    private String current_transaction;
    /**
     * Ratio of queries that used an index (instead of only sequential scans), rounded to five decimal points.
     * 
     */
    @JsonProperty("index_cache_hit_rate")
    @JsonPropertyDescription("Ratio of queries that used an index (instead of only sequential scans), rounded to five decimal points.")
    private Double index_cache_hit_rate;
    /**
     * Ratio of table lookups served from shared buffer cache, rounded to five decimal points.
     * 
     */
    @JsonProperty("table_cache_hit_rate")
    @JsonPropertyDescription("Ratio of table lookups served from shared buffer cache, rounded to five decimal points.")
    private Double table_cache_hit_rate;
    /**
     * Number of connections waiting on a lock to be acquired.
     * 
     */
    @JsonProperty("waiting_connections")
    @JsonPropertyDescription("Number of connections waiting on a lock to be acquired.")
    private Integer waiting_connections;

    /**
     * The number of bytes contained in the database. This includes all table and index data on disk, including database bloat.
     * 
     */
    @JsonProperty("db_size")
    public Integer getDb_size() {
        return db_size;
    }

    /**
     * The number of bytes contained in the database. This includes all table and index data on disk, including database bloat.
     * 
     */
    @JsonProperty("db_size")
    public void setDb_size(Integer db_size) {
        this.db_size = db_size;
    }

    public Database withDb_size(Integer db_size) {
        this.db_size = db_size;
        return this;
    }

    /**
     * The number of tables in the database
     * 
     */
    @JsonProperty("tables")
    public Integer getTables() {
        return tables;
    }

    /**
     * The number of tables in the database
     * 
     */
    @JsonProperty("tables")
    public void setTables(Integer tables) {
        this.tables = tables;
    }

    public Database withTables(Integer tables) {
        this.tables = tables;
        return this;
    }

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

    public Database withActive_connections(Integer active_connections) {
        this.active_connections = active_connections;
        return this;
    }

    /**
     * The current transaction ID, which can be used to track writes over time.
     * 
     */
    @JsonProperty("current_transaction")
    public String getCurrent_transaction() {
        return current_transaction;
    }

    /**
     * The current transaction ID, which can be used to track writes over time.
     * 
     */
    @JsonProperty("current_transaction")
    public void setCurrent_transaction(String current_transaction) {
        this.current_transaction = current_transaction;
    }

    public Database withCurrent_transaction(String current_transaction) {
        this.current_transaction = current_transaction;
        return this;
    }

    /**
     * Ratio of queries that used an index (instead of only sequential scans), rounded to five decimal points.
     * 
     */
    @JsonProperty("index_cache_hit_rate")
    public Double getIndex_cache_hit_rate() {
        return index_cache_hit_rate;
    }

    /**
     * Ratio of queries that used an index (instead of only sequential scans), rounded to five decimal points.
     * 
     */
    @JsonProperty("index_cache_hit_rate")
    public void setIndex_cache_hit_rate(Double index_cache_hit_rate) {
        this.index_cache_hit_rate = index_cache_hit_rate;
    }

    public Database withIndex_cache_hit_rate(Double index_cache_hit_rate) {
        this.index_cache_hit_rate = index_cache_hit_rate;
        return this;
    }

    /**
     * Ratio of table lookups served from shared buffer cache, rounded to five decimal points.
     * 
     */
    @JsonProperty("table_cache_hit_rate")
    public Double getTable_cache_hit_rate() {
        return table_cache_hit_rate;
    }

    /**
     * Ratio of table lookups served from shared buffer cache, rounded to five decimal points.
     * 
     */
    @JsonProperty("table_cache_hit_rate")
    public void setTable_cache_hit_rate(Double table_cache_hit_rate) {
        this.table_cache_hit_rate = table_cache_hit_rate;
    }

    public Database withTable_cache_hit_rate(Double table_cache_hit_rate) {
        this.table_cache_hit_rate = table_cache_hit_rate;
        return this;
    }

    /**
     * Number of connections waiting on a lock to be acquired.
     * 
     */
    @JsonProperty("waiting_connections")
    public Integer getWaiting_connections() {
        return waiting_connections;
    }

    /**
     * Number of connections waiting on a lock to be acquired.
     * 
     */
    @JsonProperty("waiting_connections")
    public void setWaiting_connections(Integer waiting_connections) {
        this.waiting_connections = waiting_connections;
    }

    public Database withWaiting_connections(Integer waiting_connections) {
        this.waiting_connections = waiting_connections;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Database.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("db_size");
        sb.append('=');
        sb.append(((this.db_size == null)?"<null>":this.db_size));
        sb.append(',');
        sb.append("tables");
        sb.append('=');
        sb.append(((this.tables == null)?"<null>":this.tables));
        sb.append(',');
        sb.append("active_connections");
        sb.append('=');
        sb.append(((this.active_connections == null)?"<null>":this.active_connections));
        sb.append(',');
        sb.append("current_transaction");
        sb.append('=');
        sb.append(((this.current_transaction == null)?"<null>":this.current_transaction));
        sb.append(',');
        sb.append("index_cache_hit_rate");
        sb.append('=');
        sb.append(((this.index_cache_hit_rate == null)?"<null>":this.index_cache_hit_rate));
        sb.append(',');
        sb.append("table_cache_hit_rate");
        sb.append('=');
        sb.append(((this.table_cache_hit_rate == null)?"<null>":this.table_cache_hit_rate));
        sb.append(',');
        sb.append("waiting_connections");
        sb.append('=');
        sb.append(((this.waiting_connections == null)?"<null>":this.waiting_connections));
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
        result = ((result* 31)+((this.tables == null)? 0 :this.tables.hashCode()));
        result = ((result* 31)+((this.table_cache_hit_rate == null)? 0 :this.table_cache_hit_rate.hashCode()));
        result = ((result* 31)+((this.index_cache_hit_rate == null)? 0 :this.index_cache_hit_rate.hashCode()));
        result = ((result* 31)+((this.db_size == null)? 0 :this.db_size.hashCode()));
        result = ((result* 31)+((this.waiting_connections == null)? 0 :this.waiting_connections.hashCode()));
        result = ((result* 31)+((this.current_transaction == null)? 0 :this.current_transaction.hashCode()));
        result = ((result* 31)+((this.active_connections == null)? 0 :this.active_connections.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Database) == false) {
            return false;
        }
        Database rhs = ((Database) other);
        return ((((((((this.tables == rhs.tables)||((this.tables!= null)&&this.tables.equals(rhs.tables)))&&((this.table_cache_hit_rate == rhs.table_cache_hit_rate)||((this.table_cache_hit_rate!= null)&&this.table_cache_hit_rate.equals(rhs.table_cache_hit_rate))))&&((this.index_cache_hit_rate == rhs.index_cache_hit_rate)||((this.index_cache_hit_rate!= null)&&this.index_cache_hit_rate.equals(rhs.index_cache_hit_rate))))&&((this.db_size == rhs.db_size)||((this.db_size!= null)&&this.db_size.equals(rhs.db_size))))&&((this.waiting_connections == rhs.waiting_connections)||((this.waiting_connections!= null)&&this.waiting_connections.equals(rhs.waiting_connections))))&&((this.current_transaction == rhs.current_transaction)||((this.current_transaction!= null)&&this.current_transaction.equals(rhs.current_transaction))))&&((this.active_connections == rhs.active_connections)||((this.active_connections!= null)&&this.active_connections.equals(rhs.active_connections))));
    }

}
