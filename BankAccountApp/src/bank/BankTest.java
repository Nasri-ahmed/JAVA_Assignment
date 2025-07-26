package bank;

public class BankTest {

	public static void main(String[] args) {
		
		 // Create 3 bank accounts
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount();
        BankAccount acc3 = new BankAccount();

        // Deposit Test
        acc1.deposit(500, "checking");
        acc1.deposit(300, "savings");
        acc1.getBalance();

        acc2.deposit(1000, "checking");
        acc2.deposit(2000, "savings");
        acc2.getBalance();

        acc3.deposit(150, "checking");
        acc3.deposit(850, "savings");
        acc3.getBalance();

        // Withdrawal Test
        acc1.withdraw(100, "checking");
        acc1.withdraw(1000, "savings"); // should print insufficient
        acc1.getBalance();

        acc2.withdraw(500, "savings");
        acc2.getBalance();

        acc3.withdraw(200, "checking"); // should print insufficient
        acc3.getBalance();

        // Static Test
        System.out.println("Total Accounts: " + BankAccount.getAccounts());
        System.out.printf("Total Money in Bank: $%.2f\n", BankAccount.getTotalMoney());

	}

}
