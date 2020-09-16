# 401 Labs Table of Contents

## Lab: 01 - Java primitives and control flow

- This lab is dedicated to practicing Java fundamentals. These problems will challenge your understanding of Java’s built-in primitive values (ints, floats, doubles, Strings, booleans), for loops, while loops, if statements, functions, parameters and return statements.

### Pluralize

- We needed to write a function called ```pluralize``` that accepts a word and a number and returns a string with the word pluralized with an “s” if the number is zero, or greater than one.

### Flipping Coins

- We needed to write a function called ```flipNHeads``` that accepts an integer ```n``` and flips coins until ```n``` heads are flipped in a row. Simulate coin flipping by choosing a random number between ```0``` and ```1```. Numbers below ```.5``` are considered tails. Numbers at and above ```.5``` are considered heads. Print out ```heads``` or ```tails``` on one line for each flip. Print ```It took FLIPS flips to flip N heads in a row.``` once ```n``` heads have been in a row.

### Command Line Clock

- We needed to write a method ```clock``` that uses Java’s built-in ```LocalDateTime``` object to constantly print out the current time to the console, second by second. The program should run until someone manually kills it with ```CTRL-C``` or presses the “stop” button in their IDE. Each time should only be printed once. Your program should detect when the seconds increase and only print something out when the timestamp changes.

## Lab 2: Arrays, Loops, Imports, ArrayLists

- This lab is dedicated to creating, interacting with and manipulating arrays in Java. Arrays in Java have a fixed size. Arrays are created with a certain size and they never shrink or grow. Java arrays are typed. You can have an array of integers, or an array of strings, but not an array mixed with integers and strings.

### Rolling Dice

- We needed to writea method called roll that accepts an integer n and rolls a six-sided dice n times. The method should return an array containing the values of the rolls.

### Contains Duplicates

- We needed to write a method called containsDuplicates that returns true or false depending on whether the array contains duplicate values.

### Calculating Averages && Arrays of Arrays

- First we wrote a method that accepts an array of integers and calculates and returns the average of all the values in the array.

- Then given an array of arrays calculate the average value for each array and return the array with the lowest average.

#### Resources

- [How to generate a random number in Java](https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java)

- Got some help from Meghan and David on the Command Line Clock problem.

- Assist from Nich going through lab 2 during code review.
