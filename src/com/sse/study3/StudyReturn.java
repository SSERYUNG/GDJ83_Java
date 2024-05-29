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

}
