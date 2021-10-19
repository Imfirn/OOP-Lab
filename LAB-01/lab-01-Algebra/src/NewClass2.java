
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class NewClass2 {
    public static void main(String[] args) {
        double a,b,c,d,e,f,x,y;
        Scanner input =new Scanner(System.in);
        System.out.print("a = ");        
        a=input.nextDouble();
        System.out.print("b = ");
        b=input.nextDouble();
        System.out.print("c = ");
        c=input.nextDouble();
        System.out.print("d = ");
        d=input.nextDouble();
        System.out.print("e = ");
        e=input.nextDouble();
        System.out.print("f = ");
        f=input.nextDouble();
        
        x=((e*d)-(b*f))/((a*d)-(b*c));
        y=((a*f)-(e*c))/((a*d)-(b*c));
        
        System.out.print("s the value for x and y is"+ x +" , "+ y);
    }
}
