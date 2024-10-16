/*
 * Given an array of ints, return the number of 9's in the 
 * array. array_count9([1, 2, 9]) → 1
 * array_count9([1, 9, 9]) → 2
 * array_count9([1, 9, 9, 3, 9]) → 3
 */

import java.util.Scanner;

public class NumberOfNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of an array: ");
        int arrayLength = sc.nextInt();

        System.out.println();
        
        int[] array = new int[arrayLength];
        for(int i=0; i<arrayLength; i++){
            System.out.printf("Enter digit %d: ", i+1);
            array[i]=sc.nextInt();
        }

        System.out.printf("Enter the digit you have to find in the array: ");
        int digit=sc.nextInt();

        System.out.println("The given digit is present "+array_count9(arrayLength, digit, array)+" times in the given list");
        System.out.println("Name: Krishil Agrawal\nID: 23DCS001");

    }
    private static int array_count9(int arrayLength, int digit, int array[]){  
        int noOfDigits=0;
        int flag=0;
        for(int i=0;i<arrayLength;i++){
            if(digit==array[i]){
                ++noOfDigits;
            }
        }
        if(noOfDigits==0){
            System.out.println("The given digit is not present in the list of the array");
        }
        return noOfDigits;
    }
}