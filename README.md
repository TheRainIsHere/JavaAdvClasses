# JavaAdvClasses
 _(derived from CISC191M4AdvancedClasses)_


Java Test Driven Development (TDD) project to program Java classes with unit testing ( with **JUnit** )

________

![220px-MesaLogo](https://github.com/schougaard/SanDiegoMesaCISC191ProgrammingChallenges/assets/716243/334f6724-6afa-4198-9eff-7c49c472cd35)

# San Diego Mesa College CISC 191 Programming Challenges
Programming challenges for San Diego Community College CISC 191 Intermediate Java classes.

Created by
- Professor Dr. Tasha Frankie
- and Professor [Allan Schougaard](https://github.com/schougaard), San Diego Mesa College.

With contributions from: 
- Dom David,
- [Dan Sullivan](https://github.com/uid100)

________

## Assignment Overview
Inheritance and polymorphism are two important concepts in Java programming that allow for code reusability, flexibility, and extensibility.
Inheritance allows a new class to inherit the properties and methods of an existing class. This can be used to avoid duplicating code and to create a hierarchical relationship between classes. For example, we could create a Vehicle class that has properties and methods for all vehicles, such as getSpeed() and brake(). We could then create more specific classes, such as Car and Truck, that inherit from Vehicle and add their own unique properties and methods.
Polymorphism allows us to have different objects that respond to the same message in different ways. This is achieved through method overriding, where a subclass can provide its own implementation for a method that is also defined in its parent class. For example, the Vehicle class might have a method called move(). The Car class could override this method to provide its own implementation that describes how a car moves. This allows us to write code that is more flexible and extensible, as we don't have to worry about the specific type of object that we are working with.
Inheritance and polymorphism are powerful tools that can be used to improve the quality and maintainability of Java code. By using these concepts effectively, we can write code that is more reusable, flexible, and extensible.
The goal of this assignment is to expand on your knowledge of writing classes in java by incorporating inheritance. You will implement several java classes some of which are connected via the is-a relationship and some via the has-a relationship. As always, other content such as arrays may show up in this programming assignment. In this challenge you are going to write code to help a bike shop.

________

## Instructions

## _(Open the Project)_
1. From the **<> Code** dropdown link in the repository (above), download the Zip file to your computer.
2. Extract the files to your working folder
3. Open Eclipse and import the project. 
   - You can use File>Import menu item or right-click in the Package Manager and choose Import.
   - select General>Projects from Folder or Archive
   - navigate into the project until you see the `bin` and `src` folders, and choose *open*
4. Expand the project in the package explorer and find the .java files below the **src** folder.

## _(Complete the Assignment)_
![class diagram](JavaAdvClasses_diagram.png)
In this challenge you are going to write code to relating to a bike shop. 

This programming assignment is tested using JUnit testing so the Tester class will help guide you in finding the relationships between the classes along with this programming assignment spec. 
The project comes with several files which are a mix of classes, subclasses, abstract classes, interfaces, and the tester class. A lot is going on, so take it one test method at a time

Cycle: Abstract superclass
      Unicycle: Subclass of Cycle
      Bicycle:  Subclass of Cycle
      ElectricMountainBike: Subclass of Cycle
Gearable / Movable: Interfaces
Similar to programming assignments 1 and 3, you will use the tester class to guide you in completing this programming assignment along with this programming assignment guide.
Cycle: Abstract superclass
      Unicycle: Subclass of Cycle
      Bicycle:  Subclass of Cycle
      ElectricMountainBike: Subclass of Cycle
Gearable / Movable: Interfaces
 
___________
## Complete and zip the project
1. Run and add the code to the src folder until the tests are successful.
2. Uncomment each test case in the **Test** file (`TestAdvancedClasses.java`), one at a time. 
Do not modify the content in this file except to uncomment the tests. Add and modify class files
as needed for the tests to pass.
3. Review and refactor any of the code as needed:
    - be sure your code follows good coding practices and coding style and standards.
    - update the javadoc comments at the top of the file to add your name as author
    - update the comments for each method in the file.
4. Export the project as a zip file and submit your work.

___________

## Rubric

[Rubric](Rubric.md)


___________

_this repository is a subset of the CISC191 exercises. It is derived from the CISC191ProgrammingChallenges 
activity hosted by Professor Allan Schougaard, San Diego Mesa College, and not a direct fork._

_This project is to decompose that repository into git submodules_
