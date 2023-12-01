
# **Structured Logging with Micrometer and Spring Boot 3**

As part of this Proof Of Concept (PoC), we are trying to enforce a structure to the log events using a json schema file (where the structure of the log message can be specified) being logged.

### Prerequisites to run
* Docker
* Java 17
* Gradle 7.5 or above

### Build and Run the Project
* Build the common trace lib project used for logging and build the target app using this common library 
  * `make`
* Run the project
  * `docker compose up`

### Components of this project
 * trace (a standalone library which can be imported as a POM dependency in the project you wish to introduce logging)
 * provider (the target sample microservice where you would introduce logging capabilities using the above library)

### Usage
1. Create a traceConfig.json file in resources/json folder of your microservice.
2. Paste the schema of the log structure you would like for your log events.
3. Run `./gradlew build`
4. A TraceConfig.java file would be created in config.trace package in your microservice project.
5. Import a class in this TraceConfig.java file by copying the below line.
`import org.springframework.stereotype.Component;`
6. Annotate the TraceConfig class with `@Component("traceConfig")` 
7. Make the same class implement the `com.thoughtworks.tracing.config.TraceConfigInterface` interface and implement the **toJsonString** method.
8. Now run the `make` file and you are all set to deploy the services by running `docker compose up` as the last step.

## Testing
Run the below command for a few number of times
`curl localhost:7654/product/09`

You can search the logs and traces getting generated at the zipkin console
located at http://localhost:9411/zipkin/ using the traceId getting printed in the docker container console.
To access the docker container console logs use the command
docker logs --follow container Id of your microservice here in this case provider microservice>

