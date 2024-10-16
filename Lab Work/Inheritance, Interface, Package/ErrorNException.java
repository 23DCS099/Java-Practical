//? Write a java program which takes two integers x & y as 
//? input, you have to compute x/y. If x and y are not integers 
//? or if y is zero, exception will occur and you have to
//? report it.

import java.util.Scanner;

public class ErrorNException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        divide(x,y);
    }
    public static void divide(int x, int y){
        try {
            float s = x/y;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
