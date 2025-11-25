/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author win
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingLab {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Part A1: DivisionCalculator ===");
        DivisionCalculator.run(scanner);

        System.out.println(); 
        System.out.println("=== Part A2: ArrayAccessLab ===");
        ArrayAccessLab.run(scanner);
    }
}

/*
Part A1 – Division Calculator
Goal: Handle invalid input and divide-by-zero safely.
*/
class DivisionCalculator {
    public static void run(Scanner scanner) {
        try {
            System.out.print("Enter the first integer: ");
            int first = scanner.nextInt();  

            System.out.print("Enter the second integer: ");
            int second = scanner.nextInt();

            int result = first / second;

            System.out.println("Result: " + first + " / " + second + " = " + result);

        } catch (InputMismatchException e) {
            System.out.println("Error: You must enter whole numbers.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            System.out.println("Thank you for using the calculator.");

            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }
        }
    }
}

/*
Part A2 – Array Index Handling
Goal: Practice handling ArrayIndexOutOfBoundsException.
 */
class ArrayAccessLab {

    public static void run(Scanner scanner) {

        int[] numbers = {10, 20, 30, 40, 50}; 

        try {
            System.out.print("Enter an index (0 to 4): ");
            int index = scanner.nextInt();

            int value = numbers[index]; 

            System.out.println("Value at index " + index + " is " + value);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds. Valid indices are 0 to 4.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a whole number for the index.");
        } finally {
            System.out.println("Array access attempt finished.");
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }
        }
    }
}
