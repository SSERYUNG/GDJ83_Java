package com.sse.study3;

import java.util.Random;

public class StudyReturn {

	public int t1() {
		int num = 3;
		int num2 = 6;
		int result = num * num2;
		return result;
	}

	public void t2() {
		Random random = new Random();
//		0이상 10미만의 정수 하나를 랜덤하게 리턴한다
		int num = random.nextInt(10);
		if (num % 2 == 0) {
			return;
		} else {
			System.out.println(num);
		}

	}

//	월급을 받고 3.3%를 제외한 실수령액 계산
	public void t4(int sal) {
		double result = sal - sal * 0.033;
		System.out.println(result);

		sal = 100;
	}

	public Test t5(Test t) {
		System.out.println(t.level);
		t.level = 200;
		t = new Test();
		t.level = 500;
		return t;
	}
}
