/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BasicDataTypes;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input distance in meters: ");
        double distanceMeters = scanner.nextDouble();

        System.out.print("Input hour: ");
        int hours = scanner.nextInt();

        System.out.print("Input minutes: ");
        int minutes = scanner.nextInt();

        System.out.print("Input seconds: ");
        int seconds = scanner.nextInt();

        int totalSeconds = hours * 3600 + minutes * 60 + seconds;

        double speedMetersPerSecond = distanceMeters / totalSeconds;
        double speedKmPerHour = (distanceMeters / 1000) / (totalSeconds / 3600.0);
        double speedMilesPerHour = (distanceMeters / 1609.0) / (totalSeconds / 3600.0);

        System.out.printf("Your speed in meters/second is %.8f%n", speedMetersPerSecond);
        System.out.printf("Your speed in km/h is %.8f%n", speedKmPerHour);
        System.out.printf("Your speed in miles/h is %.8f%n", speedMilesPerHour);

        scanner.close();
    }
}
