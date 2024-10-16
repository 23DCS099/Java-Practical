/**
 * Perform following functionalities of the string:
 * Find Length of the String
 * Lowercase of the String
 * Uppercase of the String
 * Reverse String
 * Sort the String  --pending
*/

/** StringBuilder and StringBuffer */

import java.util.*;

public class StringMethods {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String obj = sc.next();
        StringBuilder str = new StringBuilder(obj);

        //Length of the string
        System.out.println("The length of the string is: "+obj.length());
        //Lowercase of the string
        System.out.println("The lowercase of the string is: "+obj.toLowerCase());
        //Uppercase of the string
        System.out.println("The uppercase of the string is: "+obj.toUpperCase());
        //Reverse String
        for(int i=obj.length();i>0;i--){
            str.append(obj.charAt(i-1));
        }
        System.out.printf("The reverse of the string is: ");
        for(int i=(obj.length())-1 ; i>=0 ; i--)
        {
            char ch = obj.charAt(i);
            System.out.print(ch);
        }
        //Sort the string
    System.out.println("\nThe sorted string is: "+str);
    
}
}