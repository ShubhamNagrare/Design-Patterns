package com.dp.di.DependencyInjectionInSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionInSpringBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInjectionInSpringBootApplication.class, args);
	
		// Tightly Coupled
		// Object Creating Using New Keyword
		System.out.println();
		System.out.println();
		System.out.println("----- Using New Keyword -----");
		Players player = new Players();
		player.setPlayerName("Ronaldo");
		player.setRanking(1);
		player.getInfo();
		
		
		// Loosely Coupled
		// Object Creation using Dependency Injection
		System.out.println();
		System.out.println();
		System.out.println("------ Using Dependency Injection -----");
		Players playerObj = context.getBean(Players.class);
		playerObj.setPlayerName("Elon Musk");
		playerObj.setRanking(0);
		playerObj.getInfo();
		
		
	}

}
