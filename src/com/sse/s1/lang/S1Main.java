package com.sse.s1.lang;

import java.util.Scanner;

public class S1Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Object obj = new Object();
		Object obj2 = new Object();

//		n이나 n2나 객체를 선언한 것이다
		String n = new String("hamin");
		String n2 = "hamin";

		System.out.println(n);

		char ch = n.charAt(1);
		System.out.println(ch);
		int a = n.length();
		System.out.println(a);

		System.out.println("문자열 입력");
		n = sc.next();
		for (int i = 0; i < n.length(); i++) {
			System.out.println(n.charAt(i));
		}

		int price = n.length() * 1000;
		System.out.println(price + "원입니다");

	}

}
