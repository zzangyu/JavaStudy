package com.study.inheritance;

class OverridingPatents2 {
	int money = 20;

	void parentsMethod() {
		System.out.println("parents Method ,, @");
	}
}

class OverridingChild2 extends OverridingPatents2 {
	String money = "20��";

	@Override
	void parentsMethod() {
		System.out.println("overriding Method ,, @");
	}

}

public class OverridingTest02 {

	public static void main(String[] args) {
		OverridingChild2 child = new OverridingChild2();

		child.money = "30��";
		// child.money = 10; // �θ�! ���� type�� �ٲ� �ȴ� !
		System.out.println(child.money); // �θ��� money�� ���еȴ�. (��..��)
	}

}
