/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg08.geo2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class testGeometric {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(1,1);
        Rectangle r2 = new Rectangle(1,1);
        Circle c =new Circle(1);
        Circle c2 =new Circle(1);
        Triangle t = new Triangle(1,1,1);
       
        ArrayList<Geometric>a=new ArrayList<>();
        a.add(r);
        a.add(r2);
        a.add(c);
        a.add(c2);
        a.add(t);
       
        double totalArea=0;
        for(int i =0;i<a.size();i++){
        totalArea+=a.get(i).getArea();
        }
       
        System.out.println( " totalArea ="+ totalArea);
        
        
    }
    
        
    
}
