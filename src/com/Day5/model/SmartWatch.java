package com.Day5.model;

public class SmartWatch extends Device implements Connectable, Recahargable{

	@Override
	void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("this is SmartPhone");
	}

	

	@Override
	public void charge() {
		System.out.println("Pulged  to charger the device ");
		
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connected to smartphone succefully");
	}

}
