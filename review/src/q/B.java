package q;

class FinalClass {
	protected final int finalMethod() {
		return 0;
	}
}

class SubClass extends FinalClass {
//	@Override										 // final class - ���x , final method - override �Ұ���
//	protected final int finalMethod() {
//		return 0;
//	}
}

public class B {

	private int n;

	private void g() {
//		A a = new A(); // A class�� public�� �ƴ϶� import �Ұ���

		n = 5;
	}
}
