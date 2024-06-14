package com.sse.s5.date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalenderMain {

	public static void main(String[] args) {

		Calendar ca = new GregorianCalendar();

//		ca를 만들 시점의 현재 시간과 날짜 정보가 만들어짐
		ca = Calendar.getInstance();

		System.out.println(ca.get(Calendar.YEAR));
		System.out.println(ca.get(Calendar.HOUR_OF_DAY));
		System.out.println(ca.get(Calendar.DATE));
		System.out.println(ca.get(Calendar.MONTH) + 1);
		Single single = Single.get();

		System.out.println("==========");
		System.out.println(Calendar.HOUR_OF_DAY);

		Date date = ca.getTime();
		System.out.println(date);

		Calendar future = Calendar.getInstance();
		future.set(Calendar.DATE, future.get(Calendar.DATE) + 17);
		System.out.println(future.getTime());

	}

}
