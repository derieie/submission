package com.kh.chickenGame.views;

import com.kh.chickenGame.model.vo.Player;

public class PlayerInfo {
	private Player player;
	
	public PlayerInfo(Player player) {
		this.player = player;
	}

	public void displayInformation() {
		System.out.println("======================================");
		System.out.println(player.getPlayerName() + "님의 현재 정보");
		System.out.println("======================================");
		System.out.println("레벨 : " + player.getLevel());
		System.out.println("공격력 : " + player.getAttackPower() + " ~ " + (player.getAttackPower()+2));
		System.out.println("체력 : " + player.getPlayerHp());
		System.out.println("필요경험치 : " + player.getRequiredExp());
		System.out.println("현재경험치 : " + player.getCurrentExp());
		System.out.println("======================================");
		
	}
	
	
}
