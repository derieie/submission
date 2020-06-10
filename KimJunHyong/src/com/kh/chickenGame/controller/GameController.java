package com.kh.chickenGame.controller;

import com.kh.chickenGame.model.vo.Chicken;
import com.kh.chickenGame.model.vo.Player;
import com.kh.chickenGame.views.PlayerInfo;

public class GameController {
	private Player player;
	
	public GameController(Player player) {
		this.player = player;
	}

	public void displayPlayerInfo() {
		new PlayerInfo(player).displayInformation();
	}

	public void playerattack(Chicken chicken) {
		do {
			chicken.lossHp(player.getAttackPower()+(int)(Math.random()*3));
			if(chicken.getHp()>0) {
			System.out.println(chicken.getName()+ "의 hp: " + chicken.getHp());
			}
			player.lossHp(chicken.getAttackPower()+(int)(Math.random()*2));
			if(player.getPlayerHp()>0) {
			System.out.println(player.getPlayerName()+ "의 hp: " + player.getPlayerHp());
			}
			checkAlive(chicken);
			checkAlive(player);
			checkPlayerLevelUp();
		}while(chicken.isAlive()&&player.isAlive());
	}
	
	private void checkAlive(Chicken chicken) {
		if(!chicken.isAlive()) {
			chicken.cry();
			incrementPlayerExp(chicken.getExp());
		}
	}
	
	private void checkAlive(Player player) {
		if(!player.isAlive()) {
			player.cry();
		}
	}
	
	private void incrementPlayerExp(int chickenExp) {
		player.incrementExp(chickenExp);
	}
	
	private void checkPlayerLevelUp() {
		while(player.isAvailableLevelUp()) {
			player.levelUp();
		}
	}
}
