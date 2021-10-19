/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg03.palindromic.prime;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Lab03PalindromicPrime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      int integer=2,n=0;
      while (n<100){
        
        if(checkPrime(integer)==true&&checkPalindom(integer)==true)
        {
        
            System.out.printf("%d  ",integer);
            n++;
            if(n%10==0){
            
                System.out.println("");
            
            }
        }
        
      
       integer++;
        
    }
         
       
    }

    public static int reverseDisplay(int integer) {
        int sum=0,digit;
        
        while( integer != 0 )
        {
            digit = integer % 10;
            sum = sum * 10 + digit;
            integer  /= 10;
        }
        return sum;
        
    }
    
    public static boolean checkPalindom(int integer) {
 
    return (integer == reverseDisplay(integer));
 
 }
    public static boolean checkPrime(int integer) {
 
   if (integer <= 1)
        return false;
 
    
    for (int i = 2; i < integer; i++)
        if (integer % i == 0)
            return false;
 
    return true;
 
 }
}
