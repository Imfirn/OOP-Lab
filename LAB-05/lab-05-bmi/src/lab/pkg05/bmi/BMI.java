/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg05.bmi;

/**
 *
 * @author USER
 */
public class BMI {
    private final double POUND = 0.45359237;
    private final double INCH =  0.0254;
    private String name;
    private int age;
    private double weight;
    private double feet;
    private double inches;
    
    public BMI(String name,int age,double weight,double feet,double inches){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.feet = feet;
        this.inches = inches;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public double getWeight(){
        return this.weight*POUND;
    }
    public double getHeight(){
        return ((this.inches)+(this.feet*12))*INCH;
    }
    public double getBMI(){
        return getWeight()/Math.pow(getHeight(),2);
    }
    
    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }
    
}
