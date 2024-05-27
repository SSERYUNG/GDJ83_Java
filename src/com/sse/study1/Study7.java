package com.sse.study1;

import java.util.Scanner;

public class Study7 {

	public static void main(String [] argus) {
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		for(int i=0;i<3;i++) {
			int num = sc.nextInt();
//			sum=sum+num;
			sum+=num;
		}
		
		int c=97;
		for(int i=0;i<26;i++) {
			
			System.out.println((char)c);
			c++;
		}
		
		System.out.print("abc");
		System.out.print("def");
		System.out.println("123");
	}
	
}