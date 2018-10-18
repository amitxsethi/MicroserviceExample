
execute below
mvn clean install
//manual step - extract the jar file from the target folder at the project level
mvn dockerfile:build
docker run -p 8080:8080 -t amit.x.sethi/sample-microservice
