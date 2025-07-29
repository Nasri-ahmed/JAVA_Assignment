package com.deviceapp;

public class DeviceTest {

	public static void main(String[] args) {
		
		Phone myPhone = new Phone();

        // 3 calls
        myPhone.makeCall();
        myPhone.makeCall();
        myPhone.makeCall();

        // 2 games
        myPhone.playGame();
        myPhone.playGame();

        // charge
        myPhone.charge();

	}

}
