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
public class ComparableRectangle extends Rectangle implements Comparable<Rectangle>,Cloneable{

    private String color;

    public ComparableRectangle() {
    }
    

   public ComparableRectangle(double height, double width,String color,String weight) {
         super(height, width);
         this.color = color;
    }

    
    @Override
    public int compareTo(Rectangle o) {
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
       Rectangle x = (Rectangle)obj;
       if(x.getArea()!= getArea()) return false;
       else return true;
       
    }
    
    
}
