package q;

public class C {
	int o;

	protected void g() { // 상속하면 가능! 다른 package는 불가능 !
		B b = new B(); // 같은 package내에선 허용 !
//		b.n = 22; // private라 접근 불가능
//		b.g();
		o = 3;
	}
}
