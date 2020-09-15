# Lab: 01 - Java primitives and control flow

- This lab is dedicated to practicing Java fundamentals. These problems will challenge your understanding of Java’s built-in primitive values (ints, floats, doubles, Strings, booleans), for loops, while loops, if statements, functions, parameters and return statements.

## Pluralize

- We needed to write a function called ```pluralize``` that accepts a word and a number and returns a string with the word pluralized with an “s” if the number is zero, or greater than one.

## Flipping Coins

- We needed to write a function called ```flipNHeads``` that accepts an integer ```n``` and flips coins until ```n``` heads are flipped in a row. Simulate coin flipping by choosing a random number between ```0``` and ```1```. Numbers below ```.5``` are considered tails. Numbers at and above ```.5``` are considered heads. Print out ```heads``` or ```tails``` on one line for each flip. Print ```It took FLIPS flips to flip N heads in a row.``` once ```n``` heads have been in a row.

## Command Line Clock

- We needed to write a method ```clock``` that uses Java’s built-in ```LocalDateTime``` object to constantly print out the current time to the console, second by second. The program should run until someone manually kills it with ```CTRL-C``` or presses the “stop” button in their IDE. Each time should only be printed once. Your program should detect when the seconds increase and only print something out when the timestamp changes.

### Resources

- [How to generate a random number in Java](https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java)
- Got some help from Meghan and David on the Command Line Clock problem.
