package com.sse.s2.util.collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetMain3 {

	public static void main(String[] args) {

		HashSet<Integer> ar = new HashSet<Integer>();
		ar.add(10);
		ar.add(8);
		ar.add(16);

		System.out.println(ar);
		
		Iterator<Integer> ir =ar.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}

	}

}
