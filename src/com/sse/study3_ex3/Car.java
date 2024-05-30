package com.sse.study3_ex3;

public class Car {

	String color;
	String brand;
	String company;

	public void info() {
		System.out.println(this);
		System.out.println(this.color);
		System.out.println(brand);
		this.go();

	}

	public void go() {
		System.out.println(this.company);
	}
}
