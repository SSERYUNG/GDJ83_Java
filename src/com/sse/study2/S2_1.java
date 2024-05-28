package com.sse.study2;

import java.util.Scanner;

public class S2_1 {

	public static void main(String[] args) {
//		각 인덱스번호에 값을 키보드로 입력받아서 저장하기

		Scanner sc = new Scanner(System.in);
		int[] ar = new int[5];

		for (int i = 0; i < ar.length; i++) {
			System.out.println(i + 1 + "번째 값 입력");
			ar[i] = sc.nextInt();
		}

		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}

		System.out.println("배열의 크기를 입력");

		int j = sc.nextInt();
		int[] ab = new int[j];
	}

}