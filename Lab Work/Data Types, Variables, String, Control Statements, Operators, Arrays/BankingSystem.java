// Imagine you are developing a simple banking application
// where you need to display the current balance of a user
// account. For simplicity, let's say the current balance is $20.
// Write a java program to store this balance in a variable and
// then display it to the user

import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {
        double currBalance = 20.0;
        System.out.println("Enter the amount you are having in your current balance: ");
        Scanner sc = new Scanner(System.in);
        currBalance = sc.nextDouble();
        System.out.println("Your current balance is: $" + currBalance);
        
    }
}