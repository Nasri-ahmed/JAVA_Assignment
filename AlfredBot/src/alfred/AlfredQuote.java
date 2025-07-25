package alfred;

import java.util.Date;

public class AlfredQuote {
	
	public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }

 
    public String guestGreeting(String name) {
        return String.format("Hello, %s. Lovely to see you.", name);
    }

    public String dateAnnouncement() {
        Date now = new Date();
        return "It is currently " + now;
    }

    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") != -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (conversation.indexOf("Alfred") != -1) {
            return "At your service. As you wish, naturally.";
        } else {
            return "Right. And with that I shall retire.";
        }
    }

    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
    }

    public String angryResponse(String reason) {
        return "I AM NOT PLEASED WITH " + reason.toUpperCase() + "!!!";
    }

}
