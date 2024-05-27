package com.sse.study1;

import java.util.Scanner;

public class Study4 {

	public static void main(String [] args) {
//		키보드와 연결 준비, 한번만 작성하면 됨
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		int result = num*1;
		System.out.println(num);
		System.out.println(result);
		
		
		System.out.println("프로그램을 종료합니다");
	}
}
