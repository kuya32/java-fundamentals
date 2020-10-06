# 401 Labs Table of Contents

1. [Lab: 01 - Java primitives and control flow](#Java-primitive-and-control-flow)
2. [Lab: 02 - Arrays, Loops, Imports, ArrayLists](#Arrays,-Loops,-Imports,-ArrayLists)
3. [Lab: 06 - Inheritance and Interfaces](#Inheritance-and-Interfaces)

## Java primitives and control flow

- This lab is dedicated to practicing Java fundamentals. These problems will challenge your understanding of Java’s built-in primitive values (ints, floats, doubles, Strings, booleans), for loops, while loops, if statements, functions, parameters and return statements.

### Pluralize

- We needed to write a function called ```pluralize``` that accepts a word and a number and returns a string with the word pluralized with an “s” if the number is zero, or greater than one.

### Flipping Coins

- We needed to write a function called ```flipNHeads``` that accepts an integer ```n``` and flips coins until ```n``` heads are flipped in a row. Simulate coin flipping by choosing a random number between ```0``` and ```1```. Numbers below ```.5``` are considered tails. Numbers at and above ```.5``` are considered heads. Print out ```heads``` or ```tails``` on one line for each flip. Print ```It took FLIPS flips to flip N heads in a row.``` once ```n``` heads have been in a row.

### Command Line Clock

- We needed to write a method ```clock``` that uses Java’s built-in ```LocalDateTime``` object to constantly print out the current time to the console, second by second. The program should run until someone manually kills it with ```CTRL-C``` or presses the “stop” button in their IDE. Each time should only be printed once. Your program should detect when the seconds increase and only print something out when the timestamp changes.

## Arrays, Loops, Imports, ArrayLists

- This lab is dedicated to creating, interacting with and manipulating arrays in Java. Arrays in Java have a fixed size. Arrays are created with a certain size and they never shrink or grow. Java arrays are typed. You can have an array of integers, or an array of strings, but not an array mixed with integers and strings.

### Rolling Dice

- We needed to writea method called roll that accepts an integer n and rolls a six-sided dice n times. The method should return an array containing the values of the rolls.

### Contains Duplicates

- We needed to write a method called containsDuplicates that returns true or false depending on whether the array contains duplicate values.

### Calculating Averages && Arrays of Arrays

- First we wrote a method that accepts an array of integers and calculates and returns the average of all the values in the array.

- Then given an array of arrays calculate the average value for each array and return the array with the lowest average.

### Analyzing Weather Data

- Use the October Seattle weather data above. Iterate through all of the data to find the min and max values. Use a HashSet of type Integer to keep track of all the unique temperatures seen. Finally, iterate from the min temp to the max temp and create a String containing any temperature not seen during the month. Return that String.

### Tallying Election

- Write a function called tally that accepts a List of Strings representing votes and returns one string to show what got the most votes.

### JavaScript Linter

- Write a method that reads a JavaScript file with a given Path, and generates an error message whenever it finds a line that doesn’t end in a semi-colon.

- Read through the file line by line. Create a string that contains a message such as "Line 3: Missing semicolon." if a line is missing a semicolon.
  - Don’t show an error if the line is empty.
  - Don’t show an error if the line ends with an opening curly brace {
  - Don’t show an error if the line ends with an closing curly brace }
  - Don’t show an error if the line contains if or else
- Call that method in your main method on the file gates.js, and print out the resulting error message.
- When the user runs the app, they should see all the lines that are missing semicolons.
- Created testing for linter method on multiple JS files.

## Inheritance and Interfaces

- Create Restaurant and Review classes and be able to make a review for a particular restaurant.

### Functionality

- The toString method for both the restaurant and review class give the information for each property
- The addReview method adds a review for a particular resturant then updates the star rating for the restaurant.
- The averageStar method is a helper method that takes the star rating for each review and find the average to update the restaurant star rating.

### Instructions for testing

- Run ./gradlew test to test my code

#### Resources

- [How to generate a random number in Java](https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java)

- Got some help from Meghan and David on the Command Line Clock problem.

- Assist from Nich going through lab 2 during code review.

- [HashMap containsKey() method](https://www.geeksforgeeks.org/hashmap-containskey-method-in-java/)

- [HashMap keySet() method](https://www.geeksforgeeks.org/hashmap-keyset-method-in-java/)

- Help from Jack for Lab 3 on Tally Election function.

- Worked with David, Meghan and Paul on Lab 3.
