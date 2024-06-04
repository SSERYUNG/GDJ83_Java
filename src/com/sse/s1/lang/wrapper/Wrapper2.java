package com.sse.s1.lang.wrapper;

import java.util.Scanner;

public class Wrapper2 {

	public static void main(String[] args) {
//		비밀번호 길이는 최소 6글자 이상
//		대문자, 소문자, 숫자가 1개 이상 있어야함

		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		while (flag) {

			boolean pass1 = true;
			boolean pass2 = true;
			boolean pass3 = true;

			System.out.println("비밀번호를 입력하세요");
			String pw = sc.next();

//			대문자 검열

			for (int i = 0; i < pw.length(); i++) {
				char ch = pw.charAt(i);
				if (Character.isUpperCase(ch)) {
					pass1 = true;
					break;
				} else {
					pass1 = false;

				}
			}

//			소문자 검열

			for (int i = 0; i < pw.length(); i++) {
				char ch = pw.charAt(i);
				if (Character.isLowerCase(ch)) {
					pass2 = true;
					break;
				} else {
					pass2 = false;

				}
			}

//			숫자 검열

			for (int i = 0; i < pw.length(); i++) {
				char ch = pw.charAt(i);
				if (Character.isDigit(ch)) {
					pass3 = true;
					break;
				} else {
					pass3 = false;

				}
			}

//			길이 검열,특수문자 검열...?

			boolean finale = true;
			if (pass1 && pass2 && pass3) {
				finale = true;
			} else {
				finale = false;
			}

			if (finale) {
				if (pw.length() >= 6) {
					System.out.println("적합한 비밀번호입니다 프로그램을 종료합니다");
					flag = false;
				} else {
					System.out.println("적합하지 않은 비밀번호입니다 처음으로 돌아갑니다");
				}
			} else {
				System.out.println("적합하지 않은 비밀번호입니다 처음으로 돌아갑니다");
			}

		}

	}

}
