package com.sse.study1;

public class Study6 {
 public static void main(String [] args) {
	 
	 int total = 300;
	 int avg = total/3;
	 
	 switch(avg/10){
	 case 10:
	 case 9:
		 System.out.println("A");
		 break; 
	 case 8:
		 System.out.println("B");
		 break;
	 case 7:
		 System.out.println("C");
		 break;
	 case 6:
		 System.out.println("D");
		 break;
	default:
		System.out.println("F");
	 }
 }
}
