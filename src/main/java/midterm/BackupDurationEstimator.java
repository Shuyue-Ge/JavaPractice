/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author samso
 */
import java.util.Scanner;

public class BackupDurationEstimator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter data size (GB): ");
        double dataSizeGB = sc.nextDouble();

        System.out.print("Enter throughput (Mbps): ");
        double throughputMbps = sc.nextDouble();

        System.out.print("Enter overhead (%): ");
        double overheadPercent = sc.nextDouble();

        if (dataSizeGB <= 0 || throughputMbps <= 0 || overheadPercent < 0) {
            System.out.println("Invalid input. Please enter positive values only.");
            return;
        }

        // Effective data (GB) including overhead
        double effectiveGB = dataSizeGB * (1 + overheadPercent / 100.0);

        // Convert GB -> megabits: GB * 1024 (MB/GB) * 8 (megabits/MB) = GB * 8192 megabits
        double totalMegabits = effectiveGB * 8192.0;

        // Time in seconds, then hours
        double seconds = totalMegabits / throughputMbps;
        double hours = seconds / 3600.0;

        // Round to 2 decimals
        double hoursRounded = Math.round(hours * 100.0) / 100.0;

        System.out.printf("Estimated backup time: %.2f hours%n", hoursRounded);
    }
}

