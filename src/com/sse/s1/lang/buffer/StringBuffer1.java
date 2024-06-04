package com.sse.s1.lang.buffer;

public class StringBuffer1 {

	public static void main(String[] args) {
//		문자열을 누적시키고 싶을 때
		StringBuffer sb = new StringBuffer();
		StringBuilder sb2 = new StringBuilder();

		sb.append("yejun");
		sb.append("hamin");
		sb.append(5);

		String result = sb.toString();
		System.out.println(sb);

	}

}
