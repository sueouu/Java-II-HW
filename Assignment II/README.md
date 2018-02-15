# Assignment 2

## A Bale of Turtles

Modify the Turtle class so that it has a "draw()" method and a "draw(Color color)" method. The implementation of these draw methods should draw a shape of your choosing. Create three subclasses of Turtle: SpiralTurtle, ConfusedTurtle, and SmartTurtle. Override the "draw()" methods of the subclasses. The SpiralTurtle "draw()" method should draw a spiral. The ConfusedTurtle "draw()" should draw an erratic pattern of random sized segments drawn in chaotic directions. The Deitel & Deitel textbook has a section entitled "Case Study: Random-Number Generation" which demonstrates how to generate random numeric values within a given range. Your ConfusedTurtle "draw" will need to randomly choose lengths and directions to control its drawing movement. Be sure that the "draw" method has a finite number of steps to its movement. The SmartTurtle "draw()" method should draw a "design" of your own choosing.

Create a BaleOfTurtles class. This class will have a "main" method. This method will perform the following operations:

Create a "World". 
Initialize Array of three Turtles with references to a SpiralTurtle, a ConfusedTurtle, and a SmartTurtle. Be sure that these Turtles are placed with the current World.
Create a Color object representing a color of your choosing.
Iterate through your Turtle Array, and call the "draw(Color color)" using each Turtle reference within the Array.

Important!: Remove any duplicate code that you might have added.
One way of avoiding unnecessarily duplicated code (such as in a draw method), is to have one method call another method. In this manner, you can factor out the commonality. Also, please don’t forget to place the new draw(Color...) method in the Turtle class as directed.


Submit the .java files of all modified classes (including the Turtle class) together as a single zipped attachment. Please use the zip format (not .rar or any other format).

