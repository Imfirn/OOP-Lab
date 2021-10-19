/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg02.day.of.the.week;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Lab02DayOfTheWeek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] Days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");

        if (month == 1 || month== 2) {
            month =month + 12;
            year = year - 1;
        }
        
        int day = input.nextInt();
        int j = year / 100;
        int k = year % 100;
        int m = 26 * (month + 1);

        

        int h = (day + (m / 10) + k + (k / 4) + (j / 4) + (5 * j));

        System.out.printf("Day of the week is %s", Days[(h) % 7]);

    }

}
