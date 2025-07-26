package coffee.kiosk;

import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeKiosk {
	
	 private ArrayList<Item> menu;
	    private ArrayList<Order> orders;
	    private Scanner scanner;

	    public CoffeeKiosk() {
	        this.menu = new ArrayList<>();
	        this.orders = new ArrayList<>();
	        this.scanner = new Scanner(System.in);
	    }

	    public void addMenuItem(String name, double price) {
	        Item newItem = new Item(name, price, menu.size());
	        menu.add(newItem);
	    }

	    public void displayMenu() {
	        for (Item item : menu) {
	            System.out.printf("%d %s -- $%.2f\n", item.getIndex(), item.getName(), item.getPrice());
	        }
	    }

	    public void newOrder() {
	        System.out.println("Please enter customer name for new order:");
	        String name = scanner.nextLine();
	        Order newOrder = new Order(name);

	        displayMenu();

	        System.out.println("Please enter a menu item index or q to quit:");
	        String input = scanner.nextLine();

	        while (!input.equals("q")) {
	            try {
	                int itemIndex = Integer.parseInt(input);
	                if (itemIndex >= 0 && itemIndex < menu.size()) {
	                    Item item = menu.get(itemIndex);
	                    newOrder.addItem(item);
	                    System.out.println(item.getName() + " added.");
	                } else {
	                    System.out.println("Invalid index.");
	                }
	            } catch (NumberFormatException e) {
	                System.out.println("Please enter a valid number or 'q' to quit.");
	            }
	            System.out.println("Enter another item index or q to quit:");
	            input = scanner.nextLine();
	        }

	        newOrder.display();
	        orders.add(newOrder);
	    }

	  
	    public void addMenuItemByInput() {
	        System.out.println("Enter item name:");
	        String name = scanner.nextLine();
	        System.out.println("Enter item price:");
	        double price = Double.parseDouble(scanner.nextLine());
	        addMenuItem(name, price);
	        System.out.println("Item added to menu.");
	    }

	    public static void main(String[] args) {
	        CoffeeKiosk kiosk = new CoffeeKiosk();

	   
	        kiosk.addMenuItem("Banana", 2.00);
	        kiosk.addMenuItem("Coffee", 1.50);
	        kiosk.addMenuItem("Latte", 4.50);
	        kiosk.addMenuItem("Cappuccino", 3.00);
	        kiosk.addMenuItem("Muffin", 4.00);

	        kiosk.newOrder(); // run once for now
	    }

}
