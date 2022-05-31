package com.study.inheritance;

class OverridingParents {
	void parentsMethod() {
		System.out.println("parents Method ,,@");
	}
}

class OverridingChild extends OverridingParents {
	@Override
	void parentsMethod() {
//		super.parentsMethod(); // 부모 method까지 같이 쓰고 싶으면 !
		System.out.println("child Method ,,@");
	}
}

/*
 * 오버라이딩(overriding)이 성립할 수 있는 규칙 !
 * 1. 부모클래스와 자식 클래스 사이에서만 성립한다.
 * 2. static 메소드는 클래스에 속하는 method이기 때문에 상속(inheritance) 자체가 안된다.
 * 3. 접근 제한자가 private로 정의된 method는 상속 자체가 불가능하다.
 * 4. interface를 구현해서 method를 overriding할 때는 반드시 접근제한자를 public으로 정의해야한다.
 * 5. 메소드의 인자의 개수와 타입이 완전히 일치해야하고 return타입까지 일치해야한다.
 * 6. 부모 class의 method의 접근제한자보다 더 좁아질 수 없다. ( ex)부모가 public인데 자식이 protected인 경우 // public>protected>default>private)
 * 7. 부모 class의 method보다 더 많은 예외를 던질 수 없다.
 * 8. final <- 예약어가 지정된 메소드는 오버라이딩이 될 수 없다.
 */


public class OverridingTest {

	public static void main(String[] args) {
		OverridingChild child = new OverridingChild();
		child.parentsMethod();
	}

}
