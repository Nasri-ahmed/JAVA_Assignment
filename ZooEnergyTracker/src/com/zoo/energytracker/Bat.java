package com.zoo.energytracker;

public class Bat extends Mammal {
     
	public Bat() {
        this.energy = 300;
    }

    public void fly() {
        energy -= 50;
        System.out.println("The bat is airborne.");
    }

    public void eatHumans() {
        energy += 25;
        System.out.println("The bat has eaten a human and feels satisfied.");
    }

    public void attackTown() {
        energy -= 100;
        System.out.println("The bat attacks the town!");
    }
}
