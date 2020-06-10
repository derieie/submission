package com.kh.chickenGame.model.vo;

public class JerkChicken extends Chicken {

	public JerkChicken(int hp, int exp,int attackPower, String name) {
		super(hp, exp, attackPower, name);
	}

	@Override
	public void cry() {
		System.out.println("꼬꼬..대장님이 복수해주꼬!!!!!");
	}
}
