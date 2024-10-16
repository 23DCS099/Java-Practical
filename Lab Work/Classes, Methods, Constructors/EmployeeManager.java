/**
 * Create a class named 'Member' having the following 
 * members: Data members
 * 1 - Name
 * 2 - Age
 * 3 - Phone number 
 * 4 - Address
 * 5 – Salary
 * It also has a method named 'printSalary' which prints the 
 * salary of the members. Two classes 'Employee' and 
 * 'Manager' inherits the 'Member' class. The 'Employee' and 
 * 'Manager' classes have data members 'specialization' and 
 * 'department' respectively. Now, assign name, age, phone 
 * number, address and salary to an employee and a manager 
 * by making an object of both of these classes and print the
 * same.
 */

class Member{
    String name;
    String address;
    int age;
    double phno;
    float salary;

    void printSalary(){
        System.out.println("The salary of Employee " + this.name + " is: " + this.salary);
    }

    Member(){}

    Member(String name, String address, int age, double phno, float salary){
        this.name=name;
        this.address=address;
        this.age=age;
        this.phno=phno;
        this.salary=salary;
    }

    void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Age: "+age);
        System.out.println("Phone Number: "+phno);
        System.out.println("Salary: "+salary);
    }
}

class Employee extends Member{
    String specialization, department; 

    Employee(){
        super();
    }

    Employee(String name, String address, int age, double phno, float salary, String specialization, String department){
        super(name, address, age, phno, salary);
        this.specialization=specialization;
        this.department=department;
    }

    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Specialization: "+specialization);
        System.out.println("Department: "+department);
    }

}

class Manager extends Member{
    String specialization, department;

    Manager(){
        super();
    }

    Manager(String name, String address, int age, double phno, float salary, String specialization, String department){
        super(name, address, age, phno, salary);
        this.specialization=specialization;
        this.department=department;
    }

    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Specialization: "+specialization);
        System.out.println("Department: "+department);
    }

}

public class EmployeeManager {
    public static void main(String[] args) {
        Employee emp = new Employee("Aditya", "Rajkot", 18, 12364, 2000, "WEB", "CSE");
        Manager mng = new Manager("Krishil", "Vadodara", 19, 12364, 200000, "AI ML", "CSE");
        emp.displayDetails();
        System.out.println();
        mng.displayDetails();
        System.out.println("Name: Krishil Agrawal\nID: 23DCS001");
    }
}
