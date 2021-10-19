/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg07.pkgnew.account.pkgclass;

import java.util.Date;

/**
 *
 * @author USER
 */
public class Transactions {
        private Date date = new Date();;
	private char type;
	private double amount;
	private double balance;
	private String description;

    public Transactions() {
    }

    public Transactions(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
        
      public Date getDate() {
        return this.date;
    }
        
    
}
