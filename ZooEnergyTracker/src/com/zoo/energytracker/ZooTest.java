package com.zoo.energytracker;

public class ZooTest {

	public static void main(String[] args) {
	
		Gorilla gorilla = new Gorilla();

        // Gorilla actions
        gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.throwSomething();

        gorilla.eatBananas();
        gorilla.eatBananas();

        gorilla.climb();

        gorilla.displayEnergy();

        System.out.println("------");

        Bat bat = new Bat();

        // Bat actions
        bat.attackTown();
        bat.attackTown();
        bat.attackTown();

        bat.eatHumans();
        bat.eatHumans();

        bat.fly();
        bat.fly();

        bat.displayEnergy();

	}

}
