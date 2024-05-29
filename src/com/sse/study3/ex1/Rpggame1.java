package com.sse.study3.ex1;

public class Rpggame1 {
	public static void main(String[] args) {
		Monster m1 = new Monster();
		m1.hp = 100;
		m1.lv = 10;
		m1.kind = "elf";
		m1.exp = 50;
		m1.name = "marry";
		System.out.println(m1.hp + "\t" + m1.lv + "\t" + m1.kind + "\t" + m1.exp + "\t" + m1.name);

		Axe a1 = new Axe();
		a1.name = "나무 도끼";
		a1.damage = 10;
		a1.range = 1;
		a1.durability = 100;
		a1.upgrade = 0;

		m1.a1 = a1;

		System.out.println(m1.a1.name);
		a1 = new Axe();
		a1.name = "황금도끼";
		System.out.println(m1.a1.name);

		Monster m2 = new Monster();
		m2.a1 = a1;

	}
}
