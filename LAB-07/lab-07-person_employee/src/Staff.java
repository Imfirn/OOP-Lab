
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Staff extends Employee {
    String title;

    public Staff() {
    }

    public Staff(String title) {
        this.title = title;
    }

  
    public Staff(String title, String office, int salary, String name, String adress, String phoneNumber, String emailAdress) {
       super(office, salary, name, adress, phoneNumber, emailAdress);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString()+"Staff{" + "title=" + title + '}';
    }
    
    
    
    
}
