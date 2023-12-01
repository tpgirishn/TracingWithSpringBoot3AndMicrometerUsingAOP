
package config.trace;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Contextual information about the hosting platform (AWS, Google Cloud, Heroku, etc) the application is hosted.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "heroku",
    "aws_ec2",
    "kubernetes"
})
public class Platform {

    /**
     * Contextual information for the Heroku platform.
     * 
     */
    @JsonProperty("heroku")
    @JsonPropertyDescription("Contextual information for the Heroku platform.")
    private Heroku heroku;
    /**
     * Information about the Amazon EC2 instance
     * 
     */
    @JsonProperty("aws_ec2")
    @JsonPropertyDescription("Information about the Amazon EC2 instance")
    private Aws_ec2 aws_ec2;
    /**
     * Contextual information about the Pod running on the Kubernetes platform
     * 
     */
    @JsonProperty("kubernetes")
    @JsonPropertyDescription("Contextual information about the Pod running on the Kubernetes platform")
    private Kubernetes kubernetes;

    /**
     * Contextual information for the Heroku platform.
     * 
     */
    @JsonProperty("heroku")
    public Heroku getHeroku() {
        return heroku;
    }

    /**
     * Contextual information for the Heroku platform.
     * 
     */
    @JsonProperty("heroku")
    public void setHeroku(Heroku heroku) {
        this.heroku = heroku;
    }

    public Platform withHeroku(Heroku heroku) {
        this.heroku = heroku;
        return this;
    }

    /**
     * Information about the Amazon EC2 instance
     * 
     */
    @JsonProperty("aws_ec2")
    public Aws_ec2 getAws_ec2() {
        return aws_ec2;
    }

    /**
     * Information about the Amazon EC2 instance
     * 
     */
    @JsonProperty("aws_ec2")
    public void setAws_ec2(Aws_ec2 aws_ec2) {
        this.aws_ec2 = aws_ec2;
    }

    public Platform withAws_ec2(Aws_ec2 aws_ec2) {
        this.aws_ec2 = aws_ec2;
        return this;
    }

    /**
     * Contextual information about the Pod running on the Kubernetes platform
     * 
     */
    @JsonProperty("kubernetes")
    public Kubernetes getKubernetes() {
        return kubernetes;
    }

    /**
     * Contextual information about the Pod running on the Kubernetes platform
     * 
     */
    @JsonProperty("kubernetes")
    public void setKubernetes(Kubernetes kubernetes) {
        this.kubernetes = kubernetes;
    }

    public Platform withKubernetes(Kubernetes kubernetes) {
        this.kubernetes = kubernetes;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Platform.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("heroku");
        sb.append('=');
        sb.append(((this.heroku == null)?"<null>":this.heroku));
        sb.append(',');
        sb.append("aws_ec2");
        sb.append('=');
        sb.append(((this.aws_ec2 == null)?"<null>":this.aws_ec2));
        sb.append(',');
        sb.append("kubernetes");
        sb.append('=');
        sb.append(((this.kubernetes == null)?"<null>":this.kubernetes));
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
        result = ((result* 31)+((this.heroku == null)? 0 :this.heroku.hashCode()));
        result = ((result* 31)+((this.kubernetes == null)? 0 :this.kubernetes.hashCode()));
        result = ((result* 31)+((this.aws_ec2 == null)? 0 :this.aws_ec2 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Platform) == false) {
            return false;
        }
        Platform rhs = ((Platform) other);
        return ((((this.heroku == rhs.heroku)||((this.heroku!= null)&&this.heroku.equals(rhs.heroku)))&&((this.kubernetes == rhs.kubernetes)||((this.kubernetes!= null)&&this.kubernetes.equals(rhs.kubernetes))))&&((this.aws_ec2 == rhs.aws_ec2)||((this.aws_ec2 != null)&&this.aws_ec2 .equals(rhs.aws_ec2))));
    }

}
