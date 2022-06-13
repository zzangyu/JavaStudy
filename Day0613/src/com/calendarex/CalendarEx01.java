package com.calendarex;

import java.util.Calendar;
import java.util.GregorianCalendar;

// 기준 : 1970/01/01
/*
 * Calendar 객체를 생성할 수 있는 방법 3가지
 * 1. Calendar calendar = Calendar.getInstance();
 * 2. Calendar gregorianCalendar = new GregorianCalendar();
 * 3. GregorianCalendar gregorianCalendar = new GregorianCalendar();
 * GregorianCalendar : Calendar class의 sub class
 */
public class CalendarEx01 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		Calendar gregorianCalendar_1 = new GregorianCalendar();
		GregorianCalendar gregorianCalendar_2 = new GregorianCalendar();

		String str1 = String.format("%1$tF %1$tA %1$tT", calendar); // F: 날짜, A: 어느 지역인지, T: 시간
		System.out.println(str1);
		int y = calendar.get(Calendar.YEAR);
		int m = calendar.get(Calendar.MONTH) + 1;
		int d = calendar.get(Calendar.DATE);

		int w = calendar.get(Calendar.DAY_OF_WEEK); // 그 주의 몇번째 날짜인가 (일요일:0) -> switch case 이용해서 요일 빼내기
		String week = "";
		switch (w) {
		case 1:
			week = "일요일";
			break;
		case 2:
			week = "월요일";
			break;
		case 3:
			week = "화요일";
			break;
		case 4:
			week = "수요일";
			break;
		case 5:
			week = "목요일";
			break;
		case 6:
			week = "금요일";
			break;
		case 7:
			week = "토요일";
			break;

		}

		System.out.println(y + "년 " + m + "월 " + d + "일 " + week);

	}

}
