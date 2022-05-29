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
		System.out.println(Season.SUMMER.ordinal());// �����ͺ��̽��� ������ �� ordinal ����ϸ� �ȵȴ� !
		System.out.println(Season.SUMMER.getValue()); // �Ҵ��� ���� ������, index ��ġ�� �ƴ϶� ��Ȯ
		System.out.println(Arrays.toString(Season.values()));

		System.out.println(Arrays.toString(DayOfWeek.values()));// API�� �ִ� DayOfWeek ���
		System.out.println(DayOfWeek.of(3)); // Ư�� ���� ã�� ��!
		System.out.println(Arrays.toString(Month.values()));
		System.out.println(Month.of(3)); // Ư�� �� ã�� ��!

	}

}
