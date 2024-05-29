package com.sse.study3.student;

import java.util.Scanner;

public class StudentController {
	public void start() {

		System.out.println("start");

		Scanner sc = new Scanner(System.in);
		StudentService service = new StudentService();
		boolean flag = true;
		Student[] students = null;

		while (flag) {
			System.out.println("1. 학생정보 입력 2. 전체정보 출력 3. 학생검색 4. 프로그램 종료");
			int select = sc.nextInt();
			if (select == 1) {
				students = service.makeStudent();
			} else if (select == 2) {
				for (int i = 0; i < students.length; i++) {
					System.out.println(students[i].name);
					System.out.println(students[i].avg);
				}

			} else if (select == 3) {
				System.out.println("학생검색하는 코드 작성");
			} else if (select == 4) {
				System.out.println("프로그램을 종료합니다");
				flag = false;
			} else {
				System.out.println("잘못 입력 됐습니다");
			}

		}
	}
}
