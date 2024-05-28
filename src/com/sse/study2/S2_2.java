package com.sse.study2;

import java.util.Scanner;

public class S2_2 {
	public static void main(String[] args) {
//		학생 수를 입력 받아서, 학생 수만큼 이름을 입력받아서 이름을 출력하자
		Scanner sc = new Scanner(System.in);

		boolean flag = true;

		int[] bun = null;
		String[] st = null;
		int[] gook = null;
		int[] young = null;
		int[] soo = null;
		int[] totals = null;
		double[] avgs = null;

		while (flag) {
			System.out.println("메뉴를 선택하세요 1.학생정보 입력 2. 학생정보 출력 3. 학생정보 검색 4.성적순 출력 5.프로그램 종료");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:

				System.out.println("학생 수를 입력하세요");
				int a = sc.nextInt();

				bun = new int[a];
				st = new String[a];
				gook = new int[a];
				young = new int[a];
				soo = new int[a];
				totals = new int[a];
				avgs = new double[a];

				for (int i = 0; i < st.length; i++) {
					System.out.println("학생 이름을 입력하세요");
					st[i] = sc.next();
					System.out.println(st[i] + "의 국어 점수를 입력하세요");
					gook[i] = sc.nextInt();
					System.out.println(st[i] + "의 영어 점수를 입력하세요");
					young[i] = sc.nextInt();
					System.out.println(st[i] + "의 수학 점수를 입력하세요");
					soo[i] = sc.nextInt();
					bun[i] = i + 1;
					totals[i] = gook[i] + young[i] + soo[i];
					avgs[i] = totals[i] / 3.0;

				}
				break;
			case 2:
				System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
				for (int i = 0; i < st.length; i++) {
					System.out.print(st[i] + "\t");
					System.out.print(bun[i] + "\t");
					System.out.print(gook[i] + "\t");
					System.out.print(young[i] + "\t");
					System.out.print(soo[i] + "\t");
					System.out.print(totals[i] + "\t");
					System.out.print(avgs[i] + "\n");
				}
				break;
			case 3:
				System.out.println("학생 번호를 입력하세요");
				int b = sc.nextInt();
				for (int i = 0; i < bun.length; i++) {
					if (b == bun[i]) {
						System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
						System.out.print(st[i] + "\t");
						System.out.print(bun[i] + "\t");
						System.out.print(gook[i] + "\t");
						System.out.print(young[i] + "\t");
						System.out.print(soo[i] + "\t");
						System.out.print(totals[i] + "\t");
						System.out.print(avgs[i] + "\n");
					}
				}

				break;
			default:
				flag = false;
			}

		}

	}

}
