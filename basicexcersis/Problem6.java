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
public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input first number: ");
        int firstNum = sc.nextInt();
        
        System.out.println("Input second number: ");
        int secondNum = sc.nextInt();
        
        int sum = firstNum + secondNum;
        int difference = firstNum - secondNum;
        int product = firstNum * secondNum;
        int quotient = firstNum / secondNum;
        int remainder = firstNum % secondNum;
        
        System.out.println(firstNum + "+" + secondNum + "=" + sum);
        System.out.println(firstNum + "-" + secondNum + "=" + difference);
        System.out.println(firstNum + "x" + secondNum + "=" + product);
        System.out.println(firstNum + "/" + secondNum + "=" + quotient);
        System.out.println(firstNum + "mob" + secondNum + "=" + remainder);
        
        sc.close();
        
    }
 
}
