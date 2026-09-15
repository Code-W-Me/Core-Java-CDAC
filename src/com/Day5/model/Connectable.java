package com.Day5.model;

public interface Connectable  {
	void connect();
	default void disconnect() {
		System.out.println("Device Connected");
	}
}
