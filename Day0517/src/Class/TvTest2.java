package Class;

public class TvTest2 {

	public static void main(String[] args) {
		Tv tv1 = new Tv("white", false, 23);
		Tv tv2 = new Tv();
		System.out.println("Tv1의 현재 채녈 값은" + tv1.channel + "번 이다.");
		System.out.println("Tv2의 현재 채녈 값은" + tv2.channel + "번 이다.");

		tv2 = tv1; // tv1이 저장하고 있는 주소값을 tv2에 저장한다.
		tv1.channel = 7;
		System.out.println("Tv1의 현재 채녈 값은" + tv1.channel + "번 이다.");
		System.out.println("Tv2의 현재 채녈 값은" + tv2.channel + "번 이다.");
	}

}
