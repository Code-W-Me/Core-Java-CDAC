package com.Day5.model;

public interface Upgradable {
	void upgrade();
	default void UpgradableDevice() {
		System.out.println("Upgraded Device");
	}
}
