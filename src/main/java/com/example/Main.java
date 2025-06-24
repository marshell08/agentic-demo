package com.example;

/**
 * Main class to demonstrate the Calculator functionality.
 */
public class Main {
    
    public static void main(String[] args) {
        // Create an instance of Calculator
        Calculator calculator = new Calculator();
        
        // Demonstrate adding integers
        int num1 = 15;
        int num2 = 25;
        int intResult = calculator.add(num1, num2);
        System.out.println("Adding integers: " + num1 + " + " + num2 + " = " + intResult);
        
        // Demonstrate adding doubles
        double double1 = 12.5;
        double double2 = 7.3;
        double doubleResult = calculator.add(double1, double2);
        System.out.println("Adding doubles: " + double1 + " + " + double2 + " = " + doubleResult);
        
        // Demonstrate adding longs
        long long1 = 1000000L;
        long long2 = 2000000L;
        long longResult = calculator.add(long1, long2);
        System.out.println("Adding longs: " + long1 + " + " + long2 + " = " + longResult);
        
        // Interactive example with user input would require Scanner
        System.out.println("\nCalculator is ready to use!");
        System.out.println("You can create a Calculator instance and call add() methods with your numbers.");
    }
}