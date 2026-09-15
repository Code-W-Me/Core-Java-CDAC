package com.Day5.Test;
import com.Day5.model.SmartPhone;
import com.Day5.model.SmartTv;
import com.Day5.model.SmartWatch;
public class DeviceTest {

	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.turnOn();
		phone.connect();
		phone.upgrade();
		phone.disconnect();
		System.out.println("============SmartWatch Section==========");
		SmartWatch watch = new SmartWatch();
		watch.charge();
		watch.connect();
		System.out.println("============SmartTV Section==========");

		SmartTv tv = new SmartTv();
		tv.connect();
		tv.disconnect();
		tv.upgrade();
	}

}
