package com.sse.s3;

public class S3Main {

	public static void main(String[] args) {

		Tiger tiger = new Tiger();
		tiger.age = 5;
		tiger.name = "호돌이";
		tiger.power = 500;

		Penguin penguin = new Penguin();
		penguin.age = 3;
		penguin.name = "펭수";
		penguin.wing = 2;

		Animal animal = tiger;

		System.out.println(animal.name);
		System.out.println();

		Tiger[] dropShip = new Tiger[8];

		dropShip[0] = tiger;

		Eagle eagle = new Eagle();
		Airplane airplane = new Airplane();

		Fly fly = eagle;
		fly = airplane;

	}

}
