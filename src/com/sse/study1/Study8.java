package com.sse.study1;

import java.util.Scanner;

public class Study8 {

	public static void main(String [] args) {
//		1. 단발모드(30) 2. 점사모드(10)
		
		Scanner sc = new Scanner(System.in);
		
		for(int j=0;j<3;j++) {
			System.out.println("1.단발 2. 점사");
			int tan = sc.nextInt();
			int chong = 10;
			String sound = "타타탕";
			
			if (tan==1){
				chong = 30;
				sound = "탕";
				
			}
			for(int i=1;i<=chong;i++) {
				
					System.out.println(sound);
				
			}
		}
		
			
		}
	}