
//import java.util.Date;
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
public class Employee extends Person {

    private String office;
    private int salary;
    private Date  dateHire = new Date();

    public Employee() {

       

    }

    public Employee(String office, int salary) {
        this.office = office;
        this.salary = salary;
        dateHire = new Date();
    }

    public Employee(String office, int salary, String name, String adress, String phoneNumber, String emailAdress) {
        super(name, adress, phoneNumber, emailAdress);
        this.office = office;
        this.salary = salary;
        this.dateHire = dateHire;
    }
    

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public Date getDate(){
    
         return this.dateHire;
        
    }

    @Override
    public String toString() {
        return super.toString()+"Employee{" + "office=" + office + ", salary=" + salary + ", dateHire=" + dateHire + '}';
    }
    

}
