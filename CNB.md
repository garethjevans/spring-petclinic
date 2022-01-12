# Cloud Native Buildpacks

## Changelog

* added a `.tool-versions` to ensure we are building consistently for `asdf`
* log jvm information on startup
* log classpath on startup

## To Build and Run

* `mvn clean install`
* `pack build garethjevans/spring-petclinic --path target/spring-petclinic-2.6.0-SNAPSHOT.jar`
* `docker run -p8080:8080 garethjevans/spring-petclinic`
