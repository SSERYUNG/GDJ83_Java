package com.sse.study1;

import java.util.Scanner;

public class Study5 {

	public static void main(String [] args) {
		int num = 1;
		long num2 = 1L;
		
		System.out.println(num==num2);
		
		String name = "winter";
		String name2 = "winter";
		System.out.println(name==name2);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name3 = sc.next();
		System.out.println(name==name3);
		
	}
	
}
