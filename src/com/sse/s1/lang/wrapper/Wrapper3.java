package com.sse.s1.lang.wrapper;

import java.util.Scanner;

public class Wrapper3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력");
		String jumin = sc.next();

//		1. 성별검증
		String[] juminar = jumin.split("-");
		String behind = juminar[1];
		int sex = Integer.parseInt(behind);
		int sexresult = sex / 1000000;

		if (sexresult % 2 == 0) {
			System.out.println("여자입니다");
		} else {
			System.out.println("남자입니다");
		}

//		2. 나이계산 2024-출생년도
		String front = juminar[0];
		String year = front.substring(0, 2);
		int nai = Integer.parseInt(year);
		int nai2 = 2024 - nai;
		int namoji = nai2 % 1000;
		int result = namoji % 100;

		System.out.println(result + "세입니다");

//		3. 주민번호 유효성 검증
//		9   4  0  2  0  3 - 1   2   3   4   5   6   7
//		*2 *3 *4 *5 *6 *7   *8  *9  *2  *3  *4  *5  (검증용 숫자)
//		18  12  0  10 0 21  8  18  6  12  20  30 
//		158
//		총합을 11로 나눈 나머지 -> 4
//		11 빼기 이 나머지를 한 결과값이 검증용 숫자와 같은지 비교
//		같으면 맞는 번호, 아니면 이상한 번호
//		근데 이 결과값이 2자리수라면 결과값을 10으로 나눈 나머지를 검증용 숫자랑 또 비교

		String[] frontar = new String[6];

		for (int i = 0; i < frontar.length; i++) {
			frontar[i] = jumin.substring(i, i + 1);
		}

		int num = 0;
		for (int i = 0; i < frontar.length; i++) {
			num = num + Integer.parseInt(frontar[i]) * (i + 2);
		}

//		num에 앞자리 계산한거 들어있음

		String[] behindar = new String[6];
		for (int j = 0; j < behindar.length; j++) {
			behindar[j] = jumin.substring(j + 7, j + 8);
		}

		int j = 0;
		int h = 0;

		for (int i = 0; i < behindar.length; i++) {
			if (i <= 1) {

				num = num + Integer.parseInt(behindar[i]) * (j + 8);
				j++;
			} else {

				num = num + Integer.parseInt(behindar[i]) * (h + 2);
				h++;
			}
		}

		System.out.println(num + "은 곱하고 다 더한 그것");

		int naa = num % 11;
		int bbe = 11 - naa;

		char majimak = jumin.charAt(13);
		String majimak2 = String.valueOf(majimak);
		int maknum = Integer.parseInt(majimak2);

		System.out.println(bbe + "은 검증번호랑 비교할 그것");

		if (bbe > 10) {
			if (bbe % 10 == maknum) {
				System.out.println("검증된 주민등록번호입니다");
			} else {
				System.out.println("검증되지 않은 주민등록번호입니다");
			}
		}
		if (bbe == maknum) {
			System.out.println("검증된 주민등록번호입니다");
		} else {
			System.out.println("검증되지 않은 주민등록번호입니다");
		}

	}
}
