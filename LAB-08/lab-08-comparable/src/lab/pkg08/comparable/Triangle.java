/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg08.comparable;

/**
 *
 * @author USER
 */
public class Triangle extends Geometric {
    
    private double side1,side2,side3;    
    private double s;

    public Triangle() {
        
    }

    public Triangle(double side1,double side2,double side3, String color) {
        super(color);
         this.side1 = side1;
         this.side2 = side2;
         this.side3 = side3;
         
    }
    public Triangle(double side1,double side2,double side3) {
         this.side1 = side1;
         this.side2 = side2;
         this.side3 = side3;
         
    }
   
   
     
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2= side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getS() {
        return s = (side1+side2+side3)*0.5;
    }

    public void setS(double s) {
        this.s = s;
    }

 
     @Override
    public double getArea() {
        return Math.pow(getS() * (getS() - side1) * (getS() - side2) * (getS() - side3), 0.5);
    }
    @Override
    public double getPerimeter(){
        return side1+side2+side3;
    }

    @Override
    public String toString() {
        return "Triangle{" + "side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + ", s=" + getS() + "Area"+getArea()+'}';
    }

   

    
    
    
}
