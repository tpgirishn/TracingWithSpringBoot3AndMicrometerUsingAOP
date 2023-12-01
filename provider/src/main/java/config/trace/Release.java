
package config.trace;

import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Contextual information on the current release
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "commit_hash",
    "created_at",
    "version"
})
public class Release {

    /**
     * The git commit sha for the deploy
     * 
     */
    @JsonProperty("commit_hash")
    @JsonPropertyDescription("The git commit sha for the deploy")
    private String commit_hash;
    /**
     * When the release was created, ISO8601 date time.
     * 
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm", timezone = "UTC")
    @JsonProperty("created_at")
    @JsonPropertyDescription("When the release was created, ISO8601 date time.")
    private LocalDateTime created_at;
    /**
     * Deploy version, can be an unique string. Ex: 1.1.2 or a43fdw
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("Deploy version, can be an unique string. Ex: 1.1.2 or a43fdw")
    private String version;

    /**
     * The git commit sha for the deploy
     * 
     */
    @JsonProperty("commit_hash")
    public String getCommit_hash() {
        return commit_hash;
    }

    /**
     * The git commit sha for the deploy
     * 
     */
    @JsonProperty("commit_hash")
    public void setCommit_hash(String commit_hash) {
        this.commit_hash = commit_hash;
    }

    public Release withCommit_hash(String commit_hash) {
        this.commit_hash = commit_hash;
        return this;
    }

    /**
     * When the release was created, ISO8601 date time.
     * 
     */
    @JsonProperty("created_at")
    public LocalDateTime getCreated_at() {
        return created_at;
    }

    /**
     * When the release was created, ISO8601 date time.
     * 
     */
    @JsonProperty("created_at")
    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public Release withCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
        return this;
    }

    /**
     * Deploy version, can be an unique string. Ex: 1.1.2 or a43fdw
     * 
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * Deploy version, can be an unique string. Ex: 1.1.2 or a43fdw
     * 
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    public Release withVersion(String version) {
        this.version = version;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Release.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("commit_hash");
        sb.append('=');
        sb.append(((this.commit_hash == null)?"<null>":this.commit_hash));
        sb.append(',');
        sb.append("created_at");
        sb.append('=');
        sb.append(((this.created_at == null)?"<null>":this.created_at));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
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
        result = ((result* 31)+((this.created_at == null)? 0 :this.created_at.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.commit_hash == null)? 0 :this.commit_hash.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Release) == false) {
            return false;
        }
        Release rhs = ((Release) other);
        return ((((this.created_at == rhs.created_at)||((this.created_at!= null)&&this.created_at.equals(rhs.created_at)))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.commit_hash == rhs.commit_hash)||((this.commit_hash!= null)&&this.commit_hash.equals(rhs.commit_hash))));
    }

}
