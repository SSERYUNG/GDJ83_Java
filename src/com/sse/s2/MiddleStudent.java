package com.sse.s2;

public class MiddleStudent extends Student {

	private int history;

	public MiddleStudent() {
		super(10);
	}

	public void midinfo() {
		super.info();
		System.out.println(this.history);
	}

	public int getHistory() {
		return history;
	}

	public void setHistory(int history) {
		this.history = history;
	}

}
