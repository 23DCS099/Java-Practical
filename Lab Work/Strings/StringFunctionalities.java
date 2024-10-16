/**
 * Perform following Functionalities of the string:
 * “CHARUSAT UNIVERSITY”
 * ● Find length
 * ● Replace ‘H’ by ‘FIRST LATTER OF YOUR NAME’
 * ● Convert all character in lowercase

 */

public class StringFunctionalities {
    public static void main(String[] args) {
        String str = "CHARUSAT UNIVERSITY";
        StringBuilder replacedString = new StringBuilder(str);
        System.out.println("The length of the string is: "+str.length());
        System.out.println("After replacing H with K: "+str.replaceAll("H", "K"));
        System.out.println("The lowercase of the string is: " + str.toUpperCase());
        System.out.println("Name: Krishil Agrawal\nID: 23DCS001");
    }
}