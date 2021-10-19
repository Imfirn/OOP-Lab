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
public class ComparableCircle extends Circle implements Comparable<Circle> ,Cloneable {

    public ComparableCircle() {
    }
    
    

    public ComparableCircle(double radius, String color,String weight) {
        super(radius,color);
    }
    
    
    @Override
    public int compareTo(Circle o) {
        if(o.getRadius()>super.getRadius()) return 1;
        else if (o.getRadius()<super.getRadius()) return -1;
        else return 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }

    @Override
    public boolean equals(Object obj) {
       Circle x = (Circle)obj;
       if(x.getRadius()!= getRadius()) return false;
       else return true;
       
    }
    
}
