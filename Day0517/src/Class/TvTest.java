package Class;

public class TvTest {

	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.channel = 24;
		tv.channelDown();
		System.out.println("���� ä���� " + tv.channel + "�� �Դϴ�.");
		tv.color = "white";
		tv.power = true;
		System.out.println(tv.power);

	}
}
