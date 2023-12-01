
package config.trace;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Contextual metadata about the environment the event takes place in
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "custom",
    "http",
    "job",
    "organization",
    "platform",
    "release",
    "runtime",
    "session",
    "source",
    "system",
    "user"
})
public class Context {

    /**
     * An open ended object where custom context is supplied.
     * 
     */
    @JsonProperty("custom")
    @JsonPropertyDescription("An open ended object where custom context is supplied.")
    private Custom custom;
    /**
     * Context about the HTTP request currently being processed (if any)
     * 
     */
    @JsonProperty("http")
    @JsonPropertyDescription("Context about the HTTP request currently being processed (if any)")
    private Http http;
    /**
     * Represents a task or job execution, typically for background tasks or jobs.
     * 
     */
    @JsonProperty("job")
    @JsonPropertyDescription("Represents a task or job execution, typically for background tasks or jobs.")
    private Job job;
    /**
     * Represents an organization in the platform being logged. The interpretation of "organization" is left to the consumer.
     * 
     */
    @JsonProperty("organization")
    @JsonPropertyDescription("Represents an organization in the platform being logged. The interpretation of \"organization\" is left to the consumer.")
    private Organization organization;
    /**
     * Contextual information about the hosting platform (AWS, Google Cloud, Heroku, etc) the application is hosted.
     * 
     */
    @JsonProperty("platform")
    @JsonPropertyDescription("Contextual information about the hosting platform (AWS, Google Cloud, Heroku, etc) the application is hosted.")
    private Platform platform;
    /**
     * Contextual information on the current release
     * 
     */
    @JsonProperty("release")
    @JsonPropertyDescription("Contextual information on the current release")
    private Release release;
    /**
     * Represents the language runtime details.
     * 
     */
    @JsonProperty("runtime")
    @JsonPropertyDescription("Represents the language runtime details.")
    private Runtime runtime;
    /**
     * The user's current session. A session is a way to track a user without the need for authentication. For example, a browser session is generally maintained through a cookie and assigned a unique ID.
     * 
     */
    @JsonProperty("session")
    @JsonPropertyDescription("The user's current session. A session is a way to track a user without the need for authentication. For example, a browser session is generally maintained through a cookie and assigned a unique ID.")
    private Session session;
    /**
     * Context about the source of the log
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("Context about the source of the log")
    private Source source;
    /**
     * Host and system level details tha the log was generated on.
     * 
     */
    @JsonProperty("system")
    @JsonPropertyDescription("Host and system level details tha the log was generated on.")
    private config.trace.System system;
    /**
     * Represents a user in the platform being logged. The interpretation of "user" is left to the consumer.
     * 
     */
    @JsonProperty("user")
    @JsonPropertyDescription("Represents a user in the platform being logged. The interpretation of \"user\" is left to the consumer.")
    private User user;

    /**
     * An open ended object where custom context is supplied.
     * 
     */
    @JsonProperty("custom")
    public Custom getCustom() {
        return custom;
    }

    /**
     * An open ended object where custom context is supplied.
     * 
     */
    @JsonProperty("custom")
    public void setCustom(Custom custom) {
        this.custom = custom;
    }

    public Context withCustom(Custom custom) {
        this.custom = custom;
        return this;
    }

    /**
     * Context about the HTTP request currently being processed (if any)
     * 
     */
    @JsonProperty("http")
    public Http getHttp() {
        return http;
    }

    /**
     * Context about the HTTP request currently being processed (if any)
     * 
     */
    @JsonProperty("http")
    public void setHttp(Http http) {
        this.http = http;
    }

    public Context withHttp(Http http) {
        this.http = http;
        return this;
    }

    /**
     * Represents a task or job execution, typically for background tasks or jobs.
     * 
     */
    @JsonProperty("job")
    public Job getJob() {
        return job;
    }

    /**
     * Represents a task or job execution, typically for background tasks or jobs.
     * 
     */
    @JsonProperty("job")
    public void setJob(Job job) {
        this.job = job;
    }

    public Context withJob(Job job) {
        this.job = job;
        return this;
    }

    /**
     * Represents an organization in the platform being logged. The interpretation of "organization" is left to the consumer.
     * 
     */
    @JsonProperty("organization")
    public Organization getOrganization() {
        return organization;
    }

    /**
     * Represents an organization in the platform being logged. The interpretation of "organization" is left to the consumer.
     * 
     */
    @JsonProperty("organization")
    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public Context withOrganization(Organization organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Contextual information about the hosting platform (AWS, Google Cloud, Heroku, etc) the application is hosted.
     * 
     */
    @JsonProperty("platform")
    public Platform getPlatform() {
        return platform;
    }

    /**
     * Contextual information about the hosting platform (AWS, Google Cloud, Heroku, etc) the application is hosted.
     * 
     */
    @JsonProperty("platform")
    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public Context withPlatform(Platform platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Contextual information on the current release
     * 
     */
    @JsonProperty("release")
    public Release getRelease() {
        return release;
    }

    /**
     * Contextual information on the current release
     * 
     */
    @JsonProperty("release")
    public void setRelease(Release release) {
        this.release = release;
    }

    public Context withRelease(Release release) {
        this.release = release;
        return this;
    }

    /**
     * Represents the language runtime details.
     * 
     */
    @JsonProperty("runtime")
    public Runtime getRuntime() {
        return runtime;
    }

    /**
     * Represents the language runtime details.
     * 
     */
    @JsonProperty("runtime")
    public void setRuntime(Runtime runtime) {
        this.runtime = runtime;
    }

    public Context withRuntime(Runtime runtime) {
        this.runtime = runtime;
        return this;
    }

    /**
     * The user's current session. A session is a way to track a user without the need for authentication. For example, a browser session is generally maintained through a cookie and assigned a unique ID.
     * 
     */
    @JsonProperty("session")
    public Session getSession() {
        return session;
    }

    /**
     * The user's current session. A session is a way to track a user without the need for authentication. For example, a browser session is generally maintained through a cookie and assigned a unique ID.
     * 
     */
    @JsonProperty("session")
    public void setSession(Session session) {
        this.session = session;
    }

    public Context withSession(Session session) {
        this.session = session;
        return this;
    }

    /**
     * Context about the source of the log
     * 
     */
    @JsonProperty("source")
    public Source getSource() {
        return source;
    }

    /**
     * Context about the source of the log
     * 
     */
    @JsonProperty("source")
    public void setSource(Source source) {
        this.source = source;
    }

    public Context withSource(Source source) {
        this.source = source;
        return this;
    }

    /**
     * Host and system level details tha the log was generated on.
     * 
     */
    @JsonProperty("system")
    public config.trace.System getSystem() {
        return system;
    }

    /**
     * Host and system level details tha the log was generated on.
     * 
     */
    @JsonProperty("system")
    public void setSystem(config.trace.System system) {
        this.system = system;
    }

    public Context withSystem(config.trace.System system) {
        this.system = system;
        return this;
    }

    /**
     * Represents a user in the platform being logged. The interpretation of "user" is left to the consumer.
     * 
     */
    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    /**
     * Represents a user in the platform being logged. The interpretation of "user" is left to the consumer.
     * 
     */
    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    public Context withUser(User user) {
        this.user = user;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Context.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("custom");
        sb.append('=');
        sb.append(((this.custom == null)?"<null>":this.custom));
        sb.append(',');
        sb.append("http");
        sb.append('=');
        sb.append(((this.http == null)?"<null>":this.http));
        sb.append(',');
        sb.append("job");
        sb.append('=');
        sb.append(((this.job == null)?"<null>":this.job));
        sb.append(',');
        sb.append("organization");
        sb.append('=');
        sb.append(((this.organization == null)?"<null>":this.organization));
        sb.append(',');
        sb.append("platform");
        sb.append('=');
        sb.append(((this.platform == null)?"<null>":this.platform));
        sb.append(',');
        sb.append("release");
        sb.append('=');
        sb.append(((this.release == null)?"<null>":this.release));
        sb.append(',');
        sb.append("runtime");
        sb.append('=');
        sb.append(((this.runtime == null)?"<null>":this.runtime));
        sb.append(',');
        sb.append("session");
        sb.append('=');
        sb.append(((this.session == null)?"<null>":this.session));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("system");
        sb.append('=');
        sb.append(((this.system == null)?"<null>":this.system));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
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
        result = ((result* 31)+((this.system == null)? 0 :this.system.hashCode()));
        result = ((result* 31)+((this.release == null)? 0 :this.release.hashCode()));
        result = ((result* 31)+((this.session == null)? 0 :this.session.hashCode()));
        result = ((result* 31)+((this.custom == null)? 0 :this.custom.hashCode()));
        result = ((result* 31)+((this.organization == null)? 0 :this.organization.hashCode()));
        result = ((result* 31)+((this.http == null)? 0 :this.http.hashCode()));
        result = ((result* 31)+((this.runtime == null)? 0 :this.runtime.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.job == null)? 0 :this.job.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        result = ((result* 31)+((this.platform == null)? 0 :this.platform.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Context) == false) {
            return false;
        }
        Context rhs = ((Context) other);
        return ((((((((((((this.system == rhs.system)||((this.system!= null)&&this.system.equals(rhs.system)))&&((this.release == rhs.release)||((this.release!= null)&&this.release.equals(rhs.release))))&&((this.session == rhs.session)||((this.session!= null)&&this.session.equals(rhs.session))))&&((this.custom == rhs.custom)||((this.custom!= null)&&this.custom.equals(rhs.custom))))&&((this.organization == rhs.organization)||((this.organization!= null)&&this.organization.equals(rhs.organization))))&&((this.http == rhs.http)||((this.http!= null)&&this.http.equals(rhs.http))))&&((this.runtime == rhs.runtime)||((this.runtime!= null)&&this.runtime.equals(rhs.runtime))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.job == rhs.job)||((this.job!= null)&&this.job.equals(rhs.job))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))))&&((this.platform == rhs.platform)||((this.platform!= null)&&this.platform.equals(rhs.platform))));
    }

}
