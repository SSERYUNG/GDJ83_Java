package com.sse.study1;

import java.util.Scanner;

public class Study9 {

	public static void main(String[] args) {
//		로그인 검증
//		id=1234, pw=5678
//		
//		로그인 시도 전에 1.로그인, 2.종료
//		사용자의 id와 pw를 입력 받아서 로그인을 n번 시도
//		성공하면 성공을 출력하고 반복문 종료, 실패하면 실패 출력
//		로그인을 성공 후 반복문이 종료 됐다면, 게임을 시작
//		
//		게임은 MMORPG
//		1레벨~15레벨(만렙)
//		GOLD : 0으로 시작
//		
//		레벨업에 필요한 몬스터수
//		1->2 : 3마리
//		2->3 : 6마리
//		3->4 : 9마리
//		....
//		
//		5레벨 달성시 1000골드 지급
//		10레벨 달성시 2000골드 지급
//		15레벨 달성시 3000골드 지급
//		
//		15레벨 달성하면 현재 레벨과 현재 골드를 출력하고 프로그램 종료

		Scanner sc = new Scanner(System.in);

		int login;
		boolean flag = true;

		while (flag) {
			System.out.println("1.로그인, 2.종료");
			login = sc.nextInt();
			if (login == 1) {
				System.out.println("ID를 입력하세요");
				int id = sc.nextInt();
				System.out.println("PW를 입력하세요");
				int pw = sc.nextInt();
				if (id == 1234 && pw == 5678) {
					System.out.println("로그인 성공");
					break;
				} else {
					System.out.println("로그인 실패");
				}
			} else {
				flag = false;
			}
		}

		if (flag) {
			int i = 1;
			int gold = 0;
			System.out.println("게임을 시작합니다");
			for (i = 1; i < 15; i++) {
				if (i % 5 == 0) {
					System.out.println(i + "레벨입니다");
					System.out.println(i * 200 + "골드 획득했습니다");
					gold = gold + (i * 200);
				} else {
					System.out.println(i + "레벨입니다");
				}
				for (int m = 1; m <= i * 3; m++) {

					System.out.println(m + "마리 잡았습니다");

				}

			}
			System.out.println(i + "레벨입니다");
			System.out.println("3000골드 획득했습니다");
			System.out.println("총 획득 골드는 " + (gold + 3000) + "골드입니다");
		}
		System.out.println("프로그램을 종료합니다");

	}
}
