package com.sse.s1.lang.wrapper;

import java.util.Scanner;

public class Wrapper2Ex {

	public static void main(String[] args) {
//		비밀번호 길이는 최소 6글자 이상
//		대문자, 소문자, 숫자가 1개 이상 있어야함

		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		while (flag) {


			
			System.out.println("비밀번호를 입력하세요");
			String pw = sc.next();

			int count = 0;

			for (int i = 0; i < pw.length(); i++) {
				char ch = pw.charAt(i);
				if (Character.isUpperCase(ch)) {
					count++;
					continue;
				}else if(Character.isLowerCase(ch)) {
					count++;
					continue;
				}else if(Character.isDigit(ch)) {
					count++;
					continue;
				}

				}
			if(count==pw.length()) {
				System.out.println("조건에 맞다");
			}else {
				System.out.println("조건에 안 맞다");
			}
		}
	}
}
