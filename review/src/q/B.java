package q;

class FinalClass {
	protected final int finalMethod() {
		return 0;
	}
}

class SubClass extends FinalClass {
//	@Override										 // final class - 상속x , final method - override 불가능
//	protected final int finalMethod() {
//		return 0;
//	}
}

public class B {

	private int n;

	private void g() {
//		A a = new A(); // A class가 public이 아니라 import 불가능

		n = 5;
	}
}
