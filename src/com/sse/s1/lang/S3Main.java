package com.sse.s1.lang;

import java.util.Scanner;

public class S3Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name = "ppabcdp";
		System.out.println(name.charAt(3));
		boolean flag = true;
		int result = 0;

		while (flag) {

			result = name.indexOf("p", result);
			if (result == -1) {
				break;
			} else {
				System.out.println(result);
				result++;
			}
		}

		System.out.println("프로그램 종료");
	}
}
