/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg05.bmi;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Lab05Bmi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = input.nextLine();

        System.out.print("Enter your age : ");
        int age = input.nextInt();

        System.out.print("Enter your weight : ");
        double weight = input.nextDouble();
        
        System.out.print("Enter height(feet) : ");
        double feet = input.nextDouble();
        
        System.out.print("Enter height(inches): ");
        double inches = input.nextDouble();

        BMI bmi = new BMI(name, age, weight, feet, inches);

        System.out.println("The BMI for " + bmi.getName() + " is " + bmi.getBMI() + "\n" + bmi.getStatus());
    }

}
