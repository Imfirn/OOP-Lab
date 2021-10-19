/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg08.colorable;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Lab08Colorable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ArrayList<Square> s = new ArrayList<Square>();
         s.add(new Square(5, "color"));
         
         for(Square sq: s){
         
             System.out.println(s.toString());
             
         }
         
        
    }
    
}
