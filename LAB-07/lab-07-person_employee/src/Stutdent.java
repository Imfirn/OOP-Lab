/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Stutdent extends Person{
    int status;
    final static int freshman =1;
    final static int sophomore =2;
    final static int junior =3;
    final static int senior =4;

    public Stutdent() {
    }
     public Stutdent(int status) {
         this.status = status;
    }

    public Stutdent(String name, String adress, String phoneNumber, String emailAdress,int status) {
        super(name, adress, phoneNumber, emailAdress);
        this.status = status;
    }

    public String getStatus() {
          switch(status){
            case 1:
                return "freshman";
            case 2:
                return "sophomore";
            case 3:
                return "junior";
            case 4:
                return "senior";
        }
        return " - ";
    }
    

    @Override
    public String toString() {
        return super.toString() + "Stutdent{" + "status=" + getStatus() + '}';
    }
    
    
    
}
