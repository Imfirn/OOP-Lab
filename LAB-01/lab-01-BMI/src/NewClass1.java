
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
public class NewClass1 {
    
    
    public static void main(String[] args) {
        double weight1,height1,bmi,w,h;
        
        System.out.print("Enter weight in pounds: ");
        Scanner input =new Scanner(System.in);
        w=input.nextDouble();
        System.out.print("Enter height in inches: ");
        h=input.nextDouble();
        
        weight1=w*0.45359237;//change lb to kg
        height1=h*0.0254;//change In to m
        
        bmi=weight1/( height1* height1);
 
        System.out.println("BMI is "+bmi);
    }
    
}
