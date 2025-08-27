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
public class Problem3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");
        long minutes = scanner.nextLong();

        long totalDays = minutes / (60 * 24);

        long years = totalDays / 365;
        long days = totalDays % 365;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");

        scanner.close();
    }
}
