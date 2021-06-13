## A Maven Hello World project with Camel Spring Boot
##Summary
1. This project uses camel-spring-boot-starter. Spring Boot is such a black box and that's all it needs.
2. This project runs as a Spring Boot Application.
3. camel.springboot.main-run-controller = true is added in file application.properties to let the application keep running.
4. This project starts a single Camel route,"from" is C:\input and "to" is C:\output.

##How to run:
With any terminal, go to the project folder where the pom file is, run command "mvn clean package spring-boot:run"
. 

Once it started successfully, any file coped to the folder C:\input
will be moved to C:\output automatically.

##Dependencies
Minimum for the purpose, see pom.xml

##Reference:
https://camel.apache.org/camel-spring-boot/latest/