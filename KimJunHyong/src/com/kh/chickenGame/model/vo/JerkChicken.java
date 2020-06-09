package com.kh.chickenGame.model.vo;

public class JerkChicken extends Chicken {

	public JerkChicken(int hp, int exp,int attackPower, String name) {
		super(hp, exp, attackPower, name);
	}

	@Override
	public void cry() {
		System.out.println("¥Î¿Â¥‘¿Ã ∫πºˆ..«ÿ¡Ÿ≤®¥ﬂ!!!!");
	}
}