
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USER
 */

public class NewClass {
  
    public static void main(String[] args) {
        System.out.print("Enter a number between 0 and 1000: ");
        Scanner input = new Scanner(System.in);
        int lastNumber, sumDigit = 0;
        int number = input.nextInt();
        if (number > 0 && number < 1000) {
            while (number != 0) {
                lastNumber = number % 10;
                sumDigit = sumDigit + lastNumber;
                number = number / 10;
            }
            System.out.println("The sum of the digits is " + sumDigit);
        } else {
            System.out.println("You enter the wrong");

        }
    }
}
