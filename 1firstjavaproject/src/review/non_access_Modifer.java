package review;

// static - ��ü���� ���� �ʿ䰡 ���� �������� ����ϴ� �ʵ� Ȥ�� �ν��Ͻ� �ʵ带 �������� �ʴ� �޼ҵ�
// final - �� �� ���� �������� ���� ���� �ٲ� �� ���� �ʵ�
// public static final - ��� �������� ������ ������ ����ϴ� ���

public class non_access_Modifer {
	public static final int SECONDS_IN_MINUTE = 60;
	public static final int MINUTES_IN_HOUR = 60;
	public static final int HOURS_IN_DAY = 24;
	public static final int SECONDS_IN_DAY = SECONDS_IN_MINUTE * MINUTES_IN_HOUR * HOURS_IN_DAY;

	public static void main(String[] args) {

		System.out.println(Integer.MIN_VALUE);
		System.out.println(60 * 60 * 24); // �Ϸ�� ���� ?
		System.out.println(SECONDS_IN_DAY);

	}

}
