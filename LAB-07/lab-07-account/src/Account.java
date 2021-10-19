
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Account {
    
    
    private int id;
    double balance;
    private double annualInterestRate;
    private Date dateCreated = new Date();;

    public Account() {
        
    }

    public Account(int Id, double balace) {
        this.id = Id;
        this.balance = balace;
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
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
        return (annualInterestRate / 1200);
    }

    public double getMonthlyInterest() {

        return this.balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public String toString() {
        return   "\nbalance:" + balance +" \ndateCreated :" + dateCreated + '}';
    }
    
    
    
}
