package track;

import java.util.HashMap;
import java.util.Set;

public class TrackList {

	public static void main(String[] args) {
		
		 HashMap<String, String> trackList = new HashMap<String, String>();

	        trackList.put("Uprising", "They will not force us...");
	        trackList.put("Starlight", "Hold you in my arms...");
	        trackList.put("Time is Running Out", "I think I'm drowning...");
	        trackList.put("Hysteria", "Cause I want it now...");

	        String selectedTrack = "Starlight";
	        String lyrics = trackList.get(selectedTrack);
	        System.out.println("Lyrics of \"" + selectedTrack + "\": " + lyrics);

	        System.out.println("\nAll Tracks and Lyrics:");
	        Set<String> tracks = trackList.keySet();
	        for (String track : tracks) {
	            System.out.println(track + ": " + trackList.get(track));
	        }

	}

}
