package com.sse.s4.io;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {

		File file = new File("C:\\study");

		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.getName());
		System.out.println(file.length());

//		file = new File("C:\\study","test.txt");
		file = new File(file, "sub");

		if (!file.exists()) {

			file.mkdir();
		}
		file = new File("C:\\study\\sub2\\student");

		file.mkdirs();

		file = new File("C:\\study\\test.txt");
		file.delete();

		file = new File("C:\\study\\sub2");
		file.delete();

		System.out.println("============");

		file = new File("C:\\study");
		String[] list = file.list();

		for (String a : list) {
			System.out.println(a);
		}
		System.out.println("============");

		File[] listfile = file.listFiles();

		for (File a : listfile) {
			if (a.isDirectory()) {

				System.out.println(a.getName() + "는 폴더입니다");
			} else {
				System.out.println(a.getName() + "는 파일입니다");
			}
		}

	}

}
