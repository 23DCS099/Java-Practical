
import java.util.Scanner;

/**
 * Write a program to print the area of a rectangle by creating a class named
 * 'Area' taking the values of its length and breadth as parameters of its
 * constructor and having a method named 'returnArea' which returns the area of
 * the rectangle. Length and breadth of rectangle are entered through keyboard.
 */

class Area {

    double length;
    double breadth;
    Scanner sc = new Scanner(System.in);

    Area() {
        length = 1;
        breadth = 2;
    }

    Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void readData(Area a1) {
        System.out.println("Enter the length of the rectangle: ");
        a1.length = sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle: ");
        a1.breadth = sc.nextDouble();
        //return a1;
        System.out.println("The area of rectangle is: " + a1.returnArea());
    }

    double returnArea() {
        //    Area temp = new Area();
        return length * breadth;
    }
}

public class TestArea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the length of the rectangle: ");
        // double length = sc.nextDouble();
        // System.out.println("Enter the breadth of the rectangle: ");
        // double breadth = sc.nextDouble();
        Area a1 = new Area();
        Area a2 = new Area();
        a1.readData(a1);
        System.out.println("Name: Krishil Agrawal\nID: 23DCS001");
        // a2.displayArea();
    }
}
