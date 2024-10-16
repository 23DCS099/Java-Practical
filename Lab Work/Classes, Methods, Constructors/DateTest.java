
import java.util.Scanner;

/**
 * Create a class called Date that includes three pieces of
 * information as instance variables—a month (type int), a day
 * (type int) and a year (type int). Your class should have a
 * constructor that initializes the three instance variables and
 * assumes that the values provided are correct. Provide a set
 * and a get method for each instance variable. Provide a
 * method displayDate that displays the month, day and year
 * separated by forward slashes (/). Write a test application
 * named DateTest that demonstrates class Date’s capabilities
 */

class Date{
    int month;
    int day;
    int year;
    Scanner sc = new Scanner(System.in);

    public Date(){

    }

    public Date(int month, int day, int year){
        this.month=month;
        this.year=year;
        this.day=day;
    }

    public void setMonth(){
        System.out.println("Enter the month: ");
        this.month=sc.nextInt();
        if(month>12){
            this.month=1;
        }
    }

    public void setYear(){
        System.out.println("Enter the month: ");
        this.year=sc.nextInt();
    }

    public void setDay(){
        System.out.println("Enter the month: ");
        this.day=sc.nextInt();
        if(day>31){
            this.day=1;
        }
    }

    public int getMonth(){
        return this.month;
    }

    public int getDay(){
        return this.day;
    }

    public int getYear(){
        return this.year;
    }

    public void displayDate(){
        System.out.println(this.day + "//"+ this.month + "//"+this.year);
    }
}

public class DateTest {
    public static void main(String[] args) {
        Date d1 = new Date(05,07,2005);
        d1.displayDate();
        
    }
}