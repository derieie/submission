package com.kh.chickenGame.views;

import com.kh.chickenGame.model.vo.Player;

public class PlayerInfo {
	private Player player;
	
	public PlayerInfo(Player player) {
		this.player = player;
	}

	public void displayInformation() {
		System.out.println("======================================");
		System.out.println(player.getPlayerName() + "���� ���� ����");
		System.out.println("======================================");
		System.out.println("���� : " + player.getLevel());
		System.out.println("���ݷ� : " + player.getAttackPower() + " ~ " + (player.getAttackPower()+2));
		System.out.println("ü�� : " + player.getPlayerHp());
		System.out.println("�ʿ����ġ : " + player.getRequiredExp());
		System.out.println("�������ġ : " + player.getCurrentExp());
		System.out.println("======================================");
		
	}
	
	
}
