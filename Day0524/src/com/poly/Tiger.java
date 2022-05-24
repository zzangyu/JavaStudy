package com.poly;

public class Tiger extends Animal {
	private String name;

	public Tiger() {
		name = getClass().getSimpleName(); // name = Dog 랑 똑같은거임
	}

	@Override
	public String scream() {

		return "mola~mola~";
	}

	@Override
	public String getName() {
		return name;
	}
}
