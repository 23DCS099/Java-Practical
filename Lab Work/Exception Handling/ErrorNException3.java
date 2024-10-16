public class ErrorNException3 {
    public static void main(String[] args) {
        int a[] = {1,2,3};
        String s = "Charusat";
        String s1 = null;

        try {
            System.out.println(a[3]);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        catch(ArrayIndexOutOfBoundsException e1){
            e1.printStackTrace();
        }
        catch(StringIndexOutOfBoundsException e2){
            e2.printStackTrace();
        }
        catch(NullPointerException e3){
            e3.printStackTrace();
        }

        
    }
}