package com.sse.study1;

public class Study3 {
	public static void main(String [] args) {
		System.out.println("1"+1);
		System.out.println(1+'a'+"1");
		
		int total = 35690;
		int don = 50000;
		
		int jandon = don-total;
		
		//만원짜리 갯수 변수
		int man = 0;
		man = jandon/10000;
		int manextra = jandon%10000;
		
		//천원짜리 갯수 변수
		int chon = 0;
		chon = manextra/1000;
		int chonextra = manextra%1000;
		
		//백원짜리 갯수 변수
		int bak = 0;
		bak = chonextra/100;
		int bakextra = chonextra%100;
		
		//십원짜리 갯수 변수
		int sip = 0;
		sip = bakextra/10;
		
		
		System.out.println("잔돈 : "+jandon);
		System.out.println("만원 : "+man+"장");
		System.out.println("천원 : "+chon+"장");
		System.out.println("백원 : "+bak+"개");
		System.out.println("십원 : "+sip+"개");
		
	}
}
