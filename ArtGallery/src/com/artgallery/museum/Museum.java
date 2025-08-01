package com.artgallery.museum;

import java.util.ArrayList;
import java.util.Collections;

public class Museum {

	public static void main(String[] args) {
	   
	        Painting p1 = new Painting("Starry Night", "Vincent van Gogh", "A famous night sky painting", "Oil");
	        Painting p2 = new Painting("The Scream", "Edvard Munch", "Expressionist painting", "Tempera");
	        Painting p3 = new Painting("Water Lilies", "Claude Monet", "Impressionist masterpiece", "Watercolor");

	        Sculpture s1 = new Sculpture("David", "Michelangelo", "Renaissance marble sculpture", "Marble");
	        Sculpture s2 = new Sculpture("The Thinker", "Auguste Rodin", "Bronze sculpture", "Bronze");

	        ArrayList<Art> museum = new ArrayList<>();
	        museum.add(p1);
	        museum.add(p2);
	        museum.add(p3);
	        museum.add(s1);
	        museum.add(s2);

	        Collections.shuffle(museum);

	        for (Art art : museum) {
	            art.viewArt();
	        }
	    }

}
