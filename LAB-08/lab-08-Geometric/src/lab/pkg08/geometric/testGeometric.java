/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg08.geometric;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class testGeometric {
    public static void main(String[] args) {
    Circle c = new Circle();
    Rectangle r = new Rectangle();
    //Geometric t = new Triangle();
    Scanner input= new Scanner(System.in);
    int score;
    double s1,s2,s3;
    String color=null;
        System.out.println("Input side of triangle : ");
        s1=input.nextDouble();
        System.out.println("Input side 2 of triangle : ");
        s2=input.nextDouble();
        System.out.println("Input side 3 of triangle : ");
        s3=input.nextDouble();
        System.out.println("Do you want to fill color yes (1) /No (2) ");
        score=input.nextInt();
        if(score==1){
        System.out.println("Input color of triangle :");
        color = input.next();
       
        if(((s1+s2)>s3)&&((s1+s3)>s2&&((s3+s2)>s1))){
        
           Geometric t = new Triangle(s1,s2,s3,color);
            
            System.out.println(t.toString()+t.filledColor());
           
        
        }
        else{
        
                System.out.println("Error");
        
        }
        }else if(score==2) {
             if(((s1+s2)>s3)&&((s1+s3)>s2&&((s3+s2)>s1))){
        
           Geometric t = new Triangle(s1,s2,s3);
            
            System.out.println(t.toString()+t.filledColor());
           
        
        }
        else{
        
                System.out.println("Error");
        
        }
            
        }
       
        
    }
    
           
    
    
     
}
