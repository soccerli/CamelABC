# A Maven Hello World project with Camel Blueprint, and can be deployed and run on Jboss Fuse with Karaf as the container
## Summary
1. In pom.xml, added \<packaging>bundle\</packaging> since we need to package it as a bundle in order to deploy to Fuse
2. In pom.xml, added felix maven-bundle-plugin to build a bundle 
3. In pom.xml, dependencies are camel-core and camel-blueprint.
4. This project starts a single Camel route,"from" is C:\input and "to" is C:\output. 
5. The single route and Camel context are defined in a .xml file located at src/main/resources/OSGI-INF/blueprint/. 
This is the default place for Fuse  to look for config file during run time.

## How to build:
With any terminal, go to the project folder where the pom file is, run the command "mvn clean install"

In pom.xml, groupId, artifactId are defined as below. Above mvn command will build/package a bundle(.jar) and copy it to
$M2_HOME/repository/**com/example/camelBlueprintInFuse/1.0-SNAPSHOT**

    <groupId>com.example</groupId>
    <artifactId>camelBlueprintInFuse</artifactId>
    <version>1.0-SNAPSHOT</version>

## How to run:
With any terminal, go to $FUSE_HOME/bin folder, run the command "fuse.bat"

Once Fuse started successfully, Fuse karaf CLI is available to use in the terminal. 
Install the bundle with below command in FUSE CLI:

        install mvn:com.example/camelBlueprintInFuse/1.0-SNAPSHOT

Verify the bundle is installed successfully with the osgi list command:

        osgi:list
    
and you should see something like below in the list:

        [ 320] [Installed  ] [            ] [       ] [   80] camelBlueprintInFuse (1.0.0.SNAPSHOT)
In my example the bundle is installed with bundle id 320, start the bundle with below command:

         start 320
The bundle status should become "Active" as below:

         [ 320] [Active     ] [Created     ] [       ] [   80] camelBlueprintInFuse (1.0.0.SNAPSHOT)

Now the Camel Context is created and the single route we defined in the .xml file is up and running.
Test it out by copying some file to C:/input, it will be moved to C:/output automatically.

## Dependencies
Minimum for the purpose, see pom.xml

## Reference
https://access.redhat.com/documentation/en-us/red_hat_fuse/7.8/html/getting_started/index

Note at this link Redhat provides the information but in a way
of how to use their IDE of CodeReady studio, not really a friendly document for people to get started. 

## Additional implementations
Two Beans, including one implementing Camel Processor class are added in this Hello World project.
All they do is printing a message along the route execution, and the printed messages can be found 
in the log file $FUSE_HOME/data/log/fuse.log. Check the .xml file and Java classes 
for details, it is straight forward.