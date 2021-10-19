
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
public class Checking extends Account  {
    double overdraftLimit;
    private Date dateCreated = new Date();;
    public Checking() {
       
    }

    public Checking(double overdraftLimit, int Id, double balace) {
        super(Id, balace);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
    
    public void checkwithdraw(double x) {
        if (  (balance-x)*-1 > overdraftLimit) {
	         System.out.println("it's overdraft limit");
		}
		else
                      balance-=x;
			
	}

    @Override
    public String toString() {
        return "Balance: "+ balance+" \ndateCreated :" + dateCreated;
    }

   

   
  
    

 }
    
    

