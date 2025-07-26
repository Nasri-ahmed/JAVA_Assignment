package coffee.kiosk;

public class TestCoffeeKiosk {

	public static void main(String[] args) {

		 CoffeeKiosk kiosk = new CoffeeKiosk();

	        kiosk.addMenuItem("Drip Coffee", 2.50);
	        kiosk.addMenuItem("Cappuccino", 3.50);
	        kiosk.addMenuItem("Latte", 4.00);
	        kiosk.addMenuItem("Mocha", 4.25);
	        kiosk.addMenuItem("Muffin", 3.75);

	        kiosk.displayMenu();

	        kiosk.newOrder();

	       

	}

}
