package �����ڷ���;

import java.time.LocalDate;

public class Dates_2 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate yesterday = LocalDate.of(2018, 01, 31);
		System.out.println(today);
		System.out.println(yesterday);
		System.out.println(today.withYear(2016)); // �⵵�� �ٲ�
		System.out.println(today.withMonth(3)); // ���� �ٲ�
		System.out.println(today.withDayOfYear(100)); // 1�� �� 100��° ��¥
		System.out.println(today.withDayOfMonth(22)); // ���� *�� 22��° ��¥
		// �� ����.. ??
		
		
	}

}
