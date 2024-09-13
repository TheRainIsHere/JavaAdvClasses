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

- Cycle: Abstract superclass
      - Unicycle: Subclass of Cycle
      - Bicycle:  Subclass of Cycle
      - ElectricMountainBike: Subclass of Cycle
- Gearable / Movable: Interfaces
  
Similar to previous assignments, you will use the tester class to guide you in completing this programming assignment along with this programming assignment guide.

___________

<div>
         <h2>Programming Task(s)</h2>

        <details>
            <summary>Cycle</summary>
            <p><span>A </span><span>Cycle</span><span> is an abstract super-class that represents a </span><span>Cycle</span><span> object containing a frame number attribute with numerous instance methods.</span></p>
            <p><span>Abstract classes are not meant to be directly usable in programming. A user is meant to implement a class that extends the abstract class. In this programming assignment, your job is to implement a couple of sub-classes that will extend this class.</span></p>
            <span>When a class extends an abstract class, it must implement all abstract methods. Look at the code now and notice several methods with no bodies. These are declared abstract as the subclass is the one that must implement their logic. The super-class, however, dictates the method header and the fact that they must be implemented in the subclass. This will make more sense once you start writing the sub-classes</span><strong>.<br /><br /></strong>1) Scan the Cycle class and complete the class as you would any Java class. <br />a) Complete the constructor<br />b) Complete any getters/setters (scroll down the class)<br />c) You will have to revisit what you did in the previous Programming Assignment to solve the serial number aspect of a Boat! The Cycle class needs to keep track of all the frameNumbers that have been "handed-out" similar to how the Boat class kept track of all the serial numbers that have been used. <br />d) The constructor for the Cycle class should assign the unique frameNumber (similar to the serial number of a Cycle object) as well as incrementing whatever variable you have to keep track of the next frame number to be handed out.<br />What a baby computer calls its father
        </details>
        <details>
            <summary>Unicycle</summary>
            <ol>
                <li><span>A </span><span>Unicycle is-a Cycle</span><span>!</span><span><br /></span><span> Add the required code to define this relationship between </span><span>Cycle</span><span> and </span><span>Unicycle</span><span>!</span><span><br /></span><span>This should be the class header line! Change it by adding </span><strong><i>extends Cycle</i></strong><span> in the class header.</span></li>
                <li><span>Once you have </span><span>Unicycle</span><span> extending </span><span>Cycle</span><span>, you need a constructor that takes in a </span><span>String</span><span>.</span>public Unicycle(String newMake) {<br />super(newMake); //the call to super invokes the matching constructor in the superclass.<br />}</li>
                <li><span>When a non-abstract class (Unicycle) extends an abstract class (Cycle) then it must implement ALL abstract methods from the parent class. Eclipse can actually do it for you automatically by accepting the auto-suggested correction!</span><span><br /></span><span> Hover over the </span><span>Unicycle</span><span> error it should explain the compile error </span><i><span>The type </span></i><i><span>Unicycle</span></i><i><span> must implement the inherited abstract method</span></i><i><span> getColor()</span></i><i><span><br /></span></i><i> </i><i><span>Select the first suggested fix: add unimplemented methods<br />You may also implement these manually!<br /></span></i></li>
                <li aria-level="1"><span>Once you use the auto-suggest fix, you will find that it gives you the basic stubs for the required methods. Go back and clean them up now by adding the </span><span>public</span><span> keyword modifier as well as finishing their logic. They should have nonsensical bodies that just make the compiler happy. This is similar to what you have seen in previous programming assignments such as the dummy return lines from programming assignment 1.</span></li>
                <li aria-level="1"><span>Fix </span><span>getNumberOfWheels</span><span> so that it returns 1 since unicycles have one wheel.</span></li>
                <li><span>Add an attribute to keep track of the color of a </span><span>Unicycle</span><span> object. At the top of the </span><span>Unicycle</span><span> class, it should look like this:</span> private Color color; //a Unicycle has-a color</li>
                <li aria-level="1"><span>Complete the </span><span>getColor</span><span> method so that it's </span><span>public</span><span> and returns the </span><span>color</span><span> attribute.</span></li>
                <li aria-level="1"><span>Complete the </span><span>setter</span><span> for the </span><span>color</span><span> attribute.</span></li>
            </ol>
        </details>
        <details>
            <summary>Bicycle/ElectricMountainBike</summary>
            <ul>
                <li><span>Alter these two classes so that they extend the correct class. See the diagram in the Assignment Overview as a reminder. <br />After adding the relationship(s), you should be able to say that a Bicycle is-a Cycle and an ElectricMountainBike is-a Bicycle out loud. This portion demonstrates multi-level inheritance (NOT to be confused with multiple inheritance - not supported in Java). <br /></span></li>
                <li><span>Focus on <span style="font-family: 'Courier New';">Bicycle</span><br /></span><span>a) Add the required methods which are all the abstract methods from the Cycle class. This is similar to what was required of you in Unicycle.<br />b) Add any required attributes/fields in this class if it needs to keep track of something specific to a Bicycle</span></li>
                <li>&lt;&gt;<span style="font-family: 'Courier New';">ElectricMountainBike</span><br />If you have done everything correctly, the ElectricMountainBike class should be set up to inherit from the Bicycle class which means there's not much code in here other than the Constructor. Further changes may be required for the next testers.<br />Why is there such little code here? You are making use of inheritance to inherit public methods from super-classes. All public or protected methods and instance variables are directly inherited by sub-classes.</li>
            </ul>
        </details>
        <details>
            <summary>Gearable/Movable</summary>
            <ol>
                <li>Look at the Gearable.java and Movable.java files. What do you notice? Read up on interfaces from the book or as a quick reference <a href="https://www.w3schools.com/java/java_interface.asp" target="_blank" rel="noopener">at W3 Schools</a>.</li>
                <li>Revisit the diagram from the Assignment Overview. You will notice that <span style="font-family: 'Courier New';">ElectricMountainBike</span> is <span style="font-family: 'Courier New';">Gearable, Movable</span>, and <span style="font-family: 'Courier New';">Electric</span>. <br />a) In Java, classes can <i>implement </i>interfaces. Alter the class header of <span style="font-family: 'Courier New';">ElectricMountainBike</span> so that it implements the interfaces. A Java class can implement more than one interface by listing them comma-separated in the class header.<br />Ex: <span style="font-family: 'Courier New';">public class Tesla extends Car implements Drivable, Electric { ...</span></li>
                <li>Add the methods from the Interfaces into the <span style="font-family: 'Courier New';">ElectricMountainBike</span> class similar to how you added the abstract classes from the <span style="font-family: 'Courier New';">Cycle</span> class for the subclasses.</li>
            </ol>
            <p>It was mentioned earlier that multiple inheritance is not possible in Java. However, the mechanism is pretty much achieved through the use of interfaces. Read up <a class="inline_disabled" title="Link" href="https://www.geeksforgeeks.org/why-java-doesnt-support-multiple-inheritance/" target="_blank" rel="noopener">on Geeks for Geeks</a>on why multiple inheritance isn't implemented in Java and must be solved via interfaces.</p>
        </details>
</div>
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
