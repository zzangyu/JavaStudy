package Class;

public class TvTest {

	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.channel = 24;
		tv.channelDown();
		System.out.println("현재 채널은 " + tv.channel + "번 입니다.");
		tv.color = "white";
		tv.power = true;
		System.out.println(tv.power);

	}
}
