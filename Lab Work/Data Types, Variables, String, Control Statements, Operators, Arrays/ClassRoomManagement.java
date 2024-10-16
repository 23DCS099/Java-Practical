/* 
 * Imagine you are developing a classroom management
 * system. You need to keep track of the grades of students in a
 * class. After collecting the grades, you want to display each
 * student's grade along with a message indicating if they have
 * passed or failed. Let's assume the passing grade is 50.
*/

import java.util.*;

public class ClassRoomManagement {
    public static void main(String[] args) {
        int studentPass=50;
        Scanner sc=new Scanner(System.in);

        System.out.printf("Enter the number of students in the classroom: ");
        int noOfStudents = sc.nextInt();

        String[] studentName = new String[noOfStudents];
        int[] studentGrade = new int[noOfStudents];
        String[] failStudents = new String[noOfStudents];
        String[] passStudents = new String[noOfStudents];
        String[] studentResult = new String[noOfStudents];
        int fail=0, pass=0;

        for(int i=0; i<noOfStudents; i++){
            System.out.printf("Enter the name of student %d: ", i+1);
            studentName[i]=sc.next();
        }

        System.out.println();

        for(int i=0; i<noOfStudents; i++){
            System.out.printf("Enter the grade of student %s: ", studentName[i]);
            studentGrade[i]=sc.nextInt();
        }

        for(int i=0; i<noOfStudents; i++){
            if(studentGrade[i]<=50){
                failStudents[i]="fail";
                studentResult[i]="fail";
                ++fail;
            }
            else{
                passStudents[i]="pass";
                studentResult[i]="pass";
                ++pass;
            }
        }

        System.out.printf("\nGenerating the Students Marksheet ........");

        System.out.println("\n\nStudent Name\t\t" + "Student Grade\t\t" + "Result");
        for(int i=0; i<noOfStudents; i++){
            System.out.println(studentName[i] + "\t\t\t" + studentGrade[i] + "\t\t\t" + studentResult[i]);
        }

        System.out.println("\n\nThe total number of students passed is: " + pass);
        System.out.println("The total number of students passed is: " + fail);
        System.out.println("Name: Krishil Agrawal\nID: 23DCS001");
    }
}
