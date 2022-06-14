package com.calendarex;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();

		int i, year, month;
		System.out.print("년도:");
		year = sc.nextInt();

		do {
			System.out.print("월:");
			month = sc.nextInt();
		} while (month < 1 || month > 12);

		cal.set(year, month - 1, 1);

		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("\t\t    " + year + "년 " + month + "월");
		System.out.println("   일     월      화      수     목      금      토  ");
		System.out.println("========================");

		for (i = 1; i < week; i++)
			System.out.print("\t");
		for (i = 1; i <= cal.getActualMaximum(Calendar.DATE); i++) {
			System.out.printf("%4d\t", i);
			week++;
			if (week % 7 == 1) {
				System.out.println();
			}
		}
		if (week % 7 != 1) {
			System.out.println();
			System.out.println("========================");
		}

	}

}
