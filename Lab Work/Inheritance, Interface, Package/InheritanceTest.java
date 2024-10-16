/**
 * Create a class with a method that prints "This is parent 
 * class" and its subclass with another method that prints "This 
 * is child class". Now, create an object for each of the
 * class and call 1 - method of parent class by object of parent
 */

class ParentClass{
    
    void message(){
        System.out.println("This is a Parent Class");
    }
}

class ChildClass extends ParentClass{
    void message(){
        System.out.println("This is a Child Class");
        // super.message();
    }
}

public class InheritanceTest{
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        ParentClass parent = new ParentClass();
        parent.message();
        child.message();
        
    }
}