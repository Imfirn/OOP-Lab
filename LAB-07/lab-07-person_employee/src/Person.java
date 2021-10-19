/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Person {

    String name;
    String adress;
    String phoneNumber;
    String emailAdress;

    public Person() {
    }

    public Person(String name, String adress, String phoneNumber, String emailAdress) {
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.emailAdress = emailAdress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", adress=" + adress + ", phoneNumber=" + phoneNumber + ", emailAdress=" + emailAdress + '}';
    }

    
}
