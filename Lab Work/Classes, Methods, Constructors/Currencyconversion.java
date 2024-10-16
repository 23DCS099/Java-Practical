import java.util.Scanner;

public class Currencyconversion {
    public int Pound;
    public int Rupees;
    Scanner sc=new Scanner(System.in);

    protected int convertToRupees(int currency){
        Rupees=Pound/100;
        return Rupees;
    }

    protected int convertToPound(int currency){
        Pound = 100 * Rupees;
        return Pound;
    }

    protected void takeRupees(){
        System.out.println("Enter the value in Rupees: ");
        float Rupees = sc.nextFloat();
    }
    
    protected void takePound(){
        System.out.println("Enter the value in Pound: ");
        float Pound = sc.nextFloat();
        System.out.println("Name: Krishil Agrawal\nID: 23DCS001");
    }
    
}
