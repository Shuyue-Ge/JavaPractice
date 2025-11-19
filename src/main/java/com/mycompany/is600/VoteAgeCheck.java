/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.is600;

/**
 *
 * @author win
 */
import java.util.Scanner;

public class VoteAgeCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    System.out.print("Enter your age: ");
        int age = in.nextInt();

    if (age >= 18)
        System.out.println("You are eligible to vote");
    else {System.out.println("You are not eligible to vote");
    }
    }
}
