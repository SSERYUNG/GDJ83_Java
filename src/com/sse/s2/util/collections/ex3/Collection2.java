package com.sse.s2.util.collections.ex3;

import java.util.List;
import java.util.Map;

public class Collection2 {

	public void useList(List<Integer> ar) {

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		for (Integer n : ar) {
			System.out.println(n);
		}

	}

	public void useMap(Map<String, Integer> mp) {

	}

}
