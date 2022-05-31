package q;

public class D extends C {
	void h() {
		C c = new C();
		o = 3; // protected지만 상속하였기 떄문에 사용 가능
	}
}
