package com.sse.s2.util.NameCardHomework;

import java.util.ArrayList;
import java.util.Scanner;

public class NameCardController {

	private NameCardService ncs;
	private NameCardView ncv;
	private ArrayList<NameCardDTO> namear;
	private Scanner sc;

	public NameCardController() {
		ncs = new NameCardService();
		ncv = new NameCardView();
		namear = ncs.init();
		sc = new Scanner(System.in);
	}

	public void start() {

		boolean flag = true;

		while (flag) {
			System.out.println("1. 기존 명함들 불러오기 2. 특정 명함 불러오기 3. 새로운 명함 추가하기 4. 명함 삭제하기 5.종료");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				ncv.allview(namear);
				System.out.println("전체 명함 정보를 불러왔습니다. 처음으로 돌아갑니다.");
				break;
			case 2:
				NameCardDTO onecard = ncs.pick(namear);
				ncv.oneview(onecard);
				break;
			case 3:
				namear = ncs.add(namear);
				System.out.println("새로운 명함 추가가 완료됐습니다. 처음으로 돌아갑니다.");
				break;
			case 4:
				 ncs.remove(namear);
				 break;
			default:
				System.out.println("프로그램을 종료합니다");
				flag = false;
			}
		}
	}

}
