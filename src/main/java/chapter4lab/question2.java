/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter4lab;

/**
 *
 * @author win
 */

import java.util.Scanner;
import java.util.Random;

public class question2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100: ");
        int number = input.nextInt();
        int target = (int)(Math.random() * 100) + 1;
        
        if (number == target){
            System.out.println("Congratulations! You guessed it right.");
            }
        else if (number > target){
            System.out.println("Too high, try again.");
            } 
        else {
            System.out.println("Too low, try again.");
}
}
}
