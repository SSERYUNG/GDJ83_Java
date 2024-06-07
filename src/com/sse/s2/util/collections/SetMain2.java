package com.sse.s2.util.collections;

import java.util.HashSet;
import java.util.Random;

public class SetMain2 {

	public static void main(String[] args) {
//		로또 번호 1~45:6개

		Random random = new Random();

//		Arryalist랑 배열로 만들어보기

		int[] ar = new int[6];
		for (int i = 0; i < ar.length; i++) {
			if (i == 0) {
				ar[i] = random.nextInt(45) + 1;

			} else {
				for (int j = i; j < i + 1; j++) {
					if (ar[j - i] != ar[i]) {
						ar[i] = random.nextInt(45) + 1;
					} else {

					}

				}

			}

		}

//3.HashSet 클래스를 이용
		HashSet<Integer> hs = new HashSet<Integer>();
		while (hs.size() != 6) {
			hs.add(random.nextInt(45) + 1);
		}
		System.out.println(hs);
	}

}
