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
			System.out.println(player.getPlayerName() + "의 게임 메뉴");
			System.out.println("===================");
			System.out.println("1. 현재 상태 보기");
			System.out.println("2. 결투!");
			System.out.println("9. 나가기");
			
			System.out.print("메뉴를 선택하세요 : ");
			int no = sc.nextInt();
			sc.nextLine();
			
			switch(no) {
				case 1 : gameController.displayPlayerInfo(); break;
				case 2 : choiceChickenMenu(); break;
				case 9 : System.out.println("프로그램을 종료합니다."); return;
			}			
		} while(btn == 0);
		
	}
	
	private void choiceChickenMenu() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("====================");
			System.out.println("결투할 닭을 고르세요");
			System.out.println("1. 겁쟁이 닭");
			System.out.println("2. 양아치 닭");
			System.out.println("3. 대장 닭");
			System.out.println("9. 메인메뉴로");
			System.out.print("메뉴 번호 : ");
			int no = sc.nextInt();
			sc.nextLine();
			Chicken chicken1 = new CowardChicken(100, 100,5, "겁쟁이 닭");
			Chicken chicken2 = new JerkChicken(500, 300,15, "양아치 닭");
			Chicken chicken3 = new ChiefChicken(1000,700,25, "대장 닭");
			
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
				default : System.out.println("잘못 입력 하셨습니다. 다시 입력하세요");
			}
			
			
			} while(player.isAlive());
		System.out.println("다시 시작하겠습니까?(Y/N)");
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
			System.out.println("게임을 종료합니다.");
			btn+=1;
		}
	}
}
