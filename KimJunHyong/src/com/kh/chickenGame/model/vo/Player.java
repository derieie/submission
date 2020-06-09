package com.kh.chickenGame.model.vo;

public class Player {
	private String playerName;
	private int currentExp;
	private int requiredExp;
	private int level;
	private int attackPower;
	private int playerHp;
	private boolean aliveStatus;
	
	public Player(String playerName) {
		this.playerName = playerName;
		this.currentExp = 0;
		this.level = 1;
		this.requiredExp = level * 100;
		this.attackPower = 10;
		this.playerHp = 200;
		this.aliveStatus = true;
	}

	public String getPlayerName() {
		return playerName;
	}
	
	public void setPlayerHp(int playerHp) {
		this.playerHp= playerHp;
	}
	
	public int getPlayerHp() {
		return playerHp;
	}

	public int getCurrentExp() {
		return currentExp;
	}

	public int getRequiredExp() {
		return requiredExp;
	}

	public int getLevel() {
		return level;
	}

	public int getAttackPower() {
		return attackPower;
	}
	
	public void incrementExp(int chickenExp) {
		currentExp += chickenExp;
	}
	
	public boolean isAvailableLevelUp() {
		return (currentExp - requiredExp >= 0)? true: false;
	}
	
	public boolean isAlive() {
		return aliveStatus;
	}
	
	public void levelUp() {
		System.out.println(getPlayerName()+"의 레벨이 +1 되었다!");
		level += 1;
		currentExp = currentExp - requiredExp;
		requiredExp *= 2;
		attackPower += 3;
		setPlayerHp(200);
		playerHp *= level;
	}

	public void lossHp(int amount) {
		if(playerHp >= amount) {
			this.playerHp -= amount;
			System.out.println(getPlayerName()+"의 hp가 " + amount + "만큼 감소합니다.");
		} else {
			if(playerHp != 0) {
				System.out.println(getPlayerName()+"의 hp가 " + playerHp + "만큼 감소합니다.");
			}
			
			playerHp = 0;
			aliveStatus = false;
			
			System.out.println(getPlayerName()+"의 hp가  0이 되어 죽었습니다.");
			}
	}
	
	public void cry() {
		System.out.println("나,"+getPlayerName()+"... 다시 돌아오게따..꼬꼬꼬");
		
	}

	public boolean isAliveStatus() {
		return aliveStatus;
	}

	public void setAliveStatus(boolean aliveStatus) {
		this.aliveStatus = aliveStatus;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public void setCurrentExp(int currentExp) {
		this.currentExp = currentExp;
	}

	public void setRequiredExp(int requiredExp) {
		this.requiredExp = requiredExp;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
}