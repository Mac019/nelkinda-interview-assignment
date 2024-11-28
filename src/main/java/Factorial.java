package main.java;

public class Factorial {
    public static int calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 5; 
        try {
            int factorial = calculateFactorial(number);
            System.out.println("The factorial of " + number + " is: " + factorial);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
