package review_package1;

final class FinalClass {

}

//class SomeClass extends FinalClass {
// fianl class�� ����� �ȵȴ�.
// final class�� ���� ����
// Ư�� Ŭ������ ���� ��ɼ� Ȯ���� ����ϰ� ���� �ʴٰ� ���� ��, ��� ������ �ٶ��� ���� ��
//}
class SomeClass {
	public void doSomething() {
//		getSomething();
//		setSomething();
//		putSomething();
//		�� Ŭ������ �߻��� Ŭ������� �������� �� final void doSomething()���� ����� �Ǹ�
//		�ڼ� Ŭ���� �� �� ��͵� ���� ������ �ٲٴ� ���� �Ұ����ϴ�.
	}

	final void dosomeOtherthing(final int arg) {
		int a = arg; // �ٸ� ������ ���� �־��ִ� ���� �Ǵµ�
//		arg = 5;	// final int arg���� ���� �־��ִ� ���� �ȵȴ�.
	}
}

class ExtendingClass extends SomeClass {
	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		super.doSomething();
	}

	// final�̶� overriding �� �ȵȴ�.
//	@Override
//	public void dosomeOtherthing() {
//		// TODO Auto-generated method stub
//		super.doSomething();
//
//	}
}

public class FinalNonAccessModifierRunner {

	public static void main(String[] args) {
		final int i;
		i = 5;
//		i = 7;  // final�̶� �ٲ��� �ʴ´�. ���� �ʱ⿡ �ѹ��� �ο� �� �� �ִ�.
	}

}