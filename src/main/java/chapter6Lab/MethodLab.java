/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter6Lab;

/**
 *
 * @author win
 */

    
public class MethodLab {
    public static void main(String[] args){

        // Q1
        printWelcome();

        // Q4
        printSum(3, 5);

        // Q5
        int product = multiply(4, 6);
        System.out.println("The product is " + product);

        // Q8
        boolean even = isEven(42);
        System.out.println(even);

        // Q9
        int max = maxNumber(18, 12);
        System.out.println(max);

        // Q10（重载的两种形式）
        greetUser("Samson");
        greetUser("Samson", "Oni");

        // Part 6 - 2
        String msg = gradeMessage(80);
        System.out.println("Your performance is: " + msg);
    }

    // ===== Below are the method definitions =====

    // Q1
    public static void printWelcome() {
        System.out.println("Welcome to the Java Methods Lab!");
    }

    // Q2（定义但不在 main 调用）
    public static void printDivider() {
        System.out.println("----------------------");
    }

    // Q3（定义但不在 main 调用）
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "! Nice to see you.");
    }

    // Q10（重载，会在 main 调用）
    public static void greetUser(String firstName, String lastName) {
        System.out.println("Hello, " + firstName + " " + lastName + "!");
    }

    // Q4
    public static void printSum(int a, int b) {
        int c = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + c);
    }

    // Q5
    public static int multiply(int x, int y) {
        return x * y;
    }

    // Q6（定义但不在 main 调用）
    public static String getFullName(String first, String last) {
        return first + " " + last;
    }

    // Q7（定义但不在 main 调用）
    public static int findSquare(int number) {
        return number * number;
    }

    // Q8
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Q9
    public static int maxNumber(int a, int b) {
        return (a >= b) ? a : b;
    }

    // Part 6 - 1（定义但不在 main 调用）
    public static double calculateArea(double radius) {
        return 3.1416 * radius * radius;
    }

    // Part 6 - 2
    public static String gradeMessage(int score) {
        if (score >= 90) return "Excellent";
        else if (score >= 75) return "Good";
        else if (score >= 50) return "Average";
        else return "Fail";
    }
}

        
