// Design a console-based Bank Management Program in java that allows a user to create a bank account and perform basic operations such as deposit, withdrawal, balance enquiry, and account details display. The program should handle exceptions as required
package Assignment1;
import java.util.*;
class BankAccount {
	private String accountHolder;
	private long accountNumber;
	private double balance;
	
	// Constructor
	BankAccount(String accountHolder, long accountNumber, double balance) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	// Deposit money
	void deposit(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Deposit amount must be greater than zero.");
		}
		
		balance += amount;
		System.out.println("Amount deposited successfully.");
	}
	
	// Withdraw money
	void withdraw(double amount) {
        if (amount <= 0 || !Double.isFinite(amount)) {
            throw new IllegalArgumentException("Withdrawal amount must be greater than zero.");
        }

        if (amount > balance) {
            throw new IllegalArgumentException(
                "Insufficient balance."
            );
        }

        balance -= amount;
        System.out.println("Amount withdrawn successfully.");
    }

	// Balance enquiry
    void checkBalance() {
        System.out.printf("Current Balance: Rs. %.2f%n", balance);
    }

    // Display account details
    void displayDetails() {
        System.out.println("\n----- Account Details -----");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        checkBalance();
    }
}
public class program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        BankAccount account = null;
        int choice = 0;

        do {
            System.out.println("\n===== Bank Management System =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Balance Enquiry");
            System.out.println("5. Display Account Details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        if (account != null) {
                            System.out.println("Account already exists.");
                            break;
                        }

                        sc.nextLine();

                        System.out.print("Enter account holder name: ");
                        String name = sc.nextLine().trim();

                        if (name.isEmpty()) {
                            throw new IllegalArgumentException(
                                "Name cannot be empty."
                            );
                        }

                        System.out.print("Enter account number: ");
                        long accNo = sc.nextLong();

                        if (accNo <= 0) {
                            throw new IllegalArgumentException(
                                "Account number must be positive."
                            );
                        }

                        System.out.print("Enter initial deposit: ");
                        double initialDeposit = sc.nextDouble();

                        if (!Double.isFinite(initialDeposit)
                                || initialDeposit < 0) {
                            throw new IllegalArgumentException(
                                "Initial deposit cannot be negative."
                            );
                        }

                        account = new BankAccount(
                            name, accNo, initialDeposit
                        );

                        System.out.println("Account created successfully!");
                        break;

                    case 2:
                        if (account == null) {
                            System.out.println(
                                "Please create an account first."
                            );
                            break;
                        }

                        System.out.print("Enter deposit amount: ");
                        account.deposit(sc.nextDouble());
                        break;

                    case 3:
                        if (account == null) {
                            System.out.println(
                                "Please create an account first."
                            );
                            break;
                        }

                        System.out.print("Enter withdrawal amount: ");
                        account.withdraw(sc.nextDouble());
                        break;

                    case 4:
                        if (account == null) {
                            System.out.println(
                                "Please create an account first."
                            );
                        } else {
                            account.checkBalance();
                        }
                        break;

                    case 5:
                        if (account == null) {
                            System.out.println(
                                "Please create an account first."
                            );
                        } else {
                            account.displayDetails();
                        }
                        break;

                    case 6:
                        System.out.println(
                            "Thank you for using our bank!"
                        );
                        break;

                    default:
                        System.out.println(
                            "Invalid choice. Please try again."
                        );
                }

            } catch (java.util.InputMismatchException e) {
                System.out.println(
                    "Invalid input! Please enter the correct data type."
                );
                sc.nextLine();
                choice = 0;

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                choice = 0;
            }

        } while (choice != 6);

        sc.close();
	}

}
