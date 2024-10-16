import java.util.Scanner;

/**
 * Write a Java program to replace each substring of a given 
 * string that matches the given regular expression with the 
 * given replacement.
 * Sample string : "The quick brown fox jumps over the lazy 
 * dog."
 * In the above string replace all the fox with cat.
 */

public class SubStringReplacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter a sentence: ");
        String str = sc.nextLine();
        System.out.printf("Enter the substring you want to replace: ");
        String replaceString = sc.next();
        System.out.printf("Enter the string you want to replace with: ");
        String replaceWithString = sc.next();
        if(str.contains(replaceString)){
            String replacedString=str.replaceAll(replaceString, replaceWithString);
            System.out.printf("The sentence after replacement is: %s", replacedString);
        }
        else{
            System.out.println("The String you enter does not exist in the sentence !!!");
        System.out.println("Name: Krishil Agrawal\nID: 23DCS001");
    }
    }
}
