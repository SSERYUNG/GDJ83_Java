package com.sse.s4.io.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadStudy {

	public List<MenuDTO> read() throws Exception {

//		info.txt 파일을 읽어오기
//		1. 항목별로 파싱하기

		File file = new File("C:\\study", "info.txt");

		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String[] ar = null;
		ArrayList<MenuDTO> menudtoar = new ArrayList<MenuDTO>();
		String menuname = null;
		int price;
		int kcal;

		while (true) {
			String line = br.readLine();
			if (line != null) {

				ar = line.split(",");

				menuname = ar[0].trim();
				price = Integer.parseInt(ar[1].trim());
				kcal = Integer.parseInt(ar[2].trim());

				MenuDTO menudto = new MenuDTO();
				menudto.setMenuname(menuname);
				menudto.setPrice(price);
				menudto.setKcal(kcal);

				menudtoar.add(menudto);

			} else {
				break;
			}
		}

		br.close();
		fr.close();
		return menudtoar;
	}

}
