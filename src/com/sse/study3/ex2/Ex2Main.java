package com.sse.study3.ex2;

public class Ex2Main {

	public static void main(String[] args) {
		Study study = new Study();

		int[] ar = { 1, 2, 3, 4 };

//		매개변수에 들어있는 값을 '인자값'이라고 한다
		ar = study.remove(ar);

		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}

	}

}
