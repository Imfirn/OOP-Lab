/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg02.scissor.rock.paper;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Lab02ScissorRockPaper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] RPS = {"scissors","rock","paper"};
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.print("scissor (0), rock (1), paper (2): ");
        int num1 = input.nextInt();
        int num2 = random.nextInt(3);
        if(num1==num2){
            System.out.printf("The computer is %s. You are %s too. It is draw",RPS[num2],RPS[num1]);
        }
        else if((num1==0&&num2==2)||(num1==1&&num2==0)||(num1==2&&num2==1)){
            System.out.printf("The computer is %s. You are %s. You won!!!",RPS[num2],RPS[num1]);
        }
        else{
            System.out.printf("The computer is %s. You are %s. You lose....",RPS[num2],RPS[num1]);
        }
    }
    
}
