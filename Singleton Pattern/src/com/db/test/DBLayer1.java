package com.db.test;

public class DBLayer1 {
	
	// This way of creating db objects is :
	// 1. Not thread safe
	// 2. Create Muliple objects
	// 3. Can create db objects using reflection api
	
	// Conclusion : BAD WAY TO IMPLEMENT DB CLASS
	public DBLayer1() {
		//db = new DBLayer1();
	}
	
	public DBLayer1 getDBInstance(){
		return new DBLayer1();
	}

}
