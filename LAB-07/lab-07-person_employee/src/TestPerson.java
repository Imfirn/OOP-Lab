

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USER
 */
public class TestPerson {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.print("1.Stutdent\n2.Employee\n3.Faculty\n4.Staff");
        System.out.print("\nEnter score: ");
        int score = input.nextInt();
        
        if(score==1){
        
        System.out.print("Enter name: ");
        String name = input.next();
        System.out.print("\nEnter adress: ");
        String adress = input.next();
        System.out.print("\nEnter phonenumber: ");
        String number = input.next();
        System.out.print("\nEnter emailAdress: ");
        String emailAdress = input.next();
        System.out.print("\nEnter Status: ");
        int status = input.nextInt();
        Stutdent stutdent = new Stutdent(name,adress,number,emailAdress,status);
        
        System.out.println(stutdent.toString());
      
        }else if(score==2){
        
         System.out.print("Enter  office: ");
        String office = input.next();
        
        System.out.print("\nEnter salary: ");
        int salary = input.nextInt();
        
        System.out.print("Enter name: ");
        String name1 = input.next();
        
        System.out.print("\nEnter adress: ");
        String adress1 = input.next();
        
        System.out.print("\nEnter phonenumber: ");
        String number1 = input.next();
        
               
        System.out.print("\nEnter Email: ");
        String emailAdress1 = input.next();
        
        Employee employee = new Employee(office,salary,name1,adress1,number1,emailAdress1);
       
        System.out.println(employee.toString());
        
        }else if(score==3){
      
        System.out.print("Enter Rank: ");
        String r = input.next();
        
         System.out.print("\nEnter start time: ");
        Double t = input.nextDouble();
        
         System.out.print("\nEnter endtime: ");
         Double t1 = input.nextDouble();
         
         System.out.print("\nEnter Office: ");
        String o = input.next();
        
        System.out.print("\nEnter salary: ");
        int salary2 = input.nextInt();
        
        System.out.print("\nEnter name: ");
        String name2 = input.next();
        
        System.out.print("\nEnter adress: ");
        String adress2 = input.next();
        
        System.out.print("\nEnter phonenumber: ");
        String number2 = input.next();
        
        System.out.print("\nEnter emailAdress: ");
        String emailAdress2 = input.next();
        
              
        Faculty f =new  Faculty(t,t1,r,o,salary2,name2,adress2,number2,emailAdress2);
            
        System.out.println(f.toString());
         
     }else if(score==4){
        System.out.print("Enter title: ");
        String ti = input.next();
        
        System.out.print("Enter  office: ");
        String office3 = input.next();
        
        System.out.print("\nEnter salary: ");
        int salary3 = input.nextInt();
        
        System.out.print("\nEnter name: ");
        String name3 = input.next();
        
        System.out.print("\nEnter adress: ");
        String adress3 = input.next();
        
        System.out.print("\nEnter phonenumber: ");
        String number3 = input.next();
        
               
        System.out.print("\nEnter Email: ");
        String emailAdress3 = input.next();
        
        Staff s = new Staff(ti,office3,salary3,name3,adress3,number3,emailAdress3);
         System.out.println(s.toString());
    }
    else {
           System.out.print("Error");
}
}
}