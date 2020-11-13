# Advanced_Java
Advanced Java course

### Imperative programming:  
This programming approach is about how a program should be executed step by step

### Declarative programming:  
This approach is about not necessarily how but what should be executed

### What is Lambda expression:
Lambda expression is an anonymous function without a name that doesn't belong to any class.

    Method                  |           Lambda Expression
    ------------------------------------------------------
    Name                    |           No Name
    Parameters List         |           Parameters list
    Body                    |           Body (main part)
    return type             |           No return type(JVM infers the return type by scanning the code)               
    
    General Syntax
    ()              ->          { }
    Lambda         Arrow        Lambda 
    Input          denoting     Body
    Parameters     Lambda

Any interface with Single Abstract method is a functional interface and implementation may be treated as lambda expression

```@FunctionalInterface``` annotation denotes that method can be treated as lambda expression.  
Functional interface have default and static methods which have an implementation  

### Consumer interface: 
It is a part of java.util.function package  
It takes one argument and produces the result  


### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.4.RELEASE/gradle-plugin/reference/html/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)