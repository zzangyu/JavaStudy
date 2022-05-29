package review;

import java.util.Arrays;

enum Season {
// Enum - 열거형, 특정 값들에 제한을 두기 위함
	WINTER(1), SPRING(2), SUMMER(3), FALL(4);

	private int value;

	private Season(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}

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

	}

}
