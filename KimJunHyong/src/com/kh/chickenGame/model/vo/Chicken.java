package com.kh.chickenGame.model.vo;

public abstract class Chicken {
	private int hp;
	private int exp;
	private String name;
	private boolean aliveStatus;
	private int attackPower;
	
	protected Chicken(int hp, int exp , int attackPower, String name) {
		this.hp = hp;
		this.exp = exp;
		this.name = name;
		this.aliveStatus = true;
		this.attackPower = attackPower;
	}
	
	public String getName() {
		return name;
	}

	public int getAttackPower() {
		return attackPower;
	}

	public int getHp() {
		return hp;
	}

	public int getExp() {
		return exp;
	}
	
	public boolean isAlive() {
		return aliveStatus;
	}

	public void lossHp(int amount) {
		if(hp >= amount) {
			this.hp -= amount;
			System.out.println(getName()+"의 hp가 " + amount + "만큼 감소합니다.");
		} else {
			if(hp != 0) {
				System.out.println(getName()+"의 hp가 " + hp + "만큼 감소합니다.");
			}
			
			hp = 0;
			aliveStatus = false;
			
			System.out.println(getName()+"의 hp가  0이 되어 죽었습니다.");
		}
	}
	
	public abstract void cry();
	
}
