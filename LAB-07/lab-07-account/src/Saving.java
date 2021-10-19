/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Saving extends Account {

    public Saving() {
    }

    public Saving(int Id, int balace) {
        super(Id, balace);
    }

    public void withdraw(double y) {
        if (getBalance() >= y) {
            setBalance(getBalance() - y);
        } else {
            System.out.println("it cannot withdraw ");
        }
    }

   
    

}
