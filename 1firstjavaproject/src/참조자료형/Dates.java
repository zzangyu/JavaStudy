package �����ڷ���;

/*
LocalDate, LocalDateTime, LocalTime
�� �� Ŭ������ ��¥�� �ð��� �ٷ�� ���� ������ ��������.
LocalDate: ��¥�� ��Ÿ����.
LocalTime: �ð��� ��Ÿ����.
LocalDateTime: ��¥�� �ð��� ��Ÿ����.
*/
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
public class Dates {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println(now.getDayOfWeek());
		System.out.println(now.getYear());
		System.out.println(now.getDayOfMonth()); // �� �� ���° ���ΰ�
		System.out.println(now.getDayOfYear()); // 1�� �� ���° ���ΰ�
		System.out.println(now.getMonth());
		System.out.println(now.isLeapYear());// �����ΰ���?
		System.out.println(now.lengthOfMonth());
		System.out.println(now.lengthOfYear());
		System.out.println(now.plusDays(100)); // ������ ���� 100�� ��
		System.out.println(now.minusDays(100)); // ������ ���� 100�� ��
		LocalDate hundredYearsBefore = now.minusDays(100);
		System.out.println(hundredYearsBefore);
		
		LocalDateTime now1 = LocalDateTime.now();
		System.out.println(now1);
		System.out.println(now1.plusMonths(1));
		
		
		LocalTime now2 = LocalTime.now();
		System.out.println(now2);
		
		
		
	}

}
