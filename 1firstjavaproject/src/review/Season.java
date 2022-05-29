package review;

public enum Season { // 다른 class안에 생성 가능, 이처럼 따로 생성 가능
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