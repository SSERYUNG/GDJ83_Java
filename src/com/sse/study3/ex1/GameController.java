package com.sse.study3.ex1;

public class GameController {
	public void start() {

//		1마리 생성
		MonsterFactory mf = new MonsterFactory();
		Monster m = mf.creatMonster();
		System.out.println(m.name);
		System.out.println(m.lv);

//		랜덤 생성
		Monster[] monsters = mf.createMonsterGroup();

		for (int i = 0; i < monsters.length; i++) {
			System.out.println("=========");
			System.out.println(monsters[i].name);
			System.out.println(monsters[i].lv);
		}
	}
}