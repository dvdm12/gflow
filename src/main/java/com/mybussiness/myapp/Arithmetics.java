package com.mybussiness.myapp;

public class Arithmetics {

    // Addition
    public double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public double multiply(double a, double b) {
        return a * b;
    }

    // Division
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    // Modulo operation
    public double modulo(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Modulo by zero is not allowed.");
        }
        return a % b;
    }

    // Exponentiation (Power)
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Square root
    public double sqrt(double number) {
        if (number < 0) {
            throw new ArithmeticException("Square root of a negative number is not allowed.");
        }
        return Math.sqrt(number);
    }

}
