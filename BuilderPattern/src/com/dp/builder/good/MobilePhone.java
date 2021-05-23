package com.dp.builder.good;

public class MobilePhone {
	
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
	
	
	private MobilePhone(MobilePhoneBuilder builder) {
		this.osName = builder.osName;
		this.ram = builder.ram;
		this.color = builder.color;
		this.weight = builder.weight;
		this.maps = builder.maps;
		this.alarmTime = builder.alarmTime;
		this.bluetoothName = builder.bluetoothName;
		this.brandName = builder.brandName;		
	}
	
	
	
	public static class MobilePhoneBuilder {
		
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
		
		public MobilePhoneBuilder(String osName, int ram, String brandName, String color) {
			this.osName = osName;
			this.ram = ram;
			this.brandName = brandName;
			this.color = color;
		}
		
		public MobilePhoneBuilder setMaps(String maps) {
			this.maps = maps;
			return this;
		}
		
		public MobilePhoneBuilder setAlarmTIme(int alarmTime) {
			this.alarmTime = alarmTime;
			return this;
		}
		
		public MobilePhoneBuilder setWeight(int weight) {
			this.weight = weight;
			return this;
		}
		
		public MobilePhoneBuilder setBluetoothName(String bluetoothName) {
			this.bluetoothName = bluetoothName;
			return this;
		}
		
		public MobilePhone build() {
			return new MobilePhone(this);
		}
		
	}
	
	
	
	

}
