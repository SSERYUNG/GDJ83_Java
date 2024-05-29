package com.sse.study3.ex1;

public class GameController {
	public void start() {
		MonsterFactory mf = new MonsterFactory();
		Monster m = mf.creatMonster();
		System.out.println(m.name);

		Monster[] monsters = mf.createMonsterGroup();

		for (int i = 0; i < monsters.length; i++) {
			System.out.println("=========");
			System.out.println(monsters[i].name);
			System.out.println(monsters[i].lv);
		}
	}
}
