package com.sse.study3.student;

import java.util.Scanner;

public class StudentService {

	Scanner sc = new Scanner(System.in);

	public Student findByNum(Student[] students) {
		System.out.println("학생 번호를 입력하세요");
		int n = sc.nextInt();
		Student student = null;

		for (int i = 0; i < students.length; i++) {
			if (n == students[i].num) {
				return students[i];
			}

		}
		return student;

	}

	public Student[] makeStudent() {
		System.out.println("학생의 수를 입력하세요");
		int count = sc.nextInt();

		Student[] students = new Student[count];
		for (int i = 0; i < students.length; i++) {
			Student s = new Student();
			System.out.println(i + 1 + "번째 이름 입력");
			s.name = sc.next();
			System.out.println(s.name + "의 번호 입력");
			s.num = sc.nextInt();
			System.out.println(s.name + "의 국어점수 입력");
			s.kor = sc.nextInt();
			System.out.println(s.name + "의 영어점수 입력");
			s.eng = sc.nextInt();
			System.out.println(s.name + "의 수학점수 입력");
			s.math = sc.nextInt();
			s.total = s.kor + s.eng + s.math;
			s.avg = s.total / 3;

			students[i] = s;

		}

		return students;

	}
}
