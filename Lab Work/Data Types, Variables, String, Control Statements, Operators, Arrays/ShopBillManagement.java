/*
* An electric appliance shop assigns code 1 to motor,2 to
* fan,3 to tube and 4 for wires. All other items have code 5 or
* more. While selling the goods, a sales tax of 8% to
* motor,12% to fan,5% to tube light,7.5% to wires and 3%
* for all other items is charged. A list containing the product
* code and price in two different arrays. Write a java
* program using switch statement to prepare the bill.
*/

import java.util.Scanner;

public class ShopBillManagement {

    public static void main(String[] args) {
        
        int[] productCode = new int[]{1, 2, 3, 4, 5};
        int[] productPrice = new int[]{100, 100, 100, 100, 100};
        double[] calculatedPrice = new double[5];
        String[] productName = new String[]{"Motor", "Fan", "Tube Light", "Wire", "Ohter Items"};
        int[] productQuantity = new int[5];
        int ans;
        double totalPrice = 0.0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Making an application that calculates the bill");
        System.out.println("The Shop contains items such as fan, motor, tube light, wires and various other things");
        System.out.println("The sales tax for each item is as follows: 8% to motor ,12% to fan, 5% to tube light ,7.5% to wires and 3% for all other items");
        
            System.out.println("Enter 1 : To Buy Motor");
            System.out.println("Enter 2 : To Buy Fan");
            System.out.println("Enter 3 : To Buy Tube Light");
            System.out.println("Enter 4 : To Buy Wire");
            System.out.println("Enter 5 : To Buy Other More Item");
            System.out.println("Enter 6 : To Exit");
            System.out.printf("\nEnter how many product you have to buy from this list: ");
            ans = sc.nextInt();
            System.out.println();
            if(ans==6){
                System.exit(0);
            }
            int[] choices = new int[ans];

            for(int i=0; i<ans;i++){   
                System.out.printf("Enter your choice "+(i+1)+": ");
                choices[i] = sc.nextInt();}
                System.out.println();

            for(int i=0; i<ans; i++){
                switch (choices[i]) {
                    case 1:
                        System.out.printf("Enter how many number of Motor you have to buy: ");
                        int motor = sc.nextInt();
                        productQuantity[0]=motor;
                        calculatedPrice[i] = (productPrice[i] + (productPrice[i]*0.08))*motor;
                        break;
                    case 2:
                        System.out.printf("Enter how many number of Fan you have to buy: ");
                        int fan = sc.nextInt();
                        productQuantity[1]=fan;
                        calculatedPrice[i] = (productPrice[i] + (productPrice[i]*0.12))*fan;
                        break;
                    case 3:
                        System.out.printf("Enter how many number of Tube Light you have to buy: ");
                        int tubelight = sc.nextInt();
                        productQuantity[2]=tubelight;
                        calculatedPrice[i] = (productPrice[i] + (productPrice[i]*0.05))*tubelight;
                        break;
                    case 4:
                        System.out.printf("Enter how many number of Wire you have to buy: ");
                        int wire = sc.nextInt();
                        productQuantity[3]=wire;
                        calculatedPrice[i] = (productPrice[i] + (productPrice[i]*0.075))*wire;
                        break;
                    case 5:
                        System.out.printf("Enter how many other items you want: ");
                        int other = sc.nextInt();
                        productQuantity[4]=other;
                        calculatedPrice[i] = (productPrice[i] + (productPrice[i]*0.03))*other;
                        break;
                    case 6:
                        System.out.printf("Thank you for shopping with us");
                        System.exit(0);
                        break;
                    default:
                        System.out.printf("Enter Correct Number !!!!");
                }
            }
        
        System.out.println("\nCongratulations your bill has been prepared !!!!");
        for(int i=0; i<ans; i++){
            totalPrice+=calculatedPrice[i];
        }
        System.out.println("\nThe total price of the products you buy is: " + totalPrice);

        System.out.println("\n\nRepresenting the bill format .....");
        System.out.println("----------------------------------------------------------------------\n");
        System.out.println("Product Code\t\tProduct Name\t\tQuantity\t\tPrice");
        for(int i=0; i<ans; i++){
            System.out.println(choices[i] + "\t\t\t"+ productName[choices[(i)]-1] + "\t\t\t" + productQuantity[choices[(i)]-1] + "\t\t\t" + "100");
        }
        System.out.println("Name: Krishil Agrawal\nID: 23DCS001");

    }
    public static void allocatingBillNo() {
        System.out.println("Allocating the bill no. for all the items: ");
    }
}