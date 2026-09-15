package com.Day5.model;

public class SmartPhone extends Device implements Connectable, Recahargable, Upgradable {

	@Override
	void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("this is SmartPhone");
	}

	@Override
	public void upgrade() {
		System.out.println("New Upgrade is available to download.");
		
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		System.out.println("SmartPhone connected to Charger successfully !");
	}

	@Override
	public void connect() {
		System.out.println("Smartphone connected with device successfully ..!");
		
	}

}
