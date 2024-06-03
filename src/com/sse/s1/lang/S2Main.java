package com.sse.s1.lang;

import java.util.Scanner;

public class S2Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Object obj1 = new Object();
		Object obj2 = new Object();

		boolean flag = obj1.equals(obj2);
		System.out.println(flag);

		Test t1 = new Test();
		Test t2 = new Test();
		System.out.println(t1 == t2);

		t1.age = 9;
		flag = t2.equals(t1);
		System.out.println(flag);

		String name = "hamin";
		System.out.println("이름을 입력하세요");
		String name2 = sc.next();
		String name3 = "hamin";
		System.out.println(name == name2);
		System.out.println(name == name3);
		System.out.println(name.equals(name2));

	}
}
