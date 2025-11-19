/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm;

/**
 *
 * @author win
 */
import java.util.Scanner;
/*A laboratory collects hourly temperature readings from a sensor. Some readings 
may fall outside the valid range.*/


public class mockup3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ---- Input Section ----
        System.out.print("Enter number of readings: ");
        if (!sc.hasNextInt()) {
            //判断是否输入为int
            System.out.println("Invalid input.");
            return;
        }
       //判断是否小于等于0
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid input.");
            return;
        }

        System.out.print("Enter minimum valid temperature: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid input.");
            return;
        }
        double minValid = sc.nextDouble();

        System.out.print("Enter maximum valid temperature: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid input.");
            return;
        }
        double maxValid = sc.nextDouble();

        if (minValid > maxValid) {
            System.out.println("Invalid range: minimum cannot be greater than maximum.");
            return;
        }

        // ---- Processing Section ----
        double sum = 0.0;
        double adjustedMin = Double.MAX_VALUE;
        double adjustedMax = -Double.MAX_VALUE;
        int clampedCount = 0;

        // Store adjusted readings to check perfect squares later数组
        double[] readings = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter reading #" + (i + 1) + ": ");
            if (!sc.hasNextDouble()) {
                System.out.println("Invalid input.");
                return;
            }

            double reading = sc.nextDouble();

            // Clamp values（keep a running count of how many readings were replaced）
            if (reading < minValid) {
                reading = minValid;
                clampedCount++;
            } else if (reading > maxValid) {
                reading = maxValid;
                clampedCount++;
            }

            //把当前这次输入（变量 reading 的值）存进数组的第 i 个位置。
            readings[i] = reading;

            // Update stats
            sum += reading;
            if (reading < adjustedMin) adjustedMin = reading;
            if (reading > adjustedMax) adjustedMax = reading;
        }

        

        // ---- Compute Averages ----
        double average = sum / n;

        // ---- Output Section ----
        System.out.println();
        System.out.printf("Average Temperature: %.2f%n", average);
        System.out.printf("Min/Max: %.2f / %.2f%n", adjustedMin, adjustedMax);
        System.out.printf("Clamped Readings: %d of %d%n", clampedCount, n);

        // ---- Check for perfect-square integers ----
        System.out.print("Perfect-square integer readings: ");
        boolean found = false;
        for (double r : readings) {
            // 判断是否是整数
            if (r == Math.floor(r)) {
                double root = Math.sqrt(r);
                if (root == Math.floor(root)) {
                    System.out.printf("%.0f ", r);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.print("None");
        }
        System.out.println();
    }
}
