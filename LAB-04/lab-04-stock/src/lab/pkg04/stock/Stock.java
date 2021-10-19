/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg04.stock;

/**
 *
 * @author USER
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Stock {

    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
   

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setName(String name) {
        this.name = name;
    }
  
    public double getPreviousClosingPrice(){
       return this.previousClosingPrice;
   }
    public double getCurrentPrice() {
        return this.currentPrice;
    }

    public double getChangePercent() {

        return (this.currentPrice - this.previousClosingPrice)*100 / this.previousClosingPrice;

    }

     

}
