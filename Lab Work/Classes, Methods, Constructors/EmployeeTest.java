import java.util.Scanner;

/**
 * Create a class called Employee that includes three pieces of
 * information as instance variables—a first name (type
 * String), a last name (type String) and a monthly salary
 * (double). Your class should have a constructor that
 * initializes the three instance variables. Provide a set and a
 * get method for each instance variable. If the monthly salary
 * is not positive, set it to 0.0. Write a test application named
 * EmployeeTest that demonstrates class Employee’s
 * capabilities. Create two Employee objects and display each
 * object’s yearly salary. Then give each Employee a 10%
 * raise and display each Employee’s yearly salary
 * again
 */

class Employee{
    String firstName;
    String lastName;
    double salary;
    Scanner sc = new Scanner(System.in);

    public Employee(){

    }

    public Employee(String firstName, String lastName, double salary) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
    }

    public void setFirstName(){
        System.out.println("Enter the first name of the Employee: ");
        this.firstName=sc.next();
    }

    public void setLastName(){
        System.out.println("Enter the first name of the Employee: ");
        this.lastName=sc.next();
    }

    public void setSalary(){
        System.out.println("Enter the first name of the Employee: ");
        this.salary=sc.nextDouble();
        if(salary<0.0){
            this.salary=0.0;
        }
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLasstName(){
        return this.lastName;
    }

    public double getSalary(){
        return this.salary;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Krishil", "Agrawal", 250000);
        Employee emp2 = new Employee("Keval", "Agrawal", 20000);
        System.out.println("The current salary of emp1 is: "+emp1.getSalary());
        System.out.println("The current salary of emp2 is: "+emp2.getSalary());
        // emp2.getSalary();
        double salary1 = emp1.getSalary();
        salary1+=(0.1*salary1);
        // emp1.setSalary();
        double salary2 = emp2.getSalary();
        salary2+=(0.1*salary2);
        System.out.println("The raised salary of emp1 is: "+salary1);
        System.out.println("The raised salary of emp2 is: "+salary2);
        System.out.println("Name: Krishil Agrawal\nID: 23DCS001");
    }
}