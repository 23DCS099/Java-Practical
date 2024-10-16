/**
 * Assume you want to capture shapes, which can be either 
 * circles (with a radius and a color) or rectangles (with a 
 * length, width, and color). You also want to be able to 
 * create signs (to post in the campus center, for example),
 * each of which has a shape (for the background of the sign) 
 * and the text (a String) to put on the sign. Create classes 
 * and interfaces for circles, rectangles, shapes, and signs. 
 * Write a program that illustrates the significance of
 * interface default method.
 */


interface Shape {
    void draw();
    default void scale(double factor) {
        System.out.println("Scaling by " + factor);
    }
}


class Circle implements Shape {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius + " and color " + color);
    }
}


class Rectangle implements Shape {
    private double length;
    private double width;
    private String color;
    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with length " + length + ", width " + width + ", and color " + color);
    }
}


class Sign {
    private Shape shape;
    private String text;

    public Sign(Shape shape, String text) {
        this.shape = shape;
        this.text = text;
    }
    public void display() {
        shape.draw();
        System.out.println("With text: " + text);
    }
}

public class Main {
    public static void main(String[] args) {

        // Create shapes
        Circle circle = new Circle(5, "red");
        Rectangle rectangle = new Rectangle(4, 6, "blue");

        // Create signs
        Sign sign1 = new Sign(circle, "Hello");
        Sign sign2 = new Sign(rectangle, "World");

        
        sign1.display();
        sign2.display();

        
        circle.scale(2);
        rectangle.scale(3);
    }
}