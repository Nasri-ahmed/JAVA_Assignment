package cafe;

import java.util.ArrayList;
import java.util.Scanner;

public class CafeUtil {
	
	public int getStreakGoal() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    // Ninja Bonus 1: parameter numWeeks
    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for (int i = 1; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        if (menuItems.size() != prices.size()) {
            return false;
        }
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%d %s -- $%.2f\n", i, menuItems.get(i), prices.get(i));
        }
        return true;
    }

    public void addCustomer(ArrayList<String> customers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String username = scanner.nextLine();
        System.out.println("Hello, " + username + "!");
        System.out.println("There are " + customers.size() + " people in front of you.");
        customers.add(username);
        System.out.println(customers);
    }

    // Ninja Bonus 4
    public void addCustomers(ArrayList<String> customers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer names (type 'q' to quit):");
        while (true) {
            String username = scanner.nextLine();
            if (username.equals("q")) break;
            customers.add(username);
            System.out.println("Hello, " + username + "!");
            System.out.println("There are now " + (customers.size() - 1) + " people in front of you.");
        }
        System.out.println("Final list: " + customers);
    }

    // Ninja Bonus 1, 2, 3: Price chart with discount and formatting
    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);
        for (int i = 1; i <= maxQuantity; i++) {
            double discount = 0.5 * (i - 1);
            double total = (price * i) - discount;
            System.out.printf("%d - $%.2f\n", i, total);
        }
    }

}
