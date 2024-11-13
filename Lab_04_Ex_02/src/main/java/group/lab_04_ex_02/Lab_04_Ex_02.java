package group.lab_04_ex_02;

import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter; 

class DateTime {
    int year;
    int month;
    int day;
    int hour;
    int minute;
    int second;
    
    public DateTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        this.year = currentDateTime.getYear();
        this.month = currentDateTime.getMonthValue();
        this.day = currentDateTime.getDayOfMonth();
        this.hour = currentDateTime.getHour();
        this.minute = currentDateTime.getMinute();
        this.second = currentDateTime.getSecond();
    }
    public DateTime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
       
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }
    public DateTime(int year, int month, int day, int hour, int minute, int second) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void setDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public String getDate() {
        return year + "-" + String.format("%02d", month) + "-" + String.format("%02d", day);
    }
    public String getTime() {
        return String.format("%02d", hour) + ":" + String.format("%02d", minute) + ":" + String.format("%02d", second);
    }
    public void display() {
        System.out.println("Date: " + getDate());
        System.out.println("Time: " + getTime());
    }
}
public class Lab_04_Ex_02 {
    public static void main(String[] args) {
        DateTime currentDateTime = new DateTime();
        System.out.println("\nCurrent Date and Time:");
        currentDateTime.display();
        DateTime customDate = new DateTime(2024, 10, 12); 
        System.out.println("\nCustom Date (Year, Month, Day) ");
        customDate.display();
        DateTime customDateTime = new DateTime(2024, 10, 14, 11, 25, 45); 
        System.out.println("\nCustom Date and Time (Year, Month, Day, Hour, Minute, Second):");
        customDateTime.display();
        customDate.setDate(2024, 10, 25); 
        customDate.setTime(20, 15, 30); 
        System.out.println("\nModified Date and Time:");
        customDate.display();
    }
}
