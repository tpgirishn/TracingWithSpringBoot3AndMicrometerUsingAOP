
package config.trace;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Represents the calling of a controller, typically logged immediately after the request is routed.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "controller",
    "action",
    "params_json"
})
public class Controller_call {

    /**
     * The name of the controller being called.
     * (Required)
     * 
     */
    @JsonProperty("controller")
    @JsonPropertyDescription("The name of the controller being called.")
    private String controller;
    /**
     * The name of the controller action being called.
     * (Required)
     * 
     */
    @JsonProperty("action")
    @JsonPropertyDescription("The name of the controller action being called.")
    private String action;
    /**
     * An encoded JSON string representing the parsed parameters being sent to the controller. This provides additional insight without the overhead of creating and indexing fields for every paramter.
     * 
     */
    @JsonProperty("params_json")
    @JsonPropertyDescription("An encoded JSON string representing the parsed parameters being sent to the controller. This provides additional insight without the overhead of creating and indexing fields for every paramter.")
    private String params_json;

    /**
     * The name of the controller being called.
     * (Required)
     * 
     */
    @JsonProperty("controller")
    public String getController() {
        return controller;
    }

    /**
     * The name of the controller being called.
     * (Required)
     * 
     */
    @JsonProperty("controller")
    public void setController(String controller) {
        this.controller = controller;
    }

    public Controller_call withController(String controller) {
        this.controller = controller;
        return this;
    }

    /**
     * The name of the controller action being called.
     * (Required)
     * 
     */
    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    /**
     * The name of the controller action being called.
     * (Required)
     * 
     */
    @JsonProperty("action")
    public void setAction(String action) {
        this.action = action;
    }

    public Controller_call withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * An encoded JSON string representing the parsed parameters being sent to the controller. This provides additional insight without the overhead of creating and indexing fields for every paramter.
     * 
     */
    @JsonProperty("params_json")
    public String getParams_json() {
        return params_json;
    }

    /**
     * An encoded JSON string representing the parsed parameters being sent to the controller. This provides additional insight without the overhead of creating and indexing fields for every paramter.
     * 
     */
    @JsonProperty("params_json")
    public void setParams_json(String params_json) {
        this.params_json = params_json;
    }

    public Controller_call withParams_json(String params_json) {
        this.params_json = params_json;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Controller_call.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("controller");
        sb.append('=');
        sb.append(((this.controller == null)?"<null>":this.controller));
        sb.append(',');
        sb.append("action");
        sb.append('=');
        sb.append(((this.action == null)?"<null>":this.action));
        sb.append(',');
        sb.append("params_json");
        sb.append('=');
        sb.append(((this.params_json == null)?"<null>":this.params_json));
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
        result = ((result* 31)+((this.action == null)? 0 :this.action.hashCode()));
        result = ((result* 31)+((this.controller == null)? 0 :this.controller.hashCode()));
        result = ((result* 31)+((this.params_json == null)? 0 :this.params_json.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Controller_call) == false) {
            return false;
        }
        Controller_call rhs = ((Controller_call) other);
        return ((((this.action == rhs.action)||((this.action!= null)&&this.action.equals(rhs.action)))&&((this.controller == rhs.controller)||((this.controller!= null)&&this.controller.equals(rhs.controller))))&&((this.params_json == rhs.params_json)||((this.params_json!= null)&&this.params_json.equals(rhs.params_json))));
    }

}
