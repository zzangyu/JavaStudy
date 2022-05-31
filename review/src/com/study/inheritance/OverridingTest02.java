package com.study.inheritance;

class OverridingPatents2 {
	int money = 20;

	void parentsMethod() {
		System.out.println("parents Method ,, @");
	}
}

class OverridingChild2 extends OverridingPatents2 {
	String money = "20원";

	@Override
	void parentsMethod() {
		System.out.println("overriding Method ,, @");
	}

}

public class OverridingTest02 {

	public static void main(String[] args) {
		OverridingChild2 child = new OverridingChild2();

		child.money = "30원";
		// child.money = 10; // 부모꺼! 변수 type은 바뀌어도 된다 !
		System.out.println(child.money); // 부모의 money는 은닉된다. (ㅠ..ㅠ)
	}

}
