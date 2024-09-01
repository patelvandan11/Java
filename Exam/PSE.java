// Base class Person
class Person {
    String name;
    String address;
    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
     void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}
// Derived class Student
class Student extends Person {
    int enroll_no;
    float mark1, mark2;
    Student(String name, String address, int enroll_no, float mark1, float mark2) {
        super(name, address);
        this.enroll_no = enroll_no;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }
    float total_mark() {
        return mark1 + mark2;
    }
    @Override
    void display() {
        super.display(); 
        System.out.println("Enrollment Number: " + enroll_no);
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Total Marks: " + total_mark());
    }
}
// Derived class Employee
class Employee extends Person {
    int emp_id;
    float HRA, DA;
    
    // Constructor
    Employee(String name, String address, int emp_id, float HRA, float DA) {
        super(name, address); // Call the constructor of the Person class
        this.emp_id = emp_id;
        this.HRA = HRA;
        this.DA = DA;
    }
    
    // Method to calculate total salary
    float totalSalary() {
        return HRA + DA;
    }
    
     
    @Override
    void display() {
        super.display(); // Call the display method of the Person class
        System.out.println("Employee ID: " + emp_id);
        System.out.println("HRA: " + HRA);
        System.out.println("DA: " + DA);
        System.out.println("Total Salary: " + totalSalary());
    }
}
 
public class PSE {
    public static void main(String[] args) {
        // Create a Person reference
        Person personRef;
        
        // Create a Student object
        Student student = new Student("Alice", "123 Maple Street", 101, 85.5f, 90.0f);
        
        // Create an Employee object
        Employee employee = new Employee("Bob", "456 Oak Avenue", 202, 1500.0f, 2000.0f);
        
        // Dynamic method dispatch
        System.out.println("Student Details:");
        personRef = student; // Person reference points to Student object
        personRef.display(); // Calls the overridden display method in Student
        
        System.out.println("\nEmployee Details:");
        personRef = employee; // Person reference points to Employee object
        personRef.display(); // Calls the overridden display method in Employee
    }
}
