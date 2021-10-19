/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg05.polygon;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Lab05Polygon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num ,score;
        double side , x , y;
        RegularPolygon[]R = new RegularPolygon[3];
               
        Scanner input= new Scanner(System.in); 

        System.out.println("1.no-arg\n2.Regularpolygon (n,side)\n3.Regularpolygon (n,side,x,y)");
        System.out.print("Your choice: ");
        score=input.nextInt();
        
        if(score==1){
          R[0]=new RegularPolygon();
            System.out.println("Number of side = "+R[0].getNumber()+"\nlength of the side = "+R[0].getSide()+"\nPerimeter = "+R[0].getPerimeter()+"\nArea = "+R[0].getArea());
        
        }
        else if(score==2){
            
            System.out.print("Number of side = ");
            num=input.nextInt();
            System.out.print("length of the side = ");
            side=input.nextDouble();
            R[1]=new RegularPolygon(num,side);
            System.out.println("Number of side = "+R[1].getNumber()+"\nlength of the side = "+R[1].getSide()+"\nPerimeter = "+R[1].getPerimeter()+"\nArea = "+R[1].getArea());
        
        }
        
          else if(score==3){
           
            System.out.print("Number of side = ");
            num=input.nextInt();
            System.out.print("length of the side = ");
            side=input.nextDouble();
            System.out.print("x = ");
            x=input.nextDouble();
            System.out.print("y = ");
            y=input.nextDouble();
             R[2]=new RegularPolygon(num,side,x,y);
            System.out.println("Number of side = "+R[2].getNumber()+"\nlength of the side = "+R[2].getSide()+"\nX = "+R[2].getX()+"\nY= "+R[2].getY()+"\nPerimeter = "+R[2].getPerimeter()+"\nArea = "+R[2].getArea());
        
        }
          else{
          
              System.out.println("enter the wrong number");
          
          }
        
    }

}
