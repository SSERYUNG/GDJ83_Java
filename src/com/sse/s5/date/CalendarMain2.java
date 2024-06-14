package com.sse.s5.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.UUID;

public class CalendarMain2 {

	public static void main(String[] args) {

		Calendar ca = Calendar.getInstance();

		Calendar birth = Calendar.getInstance();

		birth.set(1994, 1, 3);
		System.out.println(birth.getTime());

		long c = ca.getTimeInMillis();
		long b = birth.getTimeInMillis();

		System.out.println(b / (1000 * 60 * 60 * 24));

		b = b + (1000 * 60 * 60 * 24) * 100L;

		birth.setTimeInMillis(b);

		System.out.println(birth.getTime());

		String n = "1995-03-12";
		String[] ar = n.split("-");
		ca.set(Integer.parseInt(ar[0]), Integer.parseInt(ar[1]) - 1, Integer.parseInt(ar[2]));
		System.out.println("==============");
		System.out.println(ca.getTime());

		ca = Calendar.getInstance();

		SimpleDateFormat sd = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm");
		String s = sd.format(ca.getTime());
		System.out.println(s);

		String id = UUID.randomUUID().toString();
		System.out.println(id);

	}

}
