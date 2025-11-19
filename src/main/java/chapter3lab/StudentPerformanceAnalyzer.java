/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.is600.chapter3lab;

/**
 *
 * @author win
 */
import java.util.Scanner;

public class StudentPerformanceAnalyzer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = in.nextLine();

        System.out.print("Enter your student ID: ");
        String studentId = in.nextLine();

        System.out.print("Enter your age: ");
        int age = in.nextInt();

        System.out.print("Are you full-time or part-time? (1 = full-time, 2 = part-time): ");
        int studentType = in.nextInt();

        System.out.print("Enter score for subject 1 (out of 100): ");
        double s1 = in.nextDouble();
        System.out.print("Enter score for subject 2 (out of 100): ");
        double s2 = in.nextDouble();
        System.out.print("Enter score for subject 3 (out of 100): ");
        double s3 = in.nextDouble();

        double total = s1 + s2 + s3;
        double average = total / 3.0; 

        String grade;
        if (average >= 90 && average <= 100) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else if (average >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        boolean honorRoll = (average >= 85) && (studentType == 1);

        String typeMessage;
        switch (studentType) {
            case 1:
                typeMessage = "You have full access to campus resources.";
                break;
            case 2:
                typeMessage = "Consider upgrading to full-time for more benefits.";
                break;
            default:
                typeMessage = "Unknown student type.";
        }

        System.out.println("\n===== Student Performance Report =====");
        System.out.println("Name: " + name);
        System.out.println("ID: " + studentId);
        System.out.println("Age: " + age);
        System.out.printf("Total Marks: %.2f/300.00%n", total);
        System.out.printf("Average Percentage: %.2f%%%n", average); // two decimals
        System.out.println("Final Grade: " + grade);
        System.out.println("Honor Roll Eligible: " + honorRoll);
        System.out.println("Student Type Message: " + typeMessage);

        in.close();
    }
}