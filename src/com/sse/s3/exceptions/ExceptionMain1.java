package com.sse.s3.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {

			int num = 10;

			System.out.println("숫자 입력");
			int num2 = sc.nextInt();

			System.out.println(num / num2);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없음");
		} catch (InputMismatchException a) {
			System.out.println("숫자 외에는 입력 하지마세요");
		}

		Exeption1 ex1 = new Exeption1();
		try {
			ex1.ex1(5);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("프로그램이 종료");
	}
}