package com.dp.builder;

import com.dp.builder.bad.Mobile;
import com.dp.builder.good.MobilePhone;

public class Main {

	public static void main(String[] args) {
		
		// Implementation from co.dp.builder.bad
		// Example 1
		Mobile badMobile1 = new Mobile("ios", 16, "apple", "red", "appleMaps", 7, 1, "blooooTooooth");		
		String mobileOS1 = badMobile1.getOsName();
		System.out.println(mobileOS1);
				
		/* 
		  * Even if i want to create a mobile with only required constructors i had to pass all the variables.
		  * null, even if i don't need that features.  If Class has almost 100 fields we are bound to implement
		  * constructor with 100 parameters ( optional or non required as null ) to get object of that class.
		*/
		// Example 2
		Mobile badMobile2 = new Mobile("android", 8, "samsung", "black", null, 1, 4, null);		
		String mobileOS2 = badMobile2.getOsName();
		System.out.println(mobileOS2);
		System.out.println();
		System.out.println();		
		// Loss of Readability and Unwanted code implementation happened.
		
		
		
		
		// SOLUTION FOR THIS WOULD BE BUILDER DESIGN PATTERN FOR THIS		
		// Implementation from co.dp.builder.good
		MobilePhone mobilePhone1 = new MobilePhone.MobilePhoneBuilder("linux", 256, "tesla", "neon").build();
		String mobileBrand1 = mobilePhone1.getBrandName();
		System.out.println(mobileBrand1);
		
		
		
		MobilePhone mobilePhone2 = new MobilePhone.MobilePhoneBuilder("linux", 256, "tesla", "neon").
				setBluetoothName("dogecoin bluetooth").setMaps("mars maps").setAlarmTIme(24).build();
		String bluetoothName = mobilePhone2.getBluetoothName();
		System.out.println(bluetoothName);
		
		
		// This pattern goes very handy when field in a class is very big.
		// Must to know design patterns.
		// Thanks  :)
		

	}

}
