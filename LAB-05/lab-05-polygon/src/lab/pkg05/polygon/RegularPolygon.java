/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg05.polygon;

/**
 *
 * @author USER
 */
public class RegularPolygon {

    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    public RegularPolygon() {
        
    }
    public RegularPolygon(int number, double side) {
        this.side = side;
        this.n = number;
    }

    public RegularPolygon(int number, double side, double x, double y) {
        this.side = side;
        this.n = number;
        this.x = x;
        this.y= y;
    }

    public RegularPolygon(double x, double y) {
        this.x = x;
        this.y = y;
    }

   

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public int getNumber() {
        return this.n;
    }

    public void setNumber(int n) {
        this.n = n;
    }
    
    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
       this.x = x;
    }
    
     public double getPerimeter(){

        return n * side;
    }

    public double getArea() {

        return (n*side*side ) / (4.0 * Math.tan(Math.PI /n));
    }

    
    
    
    

}
