/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm.midtermexam;

import java.util.Scanner;

/**
 *
 * @author win
 */
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt input
        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter storage used (GB): ");
        if (!sc.hasNextDouble()) { // 非数字输入防御
            System.out.println("Invalid usage value.");
            return;
        }

        double storageGB = sc.nextDouble();

        //If the user enters a negative number
        if (storageGB < 0) {
            System.out.println("Invalid usage value.");
            return;
        }

        // --- Tiered pricing calculation ---
        double costBeforeDiscount;

        if (storageGB <= 100) {
            costBeforeDiscount = storageGB * 0.025;
        } else if (storageGB <= 500) {
            costBeforeDiscount = 100 * 0.025 + (storageGB - 100) * 0.020;
        } else {
            costBeforeDiscount = 100 * 0.025 + 400 * 0.020 + (storageGB - 500) * 0.018;
        }

        // --- Apply discount (if subtotal > 150) ---
        double discount = 0.0;
        if (costBeforeDiscount > 150) {
            discount = costBeforeDiscount * 0.03;
        }

        double costAfterDiscount = costBeforeDiscount - discount;

        // --- Platform fee (if usage > 50 GB) ---
        double platformFee = (storageGB > 50) ? 5.0 : 0.0;

        // --- Total ---
        double totalDue = costAfterDiscount + platformFee;

        // --- Output formatted invoice ---
        System.out.println();
        System.out.println("Customer: " + customerName);
        System.out.printf("Storage Used: %.2f GB%n", storageGB);
        System.out.printf("Storage Cost (before discount): $%.2f%n", costBeforeDiscount);
        System.out.printf("Discount Applied: -$%.2f%n", discount);
        System.out.printf("Platform Fee: $%.2f%n", platformFee);
        System.out.printf("Total Amount Due: $%.2f%n", totalDue);

    }
}