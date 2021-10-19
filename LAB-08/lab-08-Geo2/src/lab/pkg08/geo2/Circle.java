/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg08.geo2;

/**
 *
 * @author USER
 */
public class Circle extends Geometric {
    double radius;
    double area;

    public Circle() {
        
    }
    
   
    public Circle(double radius) {
        this.radius = radius;
       
    }

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
        
    }

    
    
    public double getRadius() {
        return radius;
    }

   
   
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    
    
    
}
