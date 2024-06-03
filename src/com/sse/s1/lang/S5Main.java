package com.sse.s1.lang;

public class S5Main {
	public static void main(String[] args) {

		String name = " ha     mi   n         ";
		System.out.println(name);
		System.out.println(name.length());

		name = name.trim();
		System.out.println(name);
		System.out.println(name.length());

		name = "hamin-??*asterum";
		name = name.replace("*", "-");
		String[] datas = name.split("-");

		for (int i = 0; i < datas.length; i++) {
			System.out.println(datas[i]);
		}

		String result = name.valueOf('a');
		System.out.println(result);

	}

}
