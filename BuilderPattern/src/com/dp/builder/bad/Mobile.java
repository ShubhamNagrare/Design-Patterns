package com.dp.builder.bad;

public class Mobile {
	
	//required parameters
	private String osName;
	private int ram;
	private String brandName;
	private String color;
	
	//optional parameters
	private String maps;
	private int alarmTime;
	private int weight;
	private String bluetoothName;
	
	public Mobile(String osName, int ram, String brandName, String color, String maps, 
			int alarmTIme, int weight, String bluetoothName){
		
		this.osName = osName;
		this.ram = ram;
		this.brandName = brandName;
		this.color = color;
		this.maps = maps;
		this.alarmTime = alarmTIme;
		this.weight = weight;
		this.bluetoothName = bluetoothName;		
	}

	public String getOsName() {
		return osName;
	}

	public int getRam() {
		return ram;
	}

	public String getBrandName() {
		return brandName;
	}

	public String getColor() {
		return color;
	}

	public String getMaps() {
		return maps;
	}

	public int getAlarmTime() {
		return alarmTime;
	}

	public int getWeight() {
		return weight;
	}

	public String getBluetoothName() {
		return bluetoothName;
	}
	


}
