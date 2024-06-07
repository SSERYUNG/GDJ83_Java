package com.sse.s2.util.token;

import java.util.StringTokenizer;

public class TokenStudy {

	public static void main(String[] args) {
		String names = "yejun,   22 ,noah,   22,bamby,  21,   eunho,  20 hamin,  19";
		StringTokenizer st = new StringTokenizer(names, ",");
		System.out.println(st.countTokens());

		while (st.hasMoreTokens()) {
			String name = st.nextToken();
			String age = st.nextToken();
			System.out.println(name.trim());
			System.out.println(age.trim());
		}

		String[] n = names.split(",");

	}

}
