package GuviMaintask2;

import java.util.Scanner; 
class Product {
	    private int pid;
	    private double price;
	    private int quantity;

	    // Parameterized constructor
	    public Product(int pid, double price, int quantity) {
	        this.pid = pid;
	        this.price = price;
	        this.quantity = quantity;
	    }

	    // Getter methods
	    public int getPid() {
	        return pid;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public int getQuantity() {
	        return quantity;
	    }
	}

	public class Question2_2 {
	    // Method to accept product information from user and store in an array
	    public static Product[] acceptProductInfo() {
	        Scanner scanner = new Scanner(System.in);
	        Product[] products = new Product[5];

	        System.out.println("Enter product information:");
	        for (int i = 0; i < products.length; i++) {
	            System.out.println("Product " + (i + 1) + ":");
	            System.out.print("Enter PID: ");
	            int pid = scanner.nextInt();
	            System.out.print("Enter price: ");
	            double price = scanner.nextDouble();
	            System.out.print("Enter quantity: ");
	            int quantity = scanner.nextInt();

	            products[i] = new Product(pid, price, quantity);
	        }
	        scanner.close();
	        return products;
	    }

	    // Method to find PID of the product with the highest price
	    public static int findHighestPricePID(Product[] products) {
	        double maxPrice = Double.MIN_VALUE;
	        int highestPricePID = -1;
	        for (Product product : products) {
	            if (product.getPrice() > maxPrice) {
	                maxPrice = product.getPrice();
	                highestPricePID = product.getPid();
	            }
	        }
	        return highestPricePID;
	    }

	    // Method to calculate and return the total amount spent on all products
	    public static double calculateTotalAmountSpent(Product[] products) {
	        double totalAmount = 0;
	        for (Product product : products) {
	            totalAmount += product.getPrice() * product.getQuantity();
	        }
	        return totalAmount;
	    }

	    public static void main(String[] args) {
	        // Accepting product information from the user
	        Product[] products = acceptProductInfo();

	        // Finding PID of the product with the highest price
	        int highestPricePID = findHighestPricePID(products);
	        System.out.println("PID of the product with the highest price: " + highestPricePID);

	        // Calculating total amount spent on all products
	        double totalAmountSpent = calculateTotalAmountSpent(products);
	        System.out.println("Total amount spent on all products: $" + totalAmountSpent);
	    }
	}
	

