/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg07.pkgnew.account.pkgclass;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author USER
 */
public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated = new Date();;
    private String name;
    private ArrayList<Transactions> transacTion = new ArrayList<Transactions>() ;
    
    
    public Account() {
        
    }

    

    public Account(int id, double balance, String name) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.name = name;
        this.transacTion = transacTion;
    }

     public Account(String name, int id, double balance) {
		this(id, balance);
		this.name = name;
	}

    public Account(int Id, double balace) {
        this.id = Id;
        this.balance = balace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
    
    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate/12;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public void setId(int Id) {
        this.id = Id;
    }

    public void setBalance(double balace) {
        this.balance = balace;
    }

    public void setAnnualInterestRate(double new_annualInterestRate) {
        this.annualInterestRate = new_annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 12);
    }

    public double getMonthlyInterest() {

        return this.balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        this.balance -= amount;
        transacTion.add(new Transactions('W', amount, balance,"withdrawal is complete"));
    }

    public void deposit(double amount) {
        this.balance += amount;
        transacTion.add(new Transactions('D', amount, balance,"deposit is complete"));
    }
    
    public ArrayList<Transactions> gettransacTion() {
		return transacTion;
	}

    @Override
    public String toString() {
        return "Name: " + getName()+"\nBalance: "+getBalance()+"\nAnnual interest rate: "+getAnnualInterestRate()+"\nDate\t\t\t\t" +"Type\t"+"Amount\t"+"Balance\t" +"Description" ;
		
		
				
		
    }

    
}
