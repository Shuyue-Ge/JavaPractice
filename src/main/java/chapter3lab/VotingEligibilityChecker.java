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
public class VotingEligibilityChecker {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Are you a citizen (true/false)? ");
        boolean isCitizen = input.nextBoolean();

        if (age >= 18 && isCitizen) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        input.close();
    }
}
