package coffee.kiosk;

import java.util.ArrayList;

public class Order {
	
	  private String name;
	    private boolean ready;
	    private ArrayList<Item> items;

	    public Order() {
	        this.name = "Guest";
	        this.items = new ArrayList<>();
	    }

	    public Order(String name) {
	        this.name = name;
	        this.items = new ArrayList<>();
	    }

	    public void addItem(Item item) {
	        items.add(item);
	    }

	    public String getStatusMessage() {
	        return ready ? "Your order is ready." : "Thank you for waiting. Your order will be ready soon.";
	    }

	    public double getOrderTotal() {
	        double total = 0;
	        for (Item item : items) {
	            total += item.getPrice();
	        }
	        return total;
	    }

	    public void setReady(boolean ready) {
	        this.ready = ready;
	    }

	    public void display() {
	        System.out.println("Customer Name: " + this.name);
	        for (Item item : items) {
	            System.out.printf("%s - $%.2f\n", item.getName(), item.getPrice());
	        }
	        System.out.printf("Total: $%.2f\n", getOrderTotal());
	        System.out.println("------------------------");
	    }

}
