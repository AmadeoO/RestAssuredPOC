
# POC - SerenityBDD & RestAssured

This is a sample Rest API test solution for sample endpoints available in https://gorest.co.in/
 The published APIs represent a blog system where user can be create, update and yours posts and comments.

Tests are written using a combination of SerenityBDD, RestAssured, Cucumber and Screenplay pattern.
Tests run with  Junit & Maven.



## Technology Stack

- Java
- RestAssured
- Serenity BDD
- Screenplay
- Cucumber
- JUnit
- Maven

## Prerequisites

* [Java 1.8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - Java Dev Kit
* [Maven](https://maven.apache.org/download.cgi) - Dependency Manager
## Application Under Test

We are using Go-Rest APIs as the Application Under Test.

* URL : https://gorest.co.in/
## The Project Directory Structure
### Screenplay scheme
![Logo](https://blog.caplin.com/wp-content/uploads/2016/12/screenPlayWorkFlow.png)

The project follows the standard directory structure used in most Serenity projects:

```   
src
  + main
    + java                          
        + facts                      A Fact is a way of declaring details about an actor.                                    
        + interaction                An interaction allows usto interact with the elements/queries
        + question                   An actor asks questions about state elements
        + tasks                      An actor performs actions for interact with elements
      
  + test
    + java                          
      + runners                     Test runner(senerity runner/trigger configurations)
      + serenitySteps               Steps developed for our step definitions
      + stepdefinitions             Step definitions for the BDD feature
    + resources
      + features                  Feature files

```
Still Missing:
+ endpoints       TODO             endpoints of the services
+ utils           TODO             Common utility methods
+ properties      TODO             AUT properties files 


### Installation and Test Execution
Following instructions will help you running the project.

First, clone this project locally on your machine from the "main" branch.

Open the project in any IDE Eclipse/IntelliJ. Run the following command in Terminal and build the project. It will automatically download all the required dependencies.

```
$ mvn clean install
```
### Execute Tests

Run the following command in Terminal to execute tests.

```sh
$ mvn clean verify
```
### Test Report

You can find the Serenity reports in the following directory of the Project.

```sh
/target/site/serenity/
```

In the serenity directory, open "index.html" file to view the report.
 