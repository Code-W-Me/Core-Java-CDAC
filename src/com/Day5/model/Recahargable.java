package com.Day5.model;

public interface Recahargable {
	void charge();
	default void showChargeDevice() {
		System.out.println("Charging Device");
	}
		
	}

