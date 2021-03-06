package com.bloomtech.catsanddogs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// This is a SpringBoot server application.
// SpringBoot is a framework for managing a server application.
// A framework is a set of classes to make common processing easier.
//      Framework examples: collections (Lists, Stacks, Queue) makes it easier to store data

// SpringBoot uses a Tomcat Server with the name localhost and using port 8080
// Tomcat is a free open source server from Apache used by many Java applications
// localhost - a name used by any process running on your computer that can take and handle requests
// a port is what an application listens to for requests
//      think of a port as an apartment number in an apartment building
// localhost:8080 --> you want to go to localhost street, apartment 8080


@SpringBootApplication  // This tells the server that this is a SpringBoot application --> this is the guy in charge!
public class Application {
    // The start of the server occurs in a main() method just like any other Java app
    public static void main(String[] args) {
        // Start the server for the specified class and any args to pass to the server:
        SpringApplication.run(Application.class, args);
    }

}
