/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class NewClass3 {

    public static void main(String[] args) {
        int now = 312032486, time = 31536000, i = 1, sum;
        int birth = time / 7;
        int death = time / 13;
        int newimmigrant = time / 45;

        for (i = 1; i < 6; i++) {

            sum = birth - death + newimmigrant;
            now += sum;

            System.out.println(" next " + i + " years = " + now);

        }

    }

}
