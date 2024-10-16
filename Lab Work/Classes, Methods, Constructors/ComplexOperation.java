/**
 * Print the sum, difference and product of two complex
 * numbers by creating a class named ‘Complex’ with separate
 * methods for each operation whose real and imaginary parts
 * are entered by user.
 */

class Complex{
    double img;
    double real;
    double addImg, addReal;

    Complex(){

    }

    Complex(double img, double real){
        this.img=img;
        this.real=real;
    }

    void AddComplex(Complex c1){
        addImg=this.img+c1.img;
        addReal=this.real+c1.real;
    }

    void SubtractComplex(Complex c1){
        addImg=this.img-c1.img;
        addReal=this.real-c1.real;
    }

    void MultiplyComplex(Complex c1){
        addImg=this.img*c1.img;
        addReal=this.real*c1.real;
    }

    void DivideComplex(Complex c1){
        addImg=this.img/c1.img;
        addReal=this.real/c1.real;
    }

    void displayComplex(){
        System.out.println(addImg +" + "+ addReal);
    }
}

public class ComplexOperation {
    public static void main(String[] args) {
        Complex c1 = new Complex(18,24);
        Complex c2 = new Complex(18,24);
        c2.AddComplex(c1);
        c2.displayComplex();
        System.out.println("Name: Krishil Agrawal\nID: 23DCS001");
    }   
}