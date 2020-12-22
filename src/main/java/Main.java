public class Main {
    public static void main(String[] args){
        System.out.println("in main:");
        Producer producer = new Producer();
        producer.sendMessage("dummy message");
    }
}



/*
- Create project
Choose directory
Create Project
Choose Gradle
Create Main.java

In Java, every file is a class
build.gradle has similar functionality to package.json ]in javascript. This file contains this block below, which  is similar to index.js. It is the entry point to our app. It alsodetermine the driver file
ext {
    javaMainClass = "Main"
}


- Personal Work:
./gradlew build: compile the file. Used to test if there are compiled errors,
./gradlew run: build and run

- Compile jar file:
./gradlew jar

- Run jar file
 cd /build/libs
 java -jar test-project-1.0-SNAPSHOT.jar
 */


/*
TOPICS:
*  Access Modifier:
    default, public, private, protected
        access modifiers are applicable for class/method/properies.
        Notice that properies are the variables of the class. Variable of methods and constructor are not consider class method

* static: being shared across instances of the class
* final: independent across instance
* static final: final, but save memory since we save only one copy

* java convention 1: order of declaration: properties > constructor > methods
  methods and variables are camelCase
  Classes capitalized, packages are not

* with intellij, hover cursor over the constructor (on the right of the equal sign) to read doc of methods, and on the left to read doc of class
  ProducerRecord<String, String> producerRecord = new ProducerRecord<>("quickstart-events", "quickstart-events", message);
* with intelliJ, can tri opt +Enter > import class

* Interface + Override vs. Abstract
* Super
 */




/*
4 Principles of OOP:
https://medium.com/@cancerian0684/what-are-four-basic-principles-of-object-oriented-programming-645af8b43727
- Encapsulation: regulate access to methods and properties within a class. var should be private, methods should be public
- Abstraction: electric socket
- Inheritance: Is-A (Inheritance) vs Has-A (Composition)
- Polymorphism: Multiple forms
 */

/*
SOLID Design
 */

/*
Generic
 */

