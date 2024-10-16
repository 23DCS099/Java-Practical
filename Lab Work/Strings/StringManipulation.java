/**
 * Given a string and a non-negative int n, we'll say that the 
 * front of the string is the first 3 chars, or whatever is there if 
 * the string is less than length 3. Return n copies of the front;
 * front_times('Chocolate', 2) → 'ChoCho'
 * front_times('Chocolate', 3) → 'ChoChoCho'
 * front_times('Abc', 3) → 'AbcAbcAbc'
 */

import java.util.*;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter a String: ");
        String str = sc.next();
        System.out.printf("Enter a repetition value: ");
        int n = sc.nextInt();
        System.out.println(stringReturn(str, n));
        
        
    }
    public static StringBuilder stringReturn(String str, int num){
        String str1 = str.substring(0, 3);
        StringBuilder newStr=new StringBuilder(str1);

        for(int i=1;i<num;i++){
            newStr.append(str1);
        }
        return newStr;
    }
}