import java.util.Scanner;



/**
 * 1. Write a Java program to count and print all duplicates in
the input string.
Sample Output:
The given string is: resource
The duplicate characters and counts are:
e appears 2 times
r appears 2 times
 */

public class StringDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // bruteForceApproach();
        optimisedApproach();     
}

    public static void bruteForceApproach(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String newStr = sc.next();

        char[] c = new char[newStr.length()];
        int[] noOfCounts = new int[newStr.length()];

        for(int i=0;i<newStr.length();i++){
            c[i]='0';
        }

        for(int i=0;i<newStr.length();i++){
            noOfCounts[i]=0;
        }

        for(int i=0;i<newStr.length();i++){
            for(int j=0;j<newStr.length();j++){
                if(newStr.charAt(i)==newStr.charAt(j)){
                    c[i]=newStr.charAt(i);
                    noOfCounts[i]++;
                }
            }
        }

        for(int i=0;i<newStr.length();i++){
            
            if(c[i]!='0' && noOfCounts[i]>1){
                System.out.printf("%c appears %d times\n", c[i], noOfCounts[i]);
            }
        }
    }

    public static void optimisedApproach(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String newStr = sc.next();
        sc.close();

        // Array to store character counts
        int[] charCount = new int[256]; // Assuming ASCII character set

        // Count each character's frequency
        for (int i = 0; i < newStr.length(); i++) {
            charCount[newStr.charAt(i)]++;
        }

        System.out.println("The given string is: " + newStr);

        // Print characters that appear more than once
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                System.out.printf("%c appears %d times\n", (char)i, charCount[i]);
            }
    }
    System.out.println("Name: Krishil Agrawal\nID: 23DCS001");
}

}