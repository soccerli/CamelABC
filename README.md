# ABC, or a Hello World project for Apache Camel

At the time of year 2021, Apache Camel is still being used in industry even it started many years ago. It is often
confusing to learn Camel without a simple running example, with which we can add new code later.  This Hello World project intends to show the basics of
Camel in a practical way, and tries to explore different implementations of Apache Camel.

All child projects in this project are doing the same and simplest thing: starts a single Camel route ("from" is C:\input
and "to" is C:\output). Once a child project is started and running successfully, any file coped to the folder C:\input
will be moved to C:\output automatically.

This is so simple, but to get it up and running, and to have a working Camel project from scratch is hard at the begining. I hope this Hello World project can help others who are trying
to get started on Camel.

## Instructions

Check each child project to see its details and instructions. 

- [Plain Camel - A Maven project with Camel only and nothing else](camelplain/README.md)
- [Camel Spring with Java config](camelspring/README.md)
- [Camel Spring with XML config](camelspringxml/README.md)
- [Camel Spring Boot](camelspringboot/README.md)
- [Camel Spring deployed on Jboss Fuse](camelSpringInFuse/README.md)

## Dependencies

The project is created with Java 8 and Maven. See each child project for detailed dependencies.
