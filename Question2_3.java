package GuviMaintask2;

public class Question2_3 {

	    private double balance;

	    // No-argument constructor
	    public Question2_3() {
	        this.balance = 0.0;
	    }

	    // Parameterized constructor
	    public Question2_3(double initialBalance) {
	        if (initialBalance >= 0) {
	            this.balance = initialBalance;
	        } else {
	            System.out.println("Invalid initial balance. Balance set to 0.");
	            this.balance = 0.0;
	        }
	    }

	    // Method to deposit the amount to the account
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Amount deposited successfully.");
	        } else {
	            System.out.println("Invalid amount. Deposit failed.");
	        }
	    }

	    // Method to withdraw the amount from the account
	    public void withdraw(double amount) {
	        if (amount > 0 && balance >= amount) {
	            balance -= amount;
	            System.out.println("Amount withdrawn successfully.");
	        } else {
	            System.out.println("Insufficient balance or invalid amount. Withdrawal failed.");
	        }
	    }

	    // Method to display the balance
	    public void displayBalance() {
	        System.out.println("Current Balance: $" + balance);
	    }

	    public static void main(String[] args) {
	        // Creating an account with default balance
	    	Question2_3 account1 = new Question2_3();
	        System.out.println("Account 1 created with default balance.");
	        account1.displayBalance();

	        // Creating an account with initial balance
	        Question2_3 account2 = new Question2_3(8000.0);
	        System.out.println("\nAccount 2 created with initial balance.");
	        account2.displayBalance();

	        // Depositing and withdrawing from account 2
	        account2.deposit(900.0);
	        account2.displayBalance();
	        account2.withdraw(500.0);
	        account2.displayBalance();
	    }
	}
	

