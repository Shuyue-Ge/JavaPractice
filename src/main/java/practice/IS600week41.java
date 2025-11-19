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
public class IS600week41 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your Score:");
        double score = input.nextDouble(); 
        
        if (score >= 90.0)
            System.out.print("A");
        else if (score >= 80.0)
            System.out.print("B");
        else if (score >= 70.0)
            System.out.print("C");
        else if (score >= 60.0)
            System.out.print("D");
        else 
            System.out.print("F");
    }
}

