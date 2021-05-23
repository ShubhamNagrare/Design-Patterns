package com.dp.di.DependencyInjectionInSpringBoot;

import org.springframework.stereotype.Component;

@Component
public class Players {
	
	private int playerID;
	
	private String playerName;
	
	private int ranking;

	public int getPlayerID() {
		return playerID;
	}

	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	
	
	public void getInfo() {
		System.out.println("Player : " + this.playerName + " has worldwide : " + this.ranking + " ranking");
	}

}
