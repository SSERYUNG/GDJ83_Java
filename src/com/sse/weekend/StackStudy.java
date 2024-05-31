package com.sse.weekend;

import java.util.Scanner;

public class StackStudy {

	Scanner sc = new Scanner(System.in);

	public int[] add(int[] ar) {

		System.out.println("추가할 숫자를 입력하시오");
		int num = sc.nextInt();

		int[] addar = new int[ar.length + 1];

		addar[0] = num;
		for (int i = 1; i < addar.length; i++) {
			addar[i] = ar[i - 1];

		}
		return addar;
	}

	public int[] remove(int[] ar) {
		int[] removear = new int[ar.length - 1];
		for (int i = 0; i < removear.length; i++) {
			removear[i] = ar[i + 1];
		}
		return removear;
	}
}
