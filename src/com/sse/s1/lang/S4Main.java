package com.sse.s1.lang;

import java.util.Scanner;

public class S4Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "computer science";

		String result = name.substring(3);
		result = name.substring(3, 5);

//		System.out.println(result);

		System.out.println("파일명을 입력하세요 확장자 포함");
		name = sc.next();

		int start = name.lastIndexOf(".");
		String hwak = name.substring(start + 1);

		if (hwak.equals("jpg") || hwak.equals("png") || hwak.equals("gif") || hwak.equals("jpeg")
				|| hwak.equals("jiff")) {
			System.out.println(hwak + "는 이미지파일입니다");
		} else {
			System.out.println(hwak + "는 이미지파일이 아닙니다");
		}

	}

}
