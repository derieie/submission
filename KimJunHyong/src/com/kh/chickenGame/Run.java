package com.kh.chickenGame;

import java.util.Scanner;

import com.kh.chickenGame.views.GameMenu;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("플레이어의 이름을 입력해 주세요 : ");
		String playerName = sc.nextLine()+"닭";
		
		new GameMenu(playerName).mainMenu();
	}

}