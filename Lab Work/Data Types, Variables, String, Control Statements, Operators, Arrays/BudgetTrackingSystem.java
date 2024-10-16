/* 
* Imagine you are developing a budget tracking application. 
You need to calculate the total expenses for the month. Users 
will input their daily expenses, and the program should 
compute the sum of these expenses. Write a Java program to 
calculate the sum of elements in an array representing daily 
expenses.
 */

import java.util.Scanner;

public class BudgetTrackingSystem {

    public static void main(String[] args) {
        int num;
        double expense = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of your expenses: ");
        num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Enter your Expense " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            expense += arr[i];
        }
        System.out.println("Your total expense is: $" + expense);
        System.out.println("Name: Krishil Agrawal\nID: 23DCS001");
    }
}

/*
 * 6 8 7 3 2        --> 8,7,6          --> 30 24 22   --> 30 Highest
 * 10 24 1 2 5      --> 24,10,5        --> 8 24 22 14 30
 * 21 12 22 14 15   --> 22 21 15       --> 24 10 22 10 5
 * 8 9 14 6 2       --> 14 9 8         --> 24 22
 * 20 30 22 18 19   --> 30 22 20
 */
