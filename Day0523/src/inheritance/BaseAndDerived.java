package inheritance;

class Base {
	public Base() {
		System.out.println("부모다.");
	}
}

class Derived extends Base {
	public Derived() {
		super(); // 자동일 때는 부모 클래스에 기본 생성자(매개변수가 없는 생성자)가 반드시 정의되어 있어야 한다.
		System.out.println("자식이다.");
	}

	public void aa() {
		System.out.println("나도다");
	}
}

public class inheritanceEx01 {

	public static void main(String[] args) {
		Derived a = new Derived();
		Base b = new Derived(); // 상형 형변환, upcasting
	}

}
