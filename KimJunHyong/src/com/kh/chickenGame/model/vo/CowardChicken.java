package com.kh.chickenGame.model.vo;

public class CowardChicken extends Chicken {

	public CowardChicken(int hp, int exp, int attackPower,String name) {
		super(hp, exp,attackPower, name);
	}

	@Override
	public void cry() {
		System.out.println("꼬..난너무약하꼬....");
	}
}
