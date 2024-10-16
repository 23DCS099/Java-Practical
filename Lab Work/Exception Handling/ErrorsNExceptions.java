//? Checked Error is also know as compile time error
//? Unchecked Error is also known as run time error

public class ErrorsNExceptions{
    public static void main(String[] args) {
        int a=5, b=0, c;
        // System.out.println("Try block will run");
        try {
            c=a/b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.toString()); //Method 1
            // e.getMessage();      //Method 2
            // e.printStackTrace(); //Method 3
            // System.out.println("Catch block successfully executed");
        }

        
        // System.out.println("out of try and catch");

        // int a[] = {10,20,30};
        // try {
        //     System.out.println(a[3]);  //! java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        // } catch (Exception e) {
        //     // System.out.println(e.toString());
        //     e.printStackTrace();
        // }

        // String s = "Charusat";
        // try {
        //     System.out.println(s.charAt(9));  //! java.lang.StringIndexOutOfBoundsException: Index 9 out of bounds for length 8
        // } catch (Exception e) {
        //     // System.out.println(e.toString());
        //     e.printStackTrace();
        // }

        // String s1 = null;
        // try {
        //     System.out.println(s1.length()); //! java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null
        // } catch (Exception e) {
        //     // System.out.println(e.toString());
        //     e.printStackTrace();
        // }

        // int a[] = {1, 2, 3};
        // try {
        //     System.out.println(a[3]);
        // }
        // catch(ArrayIndexOutOfBoundsException s){
        //     System.out.println("Hello 1");
        //     s.printStackTrace();
        // }
        // catch (Exception e) {
        //     System.out.println("Hello 2");
        //     e.printStackTrace();
        // }
    }
}