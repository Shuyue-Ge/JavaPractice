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
public class question1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = in.nextDouble();
        System.out.print("Enter b: ");
        double b = in.nextDouble();
        System.out.print("Enter c: ");
        double c = in.nextDouble();
        
        double A = Math.acos((a * a - b * b - c * c) / (-2 * b * c));
        double B = Math.acos((b * b - a * a - c * c) / (-2 * a * c));
        double C = Math.acos((c * c - b * b - a * a) / (-2 * a * b));
        
        System.out.printf("A = " + A);
        System.out.printf("B = " + B);
        System.out.printf("C = " + C);
    }
}
