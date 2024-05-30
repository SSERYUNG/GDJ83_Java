package com.sse.study3.ex4;

public class Car {

	String color = "White";
	String brand;
	String company;
	int price = 1000;

	{
		price = 200;
	}

	public Car() {
		this.color = "Black";
		this.brand = "k3";
		this.company = "kia";
		this.price = 2500;

		System.out.println("자동차가 만들어집니다");

		this.info();
	}

	public Car(int price) {
		this.price = price;
		this.color = "Black";
		this.brand = "k3";
		this.company = "kia";
	}

	public Car(int price, String color) {
		this.price = price;
		this.color = color;
		this.brand = "k3";
		this.company = "kia";
	}

	public Car(int price, String color, String brand) {
		this.price = price;
		this.color = color;
		this.brand = brand;
		this.company = "kia";
	}

	public void info() {
		System.out.println("info");
		System.out.println(this.color);
		System.out.println(brand);
		System.out.println(price);

	}

}
