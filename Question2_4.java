package GuviMaintask2;

class Person {
    protected String name;
    protected int age;

    // Constructor for Person class
    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display Person information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    private int employeeID;
    private double salary;

    // Constructor for Employee class
    public Employee(String name, int age, int employeeID, double salary) {
        super(name, age); // Initializing Person attributes using super keyword
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Method to display Employee information
    public void displayInfo() {
        super.displayInfo(); // Calling displayInfo method of Person class
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: $" + salary);
    }
}

public class Question2_4 {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee1 = new Employee("Vaishzz", 22, 1001, 50000.0);

        // Displaying Employee information
        System.out.println("Employee Information:");
        employee1.displayInfo();
    }
}

	

