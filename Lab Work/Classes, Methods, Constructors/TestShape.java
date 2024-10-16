/**
 * Create a class named 'Shape' with a method to print "This 
 * is This is shape". Then create two other classes named 
 * 'Rectangle', 'Circle' inheriting the Shape class, both 
 * having a method to print "This is rectangular shape" and 
 * "This is circular shape" respectively. Create a subclass 
 * 'Square' of 'Rectangle' having a method to print "Square 
 * is a rectangle". Now call the method of 'Shape' and
 * 'Rectangle' class by the object of 'Square' class.
 */

class Shape{
    void printShape(){
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape{
    void printRectangle(){
        System.out.println("This is rectangular shape");
    }
}

class Square extends Rectangle{
    void printSquare(){
        System.out.println("Square is a rectangle");
    }
}

class Circle extends Shape{
    void printCircle(){
        System.out.println("This is circular shape");
    }
}

public class TestShape {
    public static void main(String[] args) {
        Square s = new Square();
        s.printShape();
        s.printRectangle();
        
    }
}
