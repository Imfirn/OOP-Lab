
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
public class Test {

    public static void main(String[] args) {
        int balance, temp;
        double withDraw, depoSit, overdraftLimit;
        Scanner input = new Scanner(System.in);

        Checking c = new Checking();
        Saving s = new Saving();

        System.out.println("(1).checking  (2).saving");
        temp = input.nextInt();

        if (temp == 1) {
            System.out.println("(1).checking");
            System.out.print("overdraftLimit :");
            overdraftLimit = input.nextDouble();
            c.setOverdraftLimit(overdraftLimit);

            System.out.print("balance :");
            balance = input.nextInt();
            c.setBalance(balance);

            System.out.print("withdraw :");
            withDraw = input.nextDouble();
            c.checkwithdraw(withDraw);
            System.out.println(c.toString());

        } else if (temp == 2) {

            System.out.println("(1).saving");
            System.out.print("balance :");
            balance = input.nextInt();
            s.setBalance(balance);

            System.out.print("withdraw :");
            withDraw = input.nextDouble();
            s.withdraw(withDraw);

            System.out.println(s.toString());

        }

        //  System.out.println(account.toString());
    }
}
