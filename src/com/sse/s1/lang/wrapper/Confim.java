package com.sse.s1.lang.wrapper;

import java.util.Scanner;

public class Confim {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("비밀번호를 입력하세요");
		String pw = sc.next();

		boolean pass1 = true;

		for (int i = 0; i < pw.length(); i++) {
			char ch = pw.charAt(i);
			if (Character.isDigit(ch)) {
				pass1 = true;
				break;
			} else {
				pass1 = false;

			}
		}

		System.out.println(pass1);

	}

}
