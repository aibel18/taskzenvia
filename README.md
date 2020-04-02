# taskzenvia

## Roman Numbers Problem

The Romans were a clever bunch. They conquered most of Europe and ruled it for hundreds of years. They invented concrete and straight roads and even bikinis. One thing they never discovered though was the number zero. This made writing and dating extensive histories of their exploits slightly more challenging, but the system of numbers they came up with is still in use today. For example the BBC uses Roman numerals to date their programmes.

The Romans wrote numbers using letters : I, V, X, L, C, D, M. (notice these letters have lots of straight lines and are hence easy to hack into stone tablets)

## Solution
The system works based on 3 letters of the Roman numerals, the unit, the half and the major of the decimal system. we see the following table.

||unit| half| major|
|---|---|---|---|
|units|I|V|X|
|tens|X|L|C|
|hundreds|C|D|M|
|thousands|M|||

The algorithm is as follows, let **x** be the number between [0 - 9], we divide into two groups (x < 5 and 5 <= x) each group have a pivot number 3 and 8 respectively.

The result of the first group (**x** < 5):

    romanNumber = **x** > 3 ? unit + half : unit^3 

The result of the second group (5 <= **x**):

    romanNumber = x > 8 ? unit + major : half + unit^(x-5) 

For each number we take each digit and place it in the table for example **x** = 1453

||digit|
|---|---|
|units|3|
|tens|5|
|hundreds|4|
|thousands|1|

to extract each digit we apply division and module by 10 until that **x** = 0


## File Structure

In this project you'll find the following directories and files:

```
taskzenvia/

├── src
│   ├── main/java
│   │   ├── ConvertNumber.java
│   │   ├── Main.java
│   │   ├── RomanLetter.java
│   │   └── RomanNumber.java
│   └── test/java
│       ├── RomanNumberTest.java
│       └── TimingExtension.java
├── target
│   ├── other files
│   └── taskzenvia.jar
├── .gitignore
├── LICENCE.md
├── pom.xml
└── README.md

```

## Build and run Test comands

### compile
```
mvn compile
```
### test
```
mvn test or mvn test -Dtest=RomanNumberTest test
```
### run
```
mvn package
java -jar target/taskzenvia.jar
```

## Unit Test
### t-1 validate Arguments

- 0 <= **x** <= 3000
- only to use letters : {I, V, X, L, C, D, M}

### t-2 invalidate arguments
the program should throw exceptions

- **x** < 0 or  3000 < **x**
- other letter != { I, V, X, L, C, D, M }

### t3 convert number to roman with one digit
- **x** = [0,10 [
### t4 convert number to roman with two digit
- **x** = [10,100 [
### t5 convert number to roman with three digit
- **x** = [100,1000 [
### t6 convert number to roman with four digit
- **x** = [1000,3000]
### t7 computing runtime of the convertToRoman
- runtime < 20ms
## Resources
- Junit 5
- Maven 3.5.4
- Java version 1.8

## Licensing

- Copyright 2020 Abel Ticona (https://aibel18.github.io)
- Abel Ticona [license](LICENSE.md)

## Useful Links

- http://codingdojo.org/kata/RomanNumerals/
- https://junit.org/junit5/docs/current/user-guide/
