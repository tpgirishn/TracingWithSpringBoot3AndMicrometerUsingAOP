
package config.trace;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Contextual information about the Pod running on the Kubernetes platform
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "container_name",
    "labels",
    "namespace",
    "pod_name",
    "root_owner"
})
public class Kubernetes {

    /**
     * The unique identifier for the Docker container running inside the Kubernetes Pod
     * (Required)
     * 
     */
    @JsonProperty("container_name")
    @JsonPropertyDescription("The unique identifier for the Docker container running inside the Kubernetes Pod")
    private String container_name;
    /**
     * The collection of key value pairs found in the Kubernetes Pod metadata field Labels
     * 
     */
    @JsonProperty("labels")
    @JsonPropertyDescription("The collection of key value pairs found in the Kubernetes Pod metadata field Labels")
    private Labels labels;
    /**
     * The Kubernetes namespace in which the Pod is running
     * (Required)
     * 
     */
    @JsonProperty("namespace")
    @JsonPropertyDescription("The Kubernetes namespace in which the Pod is running")
    private String namespace;
    /**
     * The name of the Kubernetes Pod in which the Docker container is running
     * (Required)
     * 
     */
    @JsonProperty("pod_name")
    @JsonPropertyDescription("The name of the Kubernetes Pod in which the Docker container is running")
    private String pod_name;
    /**
     * The Kubernetes Resource that is top level owner of the Pod as found through the ownerReferences metadata. This is primarily but not always a Contoller
     * 
     */
    @JsonProperty("root_owner")
    @JsonPropertyDescription("The Kubernetes Resource that is top level owner of the Pod as found through the ownerReferences metadata. This is primarily but not always a Contoller")
    private Root_owner root_owner;

    /**
     * The unique identifier for the Docker container running inside the Kubernetes Pod
     * (Required)
     * 
     */
    @JsonProperty("container_name")
    public String getContainer_name() {
        return container_name;
    }

    /**
     * The unique identifier for the Docker container running inside the Kubernetes Pod
     * (Required)
     * 
     */
    @JsonProperty("container_name")
    public void setContainer_name(String container_name) {
        this.container_name = container_name;
    }

    public Kubernetes withContainer_name(String container_name) {
        this.container_name = container_name;
        return this;
    }

    /**
     * The collection of key value pairs found in the Kubernetes Pod metadata field Labels
     * 
     */
    @JsonProperty("labels")
    public Labels getLabels() {
        return labels;
    }

    /**
     * The collection of key value pairs found in the Kubernetes Pod metadata field Labels
     * 
     */
    @JsonProperty("labels")
    public void setLabels(Labels labels) {
        this.labels = labels;
    }

    public Kubernetes withLabels(Labels labels) {
        this.labels = labels;
        return this;
    }

    /**
     * The Kubernetes namespace in which the Pod is running
     * (Required)
     * 
     */
    @JsonProperty("namespace")
    public String getNamespace() {
        return namespace;
    }

    /**
     * The Kubernetes namespace in which the Pod is running
     * (Required)
     * 
     */
    @JsonProperty("namespace")
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public Kubernetes withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * The name of the Kubernetes Pod in which the Docker container is running
     * (Required)
     * 
     */
    @JsonProperty("pod_name")
    public String getPod_name() {
        return pod_name;
    }

    /**
     * The name of the Kubernetes Pod in which the Docker container is running
     * (Required)
     * 
     */
    @JsonProperty("pod_name")
    public void setPod_name(String pod_name) {
        this.pod_name = pod_name;
    }

    public Kubernetes withPod_name(String pod_name) {
        this.pod_name = pod_name;
        return this;
    }

    /**
     * The Kubernetes Resource that is top level owner of the Pod as found through the ownerReferences metadata. This is primarily but not always a Contoller
     * 
     */
    @JsonProperty("root_owner")
    public Root_owner getRoot_owner() {
        return root_owner;
    }

    /**
     * The Kubernetes Resource that is top level owner of the Pod as found through the ownerReferences metadata. This is primarily but not always a Contoller
     * 
     */
    @JsonProperty("root_owner")
    public void setRoot_owner(Root_owner root_owner) {
        this.root_owner = root_owner;
    }

    public Kubernetes withRoot_owner(Root_owner root_owner) {
        this.root_owner = root_owner;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Kubernetes.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("container_name");
        sb.append('=');
        sb.append(((this.container_name == null)?"<null>":this.container_name));
        sb.append(',');
        sb.append("labels");
        sb.append('=');
        sb.append(((this.labels == null)?"<null>":this.labels));
        sb.append(',');
        sb.append("namespace");
        sb.append('=');
        sb.append(((this.namespace == null)?"<null>":this.namespace));
        sb.append(',');
        sb.append("pod_name");
        sb.append('=');
        sb.append(((this.pod_name == null)?"<null>":this.pod_name));
        sb.append(',');
        sb.append("root_owner");
        sb.append('=');
        sb.append(((this.root_owner == null)?"<null>":this.root_owner));
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
        result = ((result* 31)+((this.namespace == null)? 0 :this.namespace.hashCode()));
        result = ((result* 31)+((this.root_owner == null)? 0 :this.root_owner.hashCode()));
        result = ((result* 31)+((this.container_name == null)? 0 :this.container_name.hashCode()));
        result = ((result* 31)+((this.labels == null)? 0 :this.labels.hashCode()));
        result = ((result* 31)+((this.pod_name == null)? 0 :this.pod_name.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Kubernetes) == false) {
            return false;
        }
        Kubernetes rhs = ((Kubernetes) other);
        return ((((((this.namespace == rhs.namespace)||((this.namespace!= null)&&this.namespace.equals(rhs.namespace)))&&((this.root_owner == rhs.root_owner)||((this.root_owner!= null)&&this.root_owner.equals(rhs.root_owner))))&&((this.container_name == rhs.container_name)||((this.container_name!= null)&&this.container_name.equals(rhs.container_name))))&&((this.labels == rhs.labels)||((this.labels!= null)&&this.labels.equals(rhs.labels))))&&((this.pod_name == rhs.pod_name)||((this.pod_name!= null)&&this.pod_name.equals(rhs.pod_name))));
    }

}
