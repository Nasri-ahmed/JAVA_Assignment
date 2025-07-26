package cafe.orders;

import java.util.ArrayList;

public class Order {
	
	 // MEMBER VARIABLES
    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    // NO-ARG CONSTRUCTOR
    public Order() {
        this.name = "Guest";
        this.ready = false;
        this.items = new ArrayList<Item>();
    }

    // OVERLOADED CONSTRUCTOR
    public Order(String name) {
        this.name = name;
        this.ready = false;
        this.items = new ArrayList<Item>();
    }

    // GETTERS
    public String getName() {
        return name;
    }

    public boolean isReady() {
        return ready;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    // SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    // addItem method
    public void addItem(Item item) {
        items.add(item);
    }

    // getStatusMessage method
    public String getStatusMessage() {
        if (ready) {
            return "Your order is ready.";
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    // getOrderTotal method
    public double getOrderTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    // display method
    public void display() {
        System.out.println("Customer Name: " + name);
        for (Item item : items) {
            System.out.printf("%s - $%.2f\n", item.getName(), item.getPrice());
        }
        System.out.printf("Total: $%.2f\n", getOrderTotal());
    }

}
