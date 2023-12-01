
package config.trace;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The Kubernetes Resource that is top level owner of the Pod as found through the ownerReferences metadata. This is primarily but not always a Contoller
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "kind",
    "name"
})
public class Root_owner {

    /**
     * The kind or type of Kubernetes resource
     * 
     */
    @JsonProperty("kind")
    @JsonPropertyDescription("The kind or type of Kubernetes resource")
    private String kind;
    /**
     * The unique name of the Kubernetes resource
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The unique name of the Kubernetes resource")
    private String name;

    /**
     * The kind or type of Kubernetes resource
     * 
     */
    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    /**
     * The kind or type of Kubernetes resource
     * 
     */
    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    public Root_owner withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * The unique name of the Kubernetes resource
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The unique name of the Kubernetes resource
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Root_owner withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Root_owner.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("kind");
        sb.append('=');
        sb.append(((this.kind == null)?"<null>":this.kind));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.kind == null)? 0 :this.kind.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Root_owner) == false) {
            return false;
        }
        Root_owner rhs = ((Root_owner) other);
        return (((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.kind == rhs.kind)||((this.kind!= null)&&this.kind.equals(rhs.kind))));
    }

}
