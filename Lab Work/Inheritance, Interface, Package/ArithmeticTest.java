import java.util.Scanner;

/**
 * Write a java that implements an interface 
 * AdvancedArithmetic which contains amethod signature 
 * int divisor_sum(int n). You need to write a class 
 * calledMyCalculator which implements the interface. 
 * divisorSum function just takes an integer as input and 
 * return the sum of all its divisors.
 * For example, divisors of 6 are 1, 2, 3 and 6, so 
 * divisor_sum should return 12. The value of n will be at 
 * most 1000.
 */

interface AdvancedArithmetic {
    
    void signature();

    int divisor_sum(int n);
}

class calledMyCalculator implements AdvancedArithmetic{
    public void signature(){}
    
    public int divisor_sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }
}

public class ArithmeticTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calledMyCalculator c = new calledMyCalculator();
        System.out.printf("Enter a number: ");
        int n = sc.nextInt();
        System.out.printf("The sum of all the divisor %d is %d", n, c.divisor_sum(n));
    }
}