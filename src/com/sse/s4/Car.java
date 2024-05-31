package com.sse.s4;

public class Car {

	public static String company;

	public final int price;
	{
		this.price = 30;
	}

	public static void info() {
		System.out.println(Car.company);
		System.out.println("static method");

	}

	public void info2() {
		Car.info();
		final int num = 30;
	}

}
