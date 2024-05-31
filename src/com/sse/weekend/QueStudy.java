package com.sse.weekend;

import java.util.Scanner;

public class QueStudy {

	Scanner sc = new Scanner(System.in);

	public int[] add(int[] ar) {

		System.out.println("추가할 숫자를 입력하시오");
		int num = sc.nextInt();

		int[] addar = new int[ar.length + 1];

		addar[ar.length] = num;
		for (int i = 0; i < ar.length; i++) {
			addar[i] = ar[i];

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
