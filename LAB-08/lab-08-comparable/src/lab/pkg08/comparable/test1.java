/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg08.comparable;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class test1 {
    public static void main(String[] args) throws CloneNotSupportedException  {
        ComparableTriangle[]T =new ComparableTriangle[2];
        ComparableTriangle T1 =new ComparableTriangle(5, 14, 3, "color", "weight");
        Scanner input = new Scanner(System.in);
        double []s= new double[6];
        
      T[0] = new ComparableTriangle(5, 4, 3, "color", "weight");
      T[1]=(ComparableTriangle)T[0].clone();
      T[0].MaxCheckT(T[1]);
       System.out.println(T[0].MaxCheckT(T1));
       
        
    }
         
    }
    

