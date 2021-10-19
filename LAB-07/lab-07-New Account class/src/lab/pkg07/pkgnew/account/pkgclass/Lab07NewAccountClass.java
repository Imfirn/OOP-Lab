/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg07.pkgnew.account.pkgclass;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Lab07NewAccountClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int score;
        double withDraw,depoSit;
        Scanner input= new Scanner(System.in); 
        Account account = new Account("George", 1122, 1000);

        account.setAnnualInterestRate(1.5);
        
        do{
            System.out.println("(1). deposit (2). withdraw (0). complete and exit ");
            System.out.print("what do you want: ");
            score = input.nextInt();
        if(score==1){
        
            System.out.print("(1). deposit : ");
            depoSit=input.nextInt();
            account.deposit(depoSit);
        }
        else if (score==2){
        
            System.out.print("(2). withdraw : ");
            withDraw=input.nextInt();
            account.withdraw(withDraw);
        
        }
        
        
        
        
        }while(score!=0);
      		     
		
               System.out.println(account.toString()); 
				
		for (int i = 0; i < account.gettransacTion().size(); i++) {
			System.out.print((account.gettransacTion()).get(i).getDate()+"\t");
			System.out.print((account.gettransacTion()).get(i).getType()+"\t");
			System.out.print((account.gettransacTion()).get(i).getAmount()+"\t");
			System.out.print((account.gettransacTion()).get(i).getBalance()+"\t");
			System.out.print((account.gettransacTion()).get(i).getDescription()+"\t");
			System.out.println();
		}
        
    }
    
}
