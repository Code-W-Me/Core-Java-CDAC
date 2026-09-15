package com.Day5.model;

public  class SmartTv extends Device implements Connectable, Upgradable {

	@Override
	void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("this is SmartTv");
	}

	@Override
	public void upgrade() {
		System.out.println("New Firmware Update is present Kindly upgrade.");
		
	}

	

	@Override
	public void connect() {
		System.out.println("Connected to WIFI");
		
	}

}
