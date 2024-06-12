package com.sse.s4.io;

import java.io.File;

public class FileMain2 {

	public static void main(String[] args) {

		File file = new File("C:\\study2");

		String[] name = file.list();

		for (String a : name) {
			file = new File("C:\\study2\\" + a);
			file.delete();
		}

		file = new File("C:\\study2");
		file.delete();

	}

}
