package GuviMaintask2;

class Person {
	    private String name;
	    private int age;

	    // Default constructor
	    public Person() {
	        this.age = 18; // Default age set to 18
	    }

	    // Parameterized constructor
	    public Person(String name, int age) {
	        this.name = name;
	        if (age >= 0) {
	            this.age = age;
	        } else {
	            System.out.println("Invalid age. Setting age to default (18).");
	            this.age = 18;
	        }
	    }

	    // Method to display name and age of person
	    public void displayInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	}

	public class Question2_1 {
	    public static void main(String[] args) {
	        // Creating person objects using default and parameterized constructors
	        Person person1 = new Person();
	        Person person2 = new Person("vaishzz", 22);

	        // Displaying information of person objects
	        System.out.println("Person 1:");
	        person1.displayInfo();
	        System.out.println("\nPerson 2:");
	        person2.displayInfo();
	    }
	}

