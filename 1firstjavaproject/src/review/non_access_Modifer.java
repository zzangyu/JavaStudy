package review;

// static - 객체마다 가질 필요가 없는 공용으로 사용하는 필드 혹은 인스턴스 필드를 포함하지 않는 메소드
// final - 한 번 값이 정해지고 나면 값을 바꿀 수 없는 필드
// public static final - 모든 영역에서 고정된 값으로 사용하는 상수

public class non_access_Modifer {
	public static final int SECONDS_IN_MINUTE = 60;
	public static final int MINUTES_IN_HOUR = 60;
	public static final int HOURS_IN_DAY = 24;
	public static final int SECONDS_IN_DAY = SECONDS_IN_MINUTE * MINUTES_IN_HOUR * HOURS_IN_DAY;

	public static void main(String[] args) {

		System.out.println(Integer.MIN_VALUE);
		System.out.println(60 * 60 * 24); // 하루는 몇초 ?
		System.out.println(SECONDS_IN_DAY);

	}

}
