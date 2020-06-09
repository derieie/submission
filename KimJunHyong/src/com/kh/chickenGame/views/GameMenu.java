package com.kh.chickenGame.views;

import java.util.Scanner;

import com.kh.chickenGame.controller.GameController;
import com.kh.chickenGame.model.vo.Chicken;
import com.kh.chickenGame.model.vo.CowardChicken;
import com.kh.chickenGame.model.vo.JerkChicken;
import com.kh.chickenGame.model.vo.Player;
import com.kh.chickenGame.model.vo.ChiefChicken;

public class GameMenu {
	private Player player;
	private GameController gameController;
	static int btn = 0;
	public GameMenu(String playerName) {
		this.player = new Player(playerName);
		this.gameController = new GameController(player);
	}
	
	public void mainMenu() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(player.getPlayerName() + "�� ���� �޴�");
			System.out.println("===================");
			System.out.println("1. ���� ���� ����");
			System.out.println("2. ����!");
			System.out.println("9. ������");
			
			System.out.print("�޴��� �����ϼ��� : ");
			int no = sc.nextInt();
			sc.nextLine();
			
			switch(no) {
				case 1 : gameController.displayPlayerInfo(); break;
				case 2 : choiceChickenMenu(); break;
				case 9 : System.out.println("���α׷��� �����մϴ�."); return;
			}			
		} while(btn == 0);
		
	}
	
	private void choiceChickenMenu() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("====================");
			System.out.println("������ ���� ������");
			System.out.println("1. ������ ��");
			System.out.println("2. ���ġ ��");
			System.out.println("3. ���� ��");
			System.out.println("9. ���θ޴���");
			System.out.print("�޴� ��ȣ : ");
			int no = sc.nextInt();
			sc.nextLine();
			Chicken chicken1 = new CowardChicken(100, 100,5, "������ ��");
			Chicken chicken2 = new JerkChicken(500, 300,15, "���ġ ��");
			Chicken chicken3 = new ChiefChicken(1000,700,25, "���� ��");
			
			switch(no) {
				case 1 : if(chicken2 != null) {
					if (chicken2.getHp()>0) {gameController.playerattack(chicken1);
					}}break;
				case 2 : if(chicken2 != null) {
					if (chicken2.getHp()>0) {
					gameController.playerattack(chicken2);
					}}break;
				case 3 : if(chicken3 != null) {
					if (chicken3.getHp()>0) {
					gameController.playerattack(chicken3);
					}}break;
				case 9 : return;
				default : System.out.println("�߸� �Է� �ϼ̽��ϴ�. �ٽ� �Է��ϼ���");
			}
			
			
			} while(player.isAlive());
		System.out.println("�ٽ� �����ϰڽ��ϱ�?(Y/N)");
		String ans = sc.nextLine();
		char checkans = ans.charAt(0);
		if (checkans == 'y' || checkans == 'Y') {
			player.setPlayerHp(200); 
			player.setLevel(1);
			player.setCurrentExp(0);
			player.setAttackPower(10);
			player.setRequiredExp(player.getLevel()*100);
			player.setAliveStatus(true);
		}
		if (checkans == 'n'|| checkans == 'N') {
			System.out.println("������ �����մϴ�.");
			btn+=1;
		}
	}
}
