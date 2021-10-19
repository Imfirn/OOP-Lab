
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Faculty extends Employee {
    private String rank;
    private Double office_hours;
    double startTime;
    double leaveTime;

    public Faculty() {
        
    }

    public Faculty(double startTime, double leaveTime,String rank,String office, int salary, String name, String adress, String phoneNumber, String emailAdress) {
        super(office, salary, name, adress, phoneNumber, emailAdress);
        this.startTime = startTime;
        this.leaveTime = leaveTime;
        this.office_hours=leaveTime - startTime;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Double getOffice_hours() {
        return  this.office_hours;
    }
    
    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public double getLeaveTime() {
        return leaveTime;
    }

    @Override
    public String toString() {
        return super.toString()+ "Faculty{" + "rank=" + rank + ", office_hours=" + office_hours + ", startTime=" + startTime + ", leaveTime=" + leaveTime + '}';
    }

   

    
   
    
    
   
    
    
}
