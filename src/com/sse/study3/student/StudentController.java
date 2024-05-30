package com.sse.study3.student;

import java.util.Scanner;

public class StudentController {
	public void start() {

		System.out.println("start");

		Scanner sc = new Scanner(System.in);
		StudentService service = new StudentService();
		StudentView view = new StudentView();
		boolean flag = true;
		Student[] students = null;

		while (flag) {

			System.out.println("1. 학생정보 입력 2. 전체정보 출력 3. 학생검색 4. 프로그램 종료");
			int select = sc.nextInt();
			if (select == 1) {
				students = service.makeStudent();
			} else if (select == 2) {
				if (students != null) {

					view.view(students);
				} else {
					view.view("학생 정보를 먼저 입력하세요");
				}
			} else if (select == 3) {
				Student student = service.findByNum(students);
				if (student != null) {

					view.view(student);
				} else {
					view.view("검색 결과가 없습니다");
				}

			} else {
				flag = false;
			}
		}
	}
}