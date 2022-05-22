package 참조자료형;

/*
LocalDate, LocalDateTime, LocalTime
이 세 클래스로 날짜와 시간을 다루는 것이 굉장히 쉬워졌다.
LocalDate: 날짜를 나타낸다.
LocalTime: 시간을 나타낸다.
LocalDateTime: 날짜와 시간을 나타낸다.
*/
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
public class Dates {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println(now.getDayOfWeek());
		System.out.println(now.getYear());
		System.out.println(now.getDayOfMonth()); // 달 중 몇번째 날인가
		System.out.println(now.getDayOfYear()); // 1년 중 몇번째 날인가
		System.out.println(now.getMonth());
		System.out.println(now.isLeapYear());// 윤년인가요?
		System.out.println(now.lengthOfMonth());
		System.out.println(now.lengthOfYear());
		System.out.println(now.plusDays(100)); // 오늘을 기준 100일 뒤
		System.out.println(now.minusDays(100)); // 오늘을 기준 100일 전
		LocalDate hundredYearsBefore = now.minusDays(100);
		System.out.println(hundredYearsBefore);
		
		LocalDateTime now1 = LocalDateTime.now();
		System.out.println(now1);
		System.out.println(now1.plusMonths(1));
		
		
		LocalTime now2 = LocalTime.now();
		System.out.println(now2);
		
		
		
	}

}
