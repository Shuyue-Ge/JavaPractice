/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.is600;

/**
 *
 * @author win
 */
import java.util.Scanner;
public class IS600 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your name:");
        String name = input.next();
        System.out.print("Enter your age:");     
        int number1 = input.nextInt();      
        System.out.println("Welcome, " + name + ", you are " + number1 + " years old");
               
    }  
}
  