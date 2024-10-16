
/**
 * Create a class named 'Rectangle' with two data members
 * 'length' and 'breadth' and two methods to print the area and
 * perimeter of the rectangle respectively. Its constructor
 * having parameters for length and breadth is used to
 * initialize length and breadth of the rectangle. Let class
 * 'Square' inherit the 'Rectangle' class with its constructor
 * having a parameter for its side (suppose s) calling the
 * constructor of its parent class as 'super(s,s)'. Print the area
 * and perimeter of a rectangle and a square. Also use array
 * of objects.
 */
class Rectangle {

    int length;
    int breadth;

    Rectangle() {
    }

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void area() {
        System.out.println("The area of rectangle is: " + (this.length * this.breadth));
    }

    void perimeter() {
        System.out.println("The area of rectangle is: " + (this.length * this.breadth));
    }
}

class Square extends Rectangle {

    int side;

    Square() {
        super();
    }

    Square(int side) {
        super(side, side);
        this.side = side;
    }

    void area() {
        System.out.println("The area of Square is: " + (side * side));
    }

    void perimeter() {
        System.out.println("The perimenter of Square is: " + (4 * side));
    }
}

public class CalculateArea {

    public static void main(String[] args) {
        Square s1 = new Square(4);
        s1.area();
        System.out.println("Name: Krishil Agrawal\nID: 23DCS001");
    }
}
