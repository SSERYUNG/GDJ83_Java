package com.sse.s2.util.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class SetMain2 {

	public static void main(String[] args) {

		String n = "123";
		Object obj = n;
		System.out.println(obj instanceof String);

//		로또 번호 1~45:6개

		Random random = new Random();

//1. 배열을 이용
		int[] ar = new int[6];

		for (int i = 0; i < ar.length; i++) {
			if (i == 0) {
				int num = random.nextInt(45) + 1;
				ar[i] = num;

			} else {
				int result = random.nextInt(45) + 1;
				boolean flag = true;
				for (int j = i; j > 0; j--) {
					if (ar[j - 1] != result) {
						continue;
					} else {
						flag = false;
						break;
					}

				}
				if (flag) {
					ar[i] = result;
				} else {
					i--;
				}
			}

		}

		for (int i = 0; i < ar.length; i++) {

			System.out.println(ar[i]);
		}
		System.out.println("=============");

//2. ArrayList를 이용

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 6; i++) {
			if (i == 0) {
				int num = random.nextInt(45) + 1;
				list.add(num);

			} else {
				int result = random.nextInt(45) + 1;
				boolean flag = true;
				for (int j = i; j > 0; j--) {
					if (list.get(j - 1) != result) {
						continue;
					} else {
						flag = false;
						break;
					}

				}
				if (flag) {
					list.add(result);
				} else {
					i--;
				}
			}

		}

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));
		}

		System.out.println("=============");

//3.HashSet 클래스를 이용
		HashSet<Integer> hs = new HashSet<Integer>();
		while (hs.size() != 6) {
			hs.add(random.nextInt(45) + 1);
		}
		System.out.println(hs);
	}

}
