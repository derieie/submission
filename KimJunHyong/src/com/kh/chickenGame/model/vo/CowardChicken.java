package com.kh.chickenGame.model.vo;

public class CowardChicken extends Chicken {

	public CowardChicken(int hp, int exp, int attackPower,String name) {
		super(hp, exp,attackPower, name);
	}

	@Override
	public void cry() {
		System.out.println("²¿...³­³Ê¹«¾àÇÏ²¿..");
	}
}