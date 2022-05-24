package com.poly;

public class Dog extends Animal {
	private String name;

	public Dog() {
		name = getClass().getSimpleName(); // name = Dog 랑 똑같은거임
	}

	@Override
	public String scream() {

		return "BowBow";
	}

	@Override
	public String getName() {
		return name;
	}

}
