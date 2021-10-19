/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg02.display.pyramid;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Lab02DisplayPyramid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Enter the number of lines:");
        Scanner input = new Scanner(System.in);

        
        int n = input.nextInt();
        
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
           //-decreamentally
           for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
           //r- increamentally
           for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }

    }

}
