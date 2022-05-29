package review;

import java.util.Arrays;

enum Season {
// Enum - 열거형, 특정 값들에 제한을 두기 위함
	WINTER, SPRING, SUMMER, FALL;

}

public class EnumerationRunner {
	public static void main(String[] args) {
		Season season = Season.WINTER;

		Season season1 = Season.valueOf("WINTER");
		System.out.println(season1);
		System.out.println(season1.name());
		System.out.println(Season.FALL.name());
		System.out.println(Season.SUMMER.ordinal());

		System.out.println(Arrays.toString(Season.values()));
	}

}
