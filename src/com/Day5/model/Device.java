package com.Day5.model;

public abstract class Device {
	String name;
	String brand;
	void turnOff() {
		System.out.println("Device is Off");
	}
	public void turnOn() {
		System.out.println("Device is On");
	}
	abstract void displayInfo();
}
