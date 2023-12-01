
package config.trace;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Represents a user in the platform being logged. The interpretation of "user" is left to the consumer.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "email",
    "id",
    "meta",
    "name",
    "type"
})
public class User {

    /**
     * An email address for the user. This need not be unique to the user. Note that no validation is performed on this field.
     * 
     */
    @JsonProperty("email")
    @JsonPropertyDescription("An email address for the user. This need not be unique to the user. Note that no validation is performed on this field.")
    private String email;
    /**
     * A unique identifier for the user.
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A unique identifier for the user.")
    private String id;
    /**
     * Additional custom metadata you'd like to add to the user.
     * 
     */
    @JsonProperty("meta")
    @JsonPropertyDescription("Additional custom metadata you'd like to add to the user.")
    private Meta meta;
    /**
     * A display name for the user.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("A display name for the user.")
    private String name;
    /**
     * The type of user. Used in systems where there are multiple user types. This helps to denote users in the case of polymorphism.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of user. Used in systems where there are multiple user types. This helps to denote users in the case of polymorphism.")
    private String type;

    /**
     * An email address for the user. This need not be unique to the user. Note that no validation is performed on this field.
     * 
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * An email address for the user. This need not be unique to the user. Note that no validation is performed on this field.
     * 
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public User withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * A unique identifier for the user.
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * A unique identifier for the user.
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public User withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Additional custom metadata you'd like to add to the user.
     * 
     */
    @JsonProperty("meta")
    public Meta getMeta() {
        return meta;
    }

    /**
     * Additional custom metadata you'd like to add to the user.
     * 
     */
    @JsonProperty("meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public User withMeta(Meta meta) {
        this.meta = meta;
        return this;
    }

    /**
     * A display name for the user.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * A display name for the user.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public User withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The type of user. Used in systems where there are multiple user types. This helps to denote users in the case of polymorphism.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * The type of user. Used in systems where there are multiple user types. This helps to denote users in the case of polymorphism.
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public User withType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(User.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("meta");
        sb.append('=');
        sb.append(((this.meta == null)?"<null>":this.meta));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        result = ((result* 31)+((this.meta == null)? 0 :this.meta.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof User) == false) {
            return false;
        }
        User rhs = ((User) other);
        return ((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))))&&((this.meta == rhs.meta)||((this.meta!= null)&&this.meta.equals(rhs.meta))));
    }

}
