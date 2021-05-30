package com.db.test;
import java.lang.reflect.*;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Testing DIfferent DB Object creating approach");
		System.out.println();
		
		// 1
		System.out.println("This method will create Multiple DB Objects, Non Thread safe,  Can creat Object using reflection API");
		DBLayer1 layer1 = new DBLayer1().getDBInstance();
		System.out.println(layer1);
		
		DBLayer1 layer2 = new DBLayer1().getDBInstance();
		System.out.println(layer2);
		System.out.println();
		System.out.println();
		
		
		// 2
		System.out.println("This method will create Sigle Object, Non Thread Safe, Can creat Object using reflection API");
		DBLayer2 layer3 = DBLayer2.getDBInstance();
		System.out.println(layer3);
		
		DBLayer2 layer4 = DBLayer2.getDBInstance();
		System.out.println(layer4);
		System.out.println();
		System.out.println();
		
		
		// 3
		System.out.println("BEST METHOD : This method will create Sigle Object, Thread Safe, Cannot Create Object using reflection API");
		DBLayer3 layer5 = DBLayer3.getDBInstance();
		System.out.println(layer5);
		
		DBLayer3 layer6 = DBLayer3.getDBInstance();
		System.out.println(layer6);
		System.out.println();
		System.out.println();
		

	}

}
