/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basiccontrolstructures;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class BasicControlStructures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

public class NumberCheck {
    public static void main(String[] args) {
        // Get input from the user
        try (Scanner scanner = new Scanner(System.in)) {
            // Get input from the user
            System.out.print("Input number: ");
            int number = scanner.nextInt();
            
            // Check if the number is positive or negative
            if (number >= 0) {
                System.out.println(number + " is positive");
            } else {
                System.out.println(number + " is negative");
            }
        }
    }
}

}
