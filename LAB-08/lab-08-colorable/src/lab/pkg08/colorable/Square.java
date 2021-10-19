/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg08.colorable;

/**
 *
 * @author USER
 */
public class Square extends Geometric implements Colorable{
    double side;
    double area;

    public Square() {
        
    }
    
   
    public Square(double side) {
        this.side = side;
       
    }

    public Square(double side, String color) {
        super(color);
        this.side = side;
        
    }

    
    
    public double getRadius() {
        return side;
    }

   
   
    @Override
    public double getArea() {
        return  side * side;
    }
    @Override
    public double getPerimeter(){
        return 2*side;
    }

    @Override
    public String howTocolor() {
        return "Color this square";
    }

    @Override
    public String toString() {
       return super.toString() + "\nSide: " + side + "\nArea: " + getArea()
			+ "\nPerimeter: " + getPerimeter()+"\n"+howTocolor();
    }
    
    
    
}
