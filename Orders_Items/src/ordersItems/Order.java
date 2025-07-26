package ordersItems;

import java.util.ArrayList;

public class Order {
	
	 String name;
      double total;
	  boolean ready;
	  ArrayList<Item> items;
	  
	  public Order(String name) {
	        this.name = name;
	        this.total = 0;
	        this.ready = false;
	        this.items = new ArrayList<>();
	    }

	    public void addItem(Item item) {
	        items.add(item);
	        total += item.price;
	    }

	    public void addItem(Item item, int quantity) {
	        for (int i = 0; i < quantity; i++) {
	            addItem(item);
	        }
	    }

}
