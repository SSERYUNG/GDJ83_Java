package com.sse.s2;

public class Member {

	private String name;
	private int age;

//	setter 메서드(개발자들끼리 약속해서 이렇게 부름)
	public void setAge(int age) {

		this.age = age;
	}

//	getter 메서드
	public int getAge() {
		return this.age;
	}

}