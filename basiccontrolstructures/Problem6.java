/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Problem6 {
    
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter range: ");
        int range = scanner.nextInt();

        
        for (int row = 1; row < range; row++) {
            for (int col = 1; col <= range; col++) {
                System.out.print((row * col) + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }

