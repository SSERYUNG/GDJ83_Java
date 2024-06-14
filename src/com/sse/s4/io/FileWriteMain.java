package com.sse.s4.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("파일 명을 입력하세요");
		String filename = sc.next();

		File file = new File("C:\\study", filename);
		FileWriter fw = null;

		try {
			fw = new FileWriter(file, true);

//			e,나 E가 입력되면 종료
			while (true) {

				System.out.println("입력하세요");
				String s = sc.next();

				if (s.toLowerCase().equals("e")) {
					break;
				}
				fw.write(s + "\r\n");
				fw.flush();
			}
		} catch (

		IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("프로그램 종료");
	}

}
