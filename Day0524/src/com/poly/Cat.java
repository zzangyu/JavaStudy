package com.poly;

public class Cat extends Animal {
	private String name;

	public Cat() {
		name = getClass().getSimpleName(); // name = Dog 랑 똑같은거임
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
