package com.poly;

public class Cat extends Animal {
	private String name;

	public Cat() {
		name = getClass().getSimpleName(); // name = Dog �� �Ȱ�������
	}

	@Override
	public String scream() {

		return "MeowMeow";
	}

	@Override
	public String getName() {
		return name;
	}
}
