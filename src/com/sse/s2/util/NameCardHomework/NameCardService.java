package com.sse.s2.util.NameCardHomework;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NameCardService {

	private Scanner sc;
	private StringBuffer sb;

	public NameCardService() {
//		기존 명함들
		this.sb = new StringBuffer();
		this.sb.append("예준, 01009121111, 돌고래, 파랑.plave.com,");
		this.sb.append("노아, 01002102222, 알파카, 보라.plave.com,");
		this.sb.append("밤비, 01007153333, 사슴, 분홍.plave.com,");
		this.sb.append("은호, 01005244444, 늑대, 빨강.plave.com");
		sc = new Scanner(System.in);
	}

	public ArrayList<NameCardDTO> init() {
		String old = this.sb.toString();
		StringTokenizer st = new StringTokenizer(old, ",");
		ArrayList<NameCardDTO> namear = new ArrayList<NameCardDTO>();

		while (st.hasMoreTokens()) {

			NameCardDTO ncdto = new NameCardDTO();
			ncdto.setName(st.nextToken().trim());
			ncdto.setPhone(st.nextToken().trim());
			ncdto.setCompany(st.nextToken().trim());
			ncdto.setMail(st.nextToken().trim());

			namear.add(ncdto);

		}
		return namear;
	}

	public NameCardDTO pick(ArrayList<NameCardDTO> ar) {

		System.out.println("찾아볼 명함의 이름을 입력하시오");
		String name = sc.next();
		NameCardDTO pickdto = new NameCardDTO();

		for (int i = 0; i < ar.size(); i++) {

			if (name.equals(ar.get(i).getName())) {

				pickdto.setName(ar.get(i).getName());
				pickdto.setPhone(ar.get(i).getPhone());
				pickdto.setCompany(ar.get(i).getCompany());
				pickdto.setMail(ar.get(i).getMail());
				break;

			}
		}
		if (pickdto.getName() != null) {
			return pickdto;
		} else {
			return pickdto;
		}

	}
}
