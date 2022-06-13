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

		String str1 = String.format("%1$tF %1$tA %1$tT", calendar); // F: ��¥, A: ��� ��������, T: �ð�
		System.out.println(str1);
		int y = calendar.get(Calendar.YEAR);
		int m = calendar.get(Calendar.MONTH) + 1;
		int d = calendar.get(Calendar.DATE);

		int w = calendar.get(Calendar.DAY_OF_WEEK); // �� ���� ���° ��¥�ΰ� (�Ͽ���:0) -> switch case �̿��ؼ� ���� ������
		String week = "";
		switch (w) {
		case 1:
			week = "�Ͽ���";
			break;
		case 2:
			week = "������";
			break;
		case 3:
			week = "ȭ����";
			break;
		case 4:
			week = "������";
			break;
		case 5:
			week = "�����";
			break;
		case 6:
			week = "�ݿ���";
			break;
		case 7:
			week = "�����";
			break;

		}

		System.out.println(y + "�� " + m + "�� " + d + "�� " + week);

	}

}
