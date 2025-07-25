package cafejava;

public class Cafe {

	public static void main(String[] args) {
	
		        // APP VARIABLES
		        String generalGreeting = "Welcome to Cafe Java, ";
		        String pendingMessage = ", your order will be ready shortly";
		        String readyMessage = ", your order is ready";
		        String displayTotalMessage = "Your total is $";

		        // Menu variables
		        double mochaPrice = 3.5;
		        double dripCoffeePrice = 2.0;
		        double lattePrice = 4.5;
		        double cappuccinoPrice = 3.0;

		        // Customer name variables
		        String customer1 = "Cindhuri";
		        String customer2 = "Sam";
		        String customer3 = "Jimmy";
		        String customer4 = "Noah";

		        // Order completions
		        boolean isReadyOrder1 = false;  
		        boolean isReadyOrder2 = true;   
		        boolean isReadyOrder3 = false;  
		        boolean isReadyOrder4 = true;   

		        // --- INTERACTIONS ---

		        // Cindhuri ordered a coffee
		        System.out.println(generalGreeting + customer1);
		        if (isReadyOrder1) {
		            System.out.println(customer1 + readyMessage);
		        } else {
		            System.out.println(customer1 + pendingMessage);
		        }

		        // Noah ordered a cappuccino
		        System.out.println(generalGreeting + customer4);
		        if (isReadyOrder4) {
		            System.out.println(customer4 + readyMessage);
		            System.out.println(displayTotalMessage + cappuccinoPrice);
		        } else {
		            System.out.println(customer4 + pendingMessage);
		        }

		        // Sam ordered 2 lattes
		        System.out.println(generalGreeting + customer2);
		        double samTotal = lattePrice * 2;
		        System.out.println(displayTotalMessage + samTotal);
		        if (isReadyOrder2) {
		            System.out.println(customer2 + readyMessage);
		        } else {
		            System.out.println(customer2 + pendingMessage);
		        }

		        // Jimmy was charged for a drip coffee but ordered a latte
		        double jimmyDifference = lattePrice - dripCoffeePrice;
		        System.out.println(generalGreeting + customer3);
		        System.out.println(displayTotalMessage + jimmyDifference);
		    }
	


	}


