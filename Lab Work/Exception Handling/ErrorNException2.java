//? Write a Java program that throws an exception and catch
//? it using a try-catch block.

public class ErrorNException2 {
    public static void main(String[] args) {
        int a[] = {1,2,3};
        String s = "Charusat";
        String s1 = null;
        int r;
        try {
            try {
                r=a[0]/0;
            } catch (ArithmeticException e) {
                System.out.println("Hello 1");
                e.printStackTrace();
            }
            try {
                System.out.println(a[3]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Hello 2");
                e.printStackTrace();
            }
            try {
                System.out.println(s1.length());
            } catch (NullPointerException e) {
                System.out.println("Hello 3");
                e.printStackTrace();
            }
            System.out.println(s.charAt(9));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Hello 4");
            e.printStackTrace();
        }

        System.out.println("Name: Krishil Agrawal\nID: 23DCS001");
    }
}
