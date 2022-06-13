package com.calendarex;

import java.util.Calendar;
import java.util.GregorianCalendar;

// ���� : 1970/01/01
/*
 * Calendar ��ü�� ������ �� �ִ� ��� 3����
 * 1. Calendar calendar = Calendar.getInstance();
 * 2. Calendar gregorianCalendar = new GregorianCalendar();
 * 3. GregorianCalendar gregorianCalendar = new GregorianCalendar();
 * GregorianCalendar : Calendar class�� sub class
 */
public class CalendarEx01 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		Calendar gregorianCalendar_1 = new GregorianCalendar();
		GregorianCalendar gregorianCalendar_2 = new GregorianCalendar();

		while (true) {
			System.out.println(calendar.DATE + "��");
		}

	}

}
