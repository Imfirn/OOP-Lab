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
public abstract class Geometric { // insert abstract

    /**
     * @param args the command line arguments
     */
    private String color;

    public Geometric() {
    }

    public Geometric(String color) {
        this.color = color;
    }
      
    
    
    public void setColor(String color) {
        this.color = color;
    }
     
    public String getColor(){
        return this.color;
    }
    public abstract double getArea();     
    public abstract double getPerimeter();  
    
    public boolean filledColor (){
         if(color!=null){
            
             return true;
         }
          return false;
         
          
    }
    
    public int MaxCheckR (Rectangle r2 ){
      if ( getArea()!= r2.getArea()){
          
          return 0;
      
      }
    
      else{return 1;}
      
    }
      public int MaxCheckT (Triangle t2){
      if ( getArea()!= t2.getArea()){
          
          return 0;
      
      }
    
      else{return 1;}
      
    }
   
}