package review;

import java.time.DayOfWeek;
import java.time.Month;
import java.util.Arrays;

public class EnumerationRunner {
	public static void main(String[] args) {
		Season season = Season.FALL;

		Season season1 = Season.valueOf("WINTER");
		System.out.println(season);
		System.out.println(season1.name());
		System.out.println(Season.SPRING.name());
		System.out.println(Season.SUMMER.ordinal());// 데이터베이스에 저장할 땐 ordinal 사용하면 안된다 !
		System.out.println(Season.SUMMER.getValue()); // 할당한 값을 가져옴, index 위치가 아니라 정확
		System.out.println(Arrays.toString(Season.values()));

		System.out.println(Arrays.toString(DayOfWeek.values()));// API에 있는 DayOfWeek 사용
		System.out.println(DayOfWeek.of(3)); // 특정 요일 찾는 법!
		System.out.println(Arrays.toString(Month.values()));
		System.out.println(Month.of(3)); // 특정 월 찾는 법!

	}

}
