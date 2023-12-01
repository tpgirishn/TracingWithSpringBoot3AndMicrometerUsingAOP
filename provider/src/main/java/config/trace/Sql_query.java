
package config.trace;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * An outgoing SQL query sent from the application.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sql",
    "time_ms"
})
public class Sql_query {

    /**
     * The actual SQL statement sent.
     * (Required)
     * 
     */
    @JsonProperty("sql")
    @JsonPropertyDescription("The actual SQL statement sent.")
    private String sql;
    /**
     * The duration, in fractional milliseconds, that it took to complete this event.
     * (Required)
     * 
     */
    @JsonProperty("time_ms")
    @JsonPropertyDescription("The duration, in fractional milliseconds, that it took to complete this event.")
    private Double time_ms;

    /**
     * The actual SQL statement sent.
     * (Required)
     * 
     */
    @JsonProperty("sql")
    public String getSql() {
        return sql;
    }

    /**
     * The actual SQL statement sent.
     * (Required)
     * 
     */
    @JsonProperty("sql")
    public void setSql(String sql) {
        this.sql = sql;
    }

    public Sql_query withSql(String sql) {
        this.sql = sql;
        return this;
    }

    /**
     * The duration, in fractional milliseconds, that it took to complete this event.
     * (Required)
     * 
     */
    @JsonProperty("time_ms")
    public Double getTime_ms() {
        return time_ms;
    }

    /**
     * The duration, in fractional milliseconds, that it took to complete this event.
     * (Required)
     * 
     */
    @JsonProperty("time_ms")
    public void setTime_ms(Double time_ms) {
        this.time_ms = time_ms;
    }

    public Sql_query withTime_ms(Double time_ms) {
        this.time_ms = time_ms;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sql_query.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("sql");
        sb.append('=');
        sb.append(((this.sql == null)?"<null>":this.sql));
        sb.append(',');
        sb.append("time_ms");
        sb.append('=');
        sb.append(((this.time_ms == null)?"<null>":this.time_ms));
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
        result = ((result* 31)+((this.sql == null)? 0 :this.sql.hashCode()));
        result = ((result* 31)+((this.time_ms == null)? 0 :this.time_ms.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sql_query) == false) {
            return false;
        }
        Sql_query rhs = ((Sql_query) other);
        return (((this.sql == rhs.sql)||((this.sql!= null)&&this.sql.equals(rhs.sql)))&&((this.time_ms == rhs.time_ms)||((this.time_ms!= null)&&this.time_ms.equals(rhs.time_ms))));
    }

}
