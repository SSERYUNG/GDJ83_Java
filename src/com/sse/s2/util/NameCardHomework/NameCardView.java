package com.sse.s2.util.NameCardHomework;

import java.util.ArrayList;

public class NameCardView {

//	전체 명함 목록 보기

	public void allview(ArrayList<NameCardDTO> ar) {

		System.out.println("이름\t번호\t\t회사\t메일");

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i).getName() + "\t" + ar.get(i).getPhone() + "\t" + ar.get(i).getCompany() + "\t"
					+ ar.get(i).getMail());
		}
	}

//	특정 이름에 맞는 명함 보기
	public void oneview(NameCardDTO ncd) {

		if (ncd.getName() != null) {

			System.out.println("이름\t번호\t\t회사\t메일");

			System.out.println(ncd.getName() + "\t" + ncd.getPhone() + "\t" + ncd.getCompany() + "\t" + ncd.getMail());
			System.out.println("해당 이름의 명함 정보를 불러왔습니다. 처음으로 돌아갑니다.");
		} else {
			System.out.println("이름에 맞는 명함이 존재하지 않습니다. 처음으로 돌아갑니다.");
		}
	}

}
