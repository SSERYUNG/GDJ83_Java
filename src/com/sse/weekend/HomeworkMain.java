package com.sse.weekend;

import java.util.Scanner;

public class HomeworkMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int num = 0;
		int[] ar = null;

		StackStudy stack = new StackStudy();
		QueStudy que = new QueStudy();

		while (flag) {

			System.out.println("1.배열 만들기 2.스택추가 3.스택삭제 4.큐추가 5.큐삭제 6.프로그램 종료");
			int choose = sc.nextInt();

			switch (choose) {
			case 1:
				System.out.println("배열의 길이를 입력하시오");
				num = sc.nextInt();
				ar = new int[num];

				for (int i = 0; i < ar.length; i++) {
					ar[i] = i;
				}
				break;
			case 2:

				ar = stack.add(ar);
				for (int i = 0; i < ar.length; i++) {
					System.out.println(ar[i]);
				}
				break;
			case 3:
				ar = stack.remove(ar);
				for (int i = 0; i < ar.length; i++) {
					System.out.println(ar[i]);
				}
				break;
			case 4:
				ar = que.add(ar);
				for (int i = 0; i < ar.length; i++) {
					System.out.println(ar[i]);
				}
				break;
			case 5:
				ar = que.remove(ar);
				for (int i = 0; i < ar.length; i++) {
					System.out.println(ar[i]);

				}
				break;

			case 6:
				flag = false;
				break;
			default:
				System.out.println("메뉴 선택이 잘못 됐습니다. 다시 선택하시오");
				break;
			}
		}
	}
}