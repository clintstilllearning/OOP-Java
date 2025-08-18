/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicexcersis;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Input first number: ");
            int firstNum = sc.nextInt();
            
            System.out.println("Input second number: ");
            int secondNum = sc.nextInt();
            
            int product = firstNum * secondNum;
            
            System.out.println(firstNum + "x" + secondNum + "=" + product);
        }
    }
}
