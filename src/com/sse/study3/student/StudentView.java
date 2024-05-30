package com.sse.study3.student;

public class StudentView {

	public void view(String str) {
		System.out.println(str);
	}

	public void view(Student student) {
		System.out.println("번호\t이름\t국어\t수학\t영어\t총점\t평균");
		System.out.print(student.num + "\t");
		System.out.print(student.name + "\t");
		System.out.print(student.kor + "\t");
		System.out.print(student.math + "\t");
		System.out.print(student.eng + "\t");
		System.out.print(student.total + "\t");
		System.out.println(student.avg);
	}

	public void view(Student[] students) {

		System.out.println("번호\t이름\t국어\t수학\t영어\t총점\t평균");

		for (int i = 0; i < students.length; i++) {
			System.out.print(students[i].num + "\t");
			System.out.print(students[i].name + "\t");
			System.out.print(students[i].kor + "\t");
			System.out.print(students[i].math + "\t");
			System.out.print(students[i].eng + "\t");
			System.out.print(students[i].total + "\t");
			System.out.println(students[i].avg);
		}
	}

}
