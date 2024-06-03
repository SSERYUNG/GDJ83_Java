package com.sse.s1.lang;

public class Test {
	int age = 10;
	double num = 3.1;

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Test t = (Test) obj;
		if (this.age == t.age && this.num == t.num) {
			return true;
		} else {
			return false;
		}

	}

}
