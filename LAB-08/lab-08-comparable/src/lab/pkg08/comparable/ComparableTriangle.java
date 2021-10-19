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
public class ComparableTriangle extends Triangle implements Comparable<Triangle>,Cloneable  {

    public ComparableTriangle() {
        
    }
    
    

    public ComparableTriangle(double side1, double side2, double side3, String color,String weight) {
        super(side1, side2, side3, color);
    }

    @Override
    public int compareTo(Triangle o) {
        
        if(o.getArea()>super.getArea()) return 1;
        else if (o.getArea()<super.getArea()) return -1;
        else  return 0;
    
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public boolean equals(Object obj) {
      Triangle x = (Triangle)obj;
       if(x.getArea()!= getArea()) return false;
       else return true;
       
    }
    
}
