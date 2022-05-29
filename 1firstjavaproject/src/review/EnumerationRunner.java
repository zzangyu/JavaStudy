package review;

import java.util.Arrays;

enum Season {
// Enum - ������, Ư�� ���鿡 ������ �α� ����
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
		System.out.println(Season.SUMMER.ordinal());// �����ͺ��̽��� ������ �� ordinal ����ϸ� �ȵȴ� !
		System.out.println(Season.SUMMER.getValue()); // �Ҵ��� ���� ������, index ��ġ�� �ƴ϶� ��Ȯ
		System.out.println(Arrays.toString(Season.values()));

	}

}
