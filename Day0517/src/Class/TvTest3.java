package Class;

public class TvTest3 {

	public static void main(String[] args) {
		Tv[] tv;
		tv = new Tv[5];
		for (int i = 0; i < tv.length; i++) {
			tv[i] = new Tv();
			tv[i].channel = i + 10; // TV[i]의 채널에 i+10을 저장함
		}
		for (int i = 0; i < tv.length; i++) {
			tv[i].channelUp();
			System.out.printf("tv[%d].channel = %d\n", i, tv[i].channel);

		}
	}

}
