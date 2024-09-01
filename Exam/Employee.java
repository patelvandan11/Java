
class Employee {
    // Instance variables
    int age;
    int emp_no;
    String name;
    float salary;
    
    // Constructor
    Employee(String name, int age, float salary, int emp_no) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.emp_no = emp_no;
    }
    
    // Method to display employee information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Employee Number: " + emp_no);
        System.out.println();
    }
    public static void main(String[] args){
        Employee emp1[] =new Employee[10];
        emp1[0] = new Employee("John", 25, 25000, 101);
        emp1[1] = new Employee("John", 25, 25000, 101);
        emp1[2] = new Employee("John", 25, 25000, 101);
        emp1[3] = new Employee("John", 25, 25000, 101);
        emp1[4] = new Employee("John", 25, 25000, 101);
        emp1[5] = new Employee("John", 25, 25000, 101);
        emp1[6] = new Employee("John", 25, 25000, 101);
        emp1[7] = new Employee("John", 25, 25000, 101);
        emp1[8] = new Employee("John", 25, 25000, 101);
        emp1[9] = new Employee("John", 25, 25000, 101);
    
        for (int i = 0; i < emp1.length; i++) {
            emp1[i].displayInfo();
        }
    }
}