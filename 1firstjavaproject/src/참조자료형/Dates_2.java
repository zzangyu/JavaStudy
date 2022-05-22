package 참조자료형;

import java.time.LocalDate;

public class Dates_2 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate yesterday = LocalDate.of(2018, 01, 31);
		System.out.println(today);
		System.out.println(yesterday);
		System.out.println(today.withYear(2016)); // 년도만 바꿈
		System.out.println(today.withMonth(3)); // 월만 바꿈
		System.out.println(today.withDayOfYear(100)); // 1년 중 100번째 날짜
		System.out.println(today.withDayOfMonth(22)); // 지금 *달 22번째 날짜
		// 왜 에러.. ??
		
		
	}

}
