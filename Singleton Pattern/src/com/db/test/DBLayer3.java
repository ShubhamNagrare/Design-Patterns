package com.db.test;

public class DBLayer3 {
	
	// Best Way to Implement Singleton class
	// 1. This will create single object
	// 2. It is thread safe
	// 3. Multiple object Creation NOT Possible using reflection API
	
	private static volatile DBLayer3 db;
	
	private DBLayer3() {
		if(db != null) {
			throw new RuntimeException("get your object by getDBInstance()");
		}
	}
	
	public static DBLayer3 getDBInstance() {
		
		if(db == null) {
			synchronized (DBLayer3.class) {
				if(db == null) {
					db = new DBLayer3();
				}
			}
		}
		return db;
	}

}
