/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg04.stock;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Lab04Stock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Stock stock = new Stock("ORCL", "Oracle Corporation");
    
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;
        
        System.out.println("Symbol: " + stock.symbol);
        System.out.println("Name: " + stock.name);
        System.out.println("Previous price: " + stock.getPreviousClosingPrice());
        System.out.println("Current price: " + stock.getCurrentPrice());
        System.out.printf("Price Change: %.15f%%\n", stock.getChangePercent());

    }

}
