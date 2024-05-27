package com.sse.study1;

import java.util.Scanner;

public class Study8 {

	public static void main(String [] args) {
//		1. 단발모드(30) 2. 점사모드(10)
		
		Scanner sc = new Scanner(System.in);
		
		for(int j=0;j<3;j++) {
			System.out.println("1.단발 2. 점사");
			int tan = sc.nextInt();
			
			if (tan==1){
				for(int i=0;i<30;i++) {
					
					System.out.println("탕");
				}
				
			}else if (tan==2) {
				for(int i=0;i<10;i++) {
				
					System.out.println("타타탕");
				}
			}else {
				j--;
			}
		}
		
			
		}
	}