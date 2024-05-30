package com.sse.s1;

import com.sse.s2.Korea;
import com.sse.s2.Member;

public class S1Main {

	public static void main(String[] args) {
		Test test = new Test();
		test.num = 10;
		Korea korea = new Korea();
		korea.setPop(20);
		int p = korea.getPop();
		System.out.println(p);

		Member member = new Member();
		com.sse.s2.Member mem = new com.sse.s2.Member();
	}

}
