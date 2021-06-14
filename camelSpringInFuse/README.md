# A Maven Hello World project with Camel Spring, and can be deployed and run in Jboss Fuse
## Summary
1. In pom.xml, added <packaging>bundle</packaging> since we need to package it as a bundle in order to deploy to Fuse
2. In pom.xml, added felix maven-bundle-plugin to build a bundle 
3. In pom.xml, dependencies are camel-core only for this Hello World project as we are not writing any Spring code.
   camel-spring dependency may be needed if we want to add more code in the future.
4. This project starts a single Camel route,"from" is C:\input and "to" is C:\output. 
5. The single route and Camel context are defined in a .xml file located at src/main/resources/META-INF/spring/. 
This is the default place for Fuse to look for config file during run time.

## How to build:
With any terminal, go to the project folder where the pom file is, run the command "mvn clean install"

In pom.xml, groupId, artifactId are defined as below. Above mvn command will build/package a bundle(.jar) and copy it to
$M2_HOME/repository/**com/example/camelspringInFuse/1.0-SNAPSHOT**

    <groupId>com.example</groupId>
    <artifactId>camelspringInFuse</artifactId>
    <version>1.0-SNAPSHOT</version>

## How to run:
With any terminal, go to $FUSE_HOME/bin folder, run the command "fuse.bat"

Once Fuse started successfully, Fuse karaf CLI is available to use in the terminal. 
Install the bundle with below command in FUSE CLI:

        install mvn:com.example/camelspringInFuse/1.0-SNAPSHOT

Verify the bundle is installed successfully with the osgi list command:

        osgi:list
    
and you should see something like below in the list:

        [ 296] [Installed  ] [            ] [       ] [   80] camelspringInFuse (1.0.0.SNAPSHOT)
In my example the bundle is installed with bundle id 296, start the bundle with below command:

         start 296
The bundle status should become "Active" as below:

         [ 296] [Active     ] [            ] [Started] [   80] camelspringInFuse (1.0.0.SNAPSHOT)

Now the Camel Context is created and the single route we defined in the .xml file is up and running.
Test it out by copying some file to C:/input, it will be moved to C:/output automatically.

## Dependencies
Minimum for the purpose, see pom.xml

## Reference, and credit to:
https://www.javainuse.com/camel/camel5