# taskzenvia

## Roman Numbers Problem

The Romans were a clever bunch. They conquered most of Europe and ruled it for hundreds of years. They invented concrete and straight roads and even bikinis. One thing they never discovered though was the number zero. This made writing and dating extensive histories of their exploits slightly more challenging, but the system of numbers they came up with is still in use today. For example the BBC uses Roman numerals to date their programmes.

The Romans wrote numbers using letters : I, V, X, L, C, D, M. (notice these letters have lots of straight lines and are hence easy to hack into stone tablets)

## Soluction

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
│       ├── MainTest.java
│       └──
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
mvn test or mvn test -Dtest=MainTest test
```
### run
```
mvn package
java -jar target/taskzenvia.jar
```

## Test
### t-1
### t-2

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
