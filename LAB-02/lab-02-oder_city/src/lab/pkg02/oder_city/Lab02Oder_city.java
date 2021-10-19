/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg02.oder_city;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Lab02Oder_city {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three cities
        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();
        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();
        System.out.print("Enter the third city: ");
        String city3 = input.nextLine();

        String city;

        if ((city2.compareTo(city1) < 0) && (city2.compareTo(city3) < 0)) {
            city = city1;
            city1 = city2;
            city2 = city;
        } else if ((city3.compareTo(city1) < 0) && (city3.compareTo(city2) < 0)) {
            city = city1;
            city1 = city3;
            city3 = city;

        }

        if (city3.compareTo(city2) < 0) {
            city = city2;
            city2 = city3;
            city3 = city;
        }

        // Display cities in ascending order
        System.out.println("The three cities in alphabetical order are "
                + city1 + " " + city2 + " " + city3);
    }

}
