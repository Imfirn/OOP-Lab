/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg04.calendar;

import java.util.GregorianCalendar;
import java.util.Date;

/**
 *
 * @author USER
 */
public class Lab04Calendar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GregorianCalendar geo = new GregorianCalendar();
        Date now = new Date();
        long ms = now.getTime() + 86400000;
        
        System.out.println("Current year, month, date, and day of week");
        System.out.println("Year = " + geo.get(GregorianCalendar.YEAR));
        System.out.println("Month = " + geo.get(GregorianCalendar.MONTH));
        System.out.println("Day = " + geo.get(GregorianCalendar.DAY_OF_MONTH));
        System.out.println("Day of week =" + geo.get(GregorianCalendar.DAY_OF_WEEK));

        System.out.println("----------------");

        geo.setTimeInMillis(ms);
        System.out.println("After specified the elapsed time of one day after current day");
        System.out.println("Year = " + geo.get(GregorianCalendar.YEAR));
        System.out.println("Month = " + geo.get(GregorianCalendar.MONTH));
        System.out.println("Day = " + geo.get(GregorianCalendar.DAY_OF_MONTH));
        System.out.println("Day of week = " + geo.get(GregorianCalendar.DAY_OF_WEEK));

        System.out.println(geo.getTime());

    }

}
