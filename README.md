# Calculator

## Overview

This is a basic calculator implemented in Java. The calculator supports basic arithmetic operations such as addition, subtraction, multiplication, and division.
It is designed to handle different numeric types and includes features to detect and prevent overflow during calculations.

## Features

- Arithmetic Operations: Supports addition, subtraction, multiplication, and division.
- Numeric Type Handling: Can process different numeric types, such as integers and floating-point numbers.
- Overflow Detection: Includes mechanisms to detect and handle arithmetic overflow.

## Prerequisites

- Java 8+: Make sure that you have Java installed on your machine: https://www.oracle.com/java/technologies/javase-jdk11-downloads.html.
- Maven: Make sure Maven is installed: https://maven.apache.org/download.cgi.

## Build and Run

### Clone the Repository

git clone git@github.com:<user>/Calculator.git
cd Calculator

### Running the application

mvn clean install
mvn exec:java -Dexec.mainClass="Calculator.Calculator"

### Sample Usage

"Enter first number: "
Input : 3

"Enter operation: "
Input: +

"Enter next number: "
Input: 7

"
_____________________________________________________________________
Result: 							: 10
"

## Author: Tyree Chrisp (chri.tyree@gmail.com)
