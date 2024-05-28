package com.sse.study2;

public class S2 {

	public static void main(String[] args) {
//		변수명 ar은 main 함수{} 안에 선언된 지역변수(스택 영역에 저장됨)
		int[] ar = new int[3];
		int[] ar2 = { 1, 2, 3 };

		String[] names = new String[2];

		System.out.println(ar);
		System.out.println(names);

		System.out.println(ar[0]);
		System.out.println(names[0]);

		ar[0] = 50;
		ar = ar2;
		System.out.println(ar[0]);

	}

}
