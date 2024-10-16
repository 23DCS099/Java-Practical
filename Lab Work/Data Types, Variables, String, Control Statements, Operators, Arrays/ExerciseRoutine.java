
import java.util.*;

public class ExerciseRoutine {

    public static void main(String[] args) {
        long num;
        int result = 0;
        System.out.println("Enter the number for FIBONACCI Series: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextLong();
        for (int i = 0; i < num; i++) {
            result += FibonacciNumber(i);
            System.out.print(FibonacciNumber(i) + " ");
        }
        System.out.println(" ");
        System.out.printf("The sum of all the Fibonacci series of %d numbers is %d", num, result);
        System.out.println("\nName: Krishil Agrawal\nID: 23DCS001");
    }

    public static int FibonacciNumber(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return FibonacciNumber(num - 1) + FibonacciNumber(num - 2);
        }
    }
}

/* 2^-31 */
