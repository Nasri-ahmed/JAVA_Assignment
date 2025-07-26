package cafe.orders;

public class TestOrders {

	public static void main(String[] args) {
		
		 // Create Items
        Item item1 = new Item("mocha", 3.5);
        Item item2 = new Item("latte", 4.0);
        Item item3 = new Item("drip coffee", 2.0);
        Item item4 = new Item("cappuccino", 4.5);

        // Create Orders (2 guests with default name)
        Order order1 = new Order();
        Order order2 = new Order();

        // Create Orders with names
        Order order3 = new Order("Cindhuri");
        Order order4 = new Order("Jimmy");
        Order order5 = new Order("Noah");

        // Add items to orders
        order1.addItem(item3);
        order1.addItem(item1);

        order2.addItem(item2);
        order2.addItem(item4);

        order3.addItem(item3);
        order3.addItem(item4);

        order4.addItem(item2);
        order4.addItem(item2);

        order5.addItem(item4);

        // Set some orders ready
        order3.setReady(true);
        order4.setReady(true);

        // Test getStatusMessage
        System.out.println(order1.getStatusMessage());
        System.out.println(order3.getStatusMessage());
        System.out.println(order4.getStatusMessage());

        // Test getOrderTotal
        System.out.println("Order1 total: $" + order1.getOrderTotal());
        System.out.println("Order4 total: $" + order4.getOrderTotal());

        // Display all orders
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
    }
}
