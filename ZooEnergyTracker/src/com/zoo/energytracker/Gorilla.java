package com.zoo.energytracker;

public class Gorilla extends Mammal {
	
	 public void throwSomething() {
	        energy -= 5;
	        System.out.println("The gorilla has thrown something.");
	    }

	    public void eatBananas() {
	        energy += 10;
	        System.out.println("The gorilla eats bananas and feels satisfied.");
	    }

	    public void climb() {
	        energy -= 10;
	        System.out.println("The gorilla climbed a tree.");
	    }

}
