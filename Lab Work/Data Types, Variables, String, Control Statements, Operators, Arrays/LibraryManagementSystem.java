/* 
 * You are creating a library management system. The library 
has two separate lists of books for fiction and non-fiction.
The system should merge these lists into a single list for 
inventory purposes. Write a Java program to merge two 
arrays.
 */

import java.util.*;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        int fic, nonFic, total = 0;
        String ans;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Fictional books: ");
        fic = sc.nextInt();
        int[] arr1 = new int[fic];
        System.out.println("Enter the number of non Fictional book: ");
        nonFic = sc.nextInt();
        int[] arr2 = new int[fic];

        String[] fictional = new String[fic];
        String[] nonFictional = new String[nonFic];

        for (int i = 0; i < fic; i++) {
            System.out.println("Enter the name of the Fictional book " + (i + 1));
            fictional[i] = sc.next();
        }

        for (int i = 0; i < nonFic; i++) {
            System.out.println("Enter the name of the Non Fictional Book " + (i + 1));
            nonFictional[i] = sc.next();
        }

        total = fic + nonFic;
        System.out.println("The total number of books in the library is: " + total);

        System.out.println("Do you want to see all the types of books: ");
        ans = sc.next();

        if (ans == "yes" || "y".equals(ans) || ans == "Y" || ans == "Yes") {
            String[] arr3 = new String[total];

            for (int i = 0; i < total; i++) {
                if (i < fic) {
                    arr3[i] = fictional[i];
                } else {
                    arr3[i] = nonFictional[i - fic];
                }
            }

            System.out.println("The list of all the books are: ");
            for (int i = 0; i < total; i++) {
                System.out.println(arr3[i]);
            }
        }
        else{
          System.out.println("Have a good day !!!");
        }

        System.out.println("Name: Krishil Agrawal\nID: 23DCS001");
    }
}
