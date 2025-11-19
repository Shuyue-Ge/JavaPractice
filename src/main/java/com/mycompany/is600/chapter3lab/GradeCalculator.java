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

public class GradeCalculator {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your score (out of 100): ");
        int score = input.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        input.close();
    }
}
