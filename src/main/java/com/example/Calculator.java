package com.example;

/**
 * A simple Calculator class that provides basic arithmetic operations.
 * 
 * @author Generated Code
 * @version 1.0
 */
public class Calculator {
    
    /**
     * Adds two integer numbers and returns the result.
     * 
     * @param a the first number
     * @param b the second number
     * @return the sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }
    
    /**
     * Adds two double numbers and returns the result.
     * 
     * @param a the first number
     * @param b the second number
     * @return the sum of a and b
     */
    public double add(double a, double b) {
        return a + b;
    }
    
    /**
     * Main method to demonstrate the Calculator functionality.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        // Example with integers
        int num1 = 10;
        int num2 = 25;
        int intResult = calc.add(num1, num2);
        System.out.println("Adding integers: " + num1 + " + " + num2 + " = " + intResult);
        
        // Example with doubles
        double num3 = 15.5;
        double num4 = 20.3;
        double doubleResult = calc.add(num3, num4);
        System.out.println("Adding doubles: " + num3 + " + " + num4 + " = " + doubleResult);
        
        // Interactive example - you can modify these values
        System.out.println("\n--- Calculator Demo ---");
        System.out.println("This calculator can add two numbers!");
        System.out.println("Feel free to modify the values in the code and recompile.");
    }
}