package com.sse.s4.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReadMain {

	public static void main(String[] args) {

		File file = new File("C:\\study", "study.java");
		Scanner sc = new Scanner(System.in);

		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			while (true) {
				String s = br.readLine();
				if (s == null) {
					break;
				}
				System.out.println(s);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("종료");
	}

}
