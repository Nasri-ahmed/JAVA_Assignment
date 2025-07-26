package bank;

import java.util.Random;

public class BankAccount {
	 // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;
    private String accountNumber;

    private static int accounts = 0;
    private static double totalMoney = 0.0;

    // CONSTRUCTOR
    public BankAccount() {
        this.checkingBalance = 0.0;
        this.savingsBalance = 0.0;
        this.accountNumber = generateAccountNumber();
        accounts++;
    }

    // PRIVATE METHOD - Bonus: Generate a random 10-digit number
    private String generateAccountNumber() {
        Random rand = new Random();
        StringBuilder number = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            number.append(rand.nextInt(10)); // appends 0-9
        }
        return number.toString();
    }

    // GETTERS
    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static int getAccounts() {
        return accounts;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    // METHODS

    public void deposit(double amount, String accountType) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }

        if (accountType.equalsIgnoreCase("checking")) {
            this.checkingBalance += amount;
        } else if (accountType.equalsIgnoreCase("savings")) {
            this.savingsBalance += amount;
        } else {
            System.out.println("Invalid account type. Use 'checking' or 'savings'.");
            return;
        }
        totalMoney += amount;
    }

    public void withdraw(double amount, String accountType) {
        if (amount <= 0) {
            System.out.println("Withdraw amount must be positive.");
            return;
        }

        if (accountType.equalsIgnoreCase("checking")) {
            if (this.checkingBalance >= amount) {
                this.checkingBalance -= amount;
                totalMoney -= amount;
            } else {
                System.out.println("Insufficient funds in checking account.");
            }
        } else if (accountType.equalsIgnoreCase("savings")) {
            if (this.savingsBalance >= amount) {
                this.savingsBalance -= amount;
                totalMoney -= amount;
            } else {
                System.out.println("Insufficient funds in savings account.");
            }
        } else {
            System.out.println("Invalid account type. Use 'checking' or 'savings'.");
        }
    }

    public void getBalance() {
        System.out.printf("Account %s - Checking: $%.2f, Savings: $%.2f\n",
                this.accountNumber, this.checkingBalance, this.savingsBalance);
    }

}
