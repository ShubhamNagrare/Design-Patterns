package com.db.test;

public class DBLayer2 {
	
	// Using Singleton pattern
	// 1. This will create single object
	// 2. It is not thread safe
	// 3. Multiple object Creation Possible using reflection API
	
	private static volatile DBLayer2 db = new DBLayer2();
	
	private DBLayer2() {
		
	}
	
	public static DBLayer2 getDBInstance() {
		return db;
	}
	

}
