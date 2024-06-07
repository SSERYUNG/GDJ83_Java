package com.sse.s2.util.collections;

import java.util.ArrayList;

public class ListMain2 {

	public static void main(String[] args) {
		ArrayList<> ar = new ArrayList();
		ar.add("first");
		ar.add(2);
		ar.add('c');
		ar.add(true);

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		String name = ar.get(0).toString();

		System.out.println(name);

	}

}
