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

	final void dosomeOtherthing() {
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

	}

}
