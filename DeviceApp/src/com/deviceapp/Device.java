package com.deviceapp;

public class Device {
	
	  protected int battery;

	    public Device() {
	        this.battery = 100;
	    }

	    public void batteryStatus() {
	        System.out.println("Battery remaining: " + battery);
	    }

}
