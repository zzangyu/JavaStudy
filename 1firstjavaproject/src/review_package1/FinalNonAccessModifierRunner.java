package review_package1;

final class FinalClass {

}

//class SomeClass extends FinalClass {
// fianl class라 상속이 안된다.
// final class를 쓰는 이유
// 특정 클래스에 대해 기능성 확장을 허용하고 싶지 않다고 느낄 때, 기능 수정을 바라지 않을 때
//}
class SomeClass {
	public void doSomething() {
//		getSomething();
//		setSomething();
//		putSomething();
//		이 클래스가 추상적 클래스라고 가정했을 때 final void doSomething()으로 만들게 되면
//		자손 클래스 중 그 어떤것도 실행 순서를 바꾸는 것은 불가능하다.
	}

	final void dosomeOtherthing(final int arg) {
		int a = arg; // 다른 변수에 값을 넣어주는 것은 되는데
//		arg = 5;	// final int arg에는 값을 넣어주는 것이 안된다.
	}
}

class ExtendingClass extends SomeClass {
	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		super.doSomething();
	}

	// final이라 overriding 도 안된다.
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
//		i = 7;  // final이라 바뀌지 않는다. 값은 초기에 한번만 부여 될 수 있다.
	}

}
