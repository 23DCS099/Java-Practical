/* Write a program to take the user for a distance (in meters) and 
the time taken (as three numbers: hours, minutes, seconds), 
and display the speed, in meters per second, kilometers per 
hour and miles per hour (hint:1 mile = 1609 meters). 
1m = 1/1000km
1m = 1/1609miles
 */

import java.util.Scanner;

public class SpeedCalculator {

    public static void main(String[] args) {
        double distance;
        double time;
        int hours, minutes, seconds;
        double speed = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Distance in meters: ");
        distance = s.nextDouble();
        System.out.println("Enter Time in hours: ");
        hours = s.nextInt();
        System.out.println("Enter Time in minutes: ");
        minutes = s.nextInt();
        System.out.println("Enter Time in seconds: ");
        seconds = s.nextInt();
        time = (hours * 3600) + (minutes * 60) + seconds;
        speed = (distance) / (time);
        System.out.printf("Speed is %.2f m/s\n", speed);
        System.out.printf("Speed is %.2f km/hr\n", speed * (18 / 5));
        System.out.printf("Speed is %.2f miles/hour\n", speed * (3600 / 1609));
        
    }
}
