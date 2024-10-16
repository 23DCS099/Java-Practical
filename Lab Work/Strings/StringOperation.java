import java.util.Scanner;

/**
 * Given a string, return a string where for every char in the
 * original, there are two chars.
 * double_char('The') → 'TThhee'
 * double_char('AAbb') → 'AAAAbbbb'
 * double_char('Hi-There') → 'HHii--TThheerree'
 */

public class StringOperation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter a String: ");
        String str = sc.next();

        System.out.printf("Enter the number of characters for repitition: ");
        int noOfRepition = sc.nextInt();

        for(int i=0; i<str.length(); i++){
            for(int j=0; i<noOfRepition; j++){
                char str1=str.charAt(i);
                System.out.printf("%c%c", str1, str1);
            }
        }
        System.out.println("Name: Krishil Agrawal\nID: 23DCS001");
    }
}