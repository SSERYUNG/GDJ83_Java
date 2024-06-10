package com.sse.s3.exceptions;

public class Exception2 {
	public void hap(int n1, int n2) throws Exception {

		int h = n1 + n2;

		if (h > 99) {
			throw new Myexception();
		}

	}

}
