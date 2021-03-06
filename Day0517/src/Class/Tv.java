package Class;

public class Tv {

	// 클래스의 구성요소(속성+메소드)
	// 속성(멤버 변수, 필드)
	String color;
	boolean power;
	int channel;

	public Tv() {

	}

	public Tv(String color, boolean power, int channel) {
		this.color = color;
		this.power = power;
		this.channel = channel;
	}

	// 티비의 기능(메소드)
	public void power() {
		power = !power; // 처리
		// return power; // 결과를 리턴함
	}

	public void channelUp() {
		++channel;
	}

	public void channelDown() {
		--channel;
	}
}
