package com.sse.s2.util.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain1 {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		String name = "sse";
		int num = 2;
		ar.add(name);
		ar.add(num);
		ar.add(3.12);
		ar.add('a');
		ar.add(false);
		ar.add(num);
		ar.add(1, "test");
		ar.set(0, 'c');
		ar.remove(0);
		ar.clear();

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		LinkedList lk = new LinkedList();
		lk.add("ad");

	}

}
