package com.kh.chickenGame.model.vo;

public class ChiefChicken extends Chicken {

	public ChiefChicken(int hp, int exp,int attackPower, String name) {
		super(hp, exp,attackPower, name);
	}

	@Override
	public void cry() {
		System.out.println("���� ���ٴ�������!!!!!! ����.....");
	}
}