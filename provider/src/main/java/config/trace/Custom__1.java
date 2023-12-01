
package config.trace;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * An open ended object used for custom event data. Only a single root key is allowed, this represents the event type and avoids type collisions in the context of the entire schema.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({

})
public class Custom__1 {


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Custom__1 .class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
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
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Custom__1) == false) {
            return false;
        }
        Custom__1 rhs = ((Custom__1) other);
        return true;
    }

}
