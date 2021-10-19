/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg05.account.pkgclass;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Lab05AccountClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
        double withDraw,depoSit;
        
        Scanner input= new Scanner(System.in); 
        Account account = new Account(1122, 20000);
        System.out.println("Account ID: "+ account.getId());
        System.out.println("Balance: " + account.getBalance());
        account.setAnnualInterestRate(4.5);
        
       
        
        System.out.print("withdraw:");
        withDraw = input.nextDouble();
             
              
        
         if(account.getBalance()>=withDraw){
        account.withdraw(withDraw);//--
         }
         else{
             System.out.println("You cann't withdraw");
              }
         System.out.println("Balance: " + account.getBalance());
         
        System.out.print("deposit:");
        depoSit = input.nextDouble();
        account.deposit(depoSit);//++
        
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Monthly Interest: " + account.getMonthlyInterest());
        System.out.println("Date Created: " + account.getDateCreated());

    }
    }
    

