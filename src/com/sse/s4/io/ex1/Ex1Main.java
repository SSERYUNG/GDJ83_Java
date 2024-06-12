package com.sse.s4.io.ex1;

import java.util.List;

public class Ex1Main {

	public static void main(String[] args) {
		ReadStudy rs = new ReadStudy();
		try {
			List<MenuDTO> ar = rs.read();
			System.out.println(ar.get(2).getPrice());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
