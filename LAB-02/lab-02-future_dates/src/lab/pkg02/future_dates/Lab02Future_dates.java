/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg02.future_dates;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Lab02Future_dates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int thisday, future, skipday;
        System.out.print("Enter today's day: ");
        Scanner input = new Scanner(System.in);
        thisday = input.nextInt();
        System.out.print("Enter the number of days elapsed since today:");
        skipday = input.nextInt();

        
        //String toDay = "";
        String[] toDay = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        future = thisday + skipday;       
     

        System.out.println("Today is " + toDay[thisday % 7] + " and the future day is " + toDay[future % 7]);

        // TODO code application logic here
    }

}
