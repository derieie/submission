package com.kh.chickenGame;

import java.util.Scanner;

import com.kh.chickenGame.views.GameMenu;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�÷��̾��� �̸��� �Է��� �ּ��� : ");
		String playerName = sc.nextLine()+"��";
		
		new GameMenu(playerName).mainMenu();
	}

}