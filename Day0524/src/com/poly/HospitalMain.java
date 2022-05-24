package com.poly;

public class HospitalMain {

	public static void main(String[] args) {

		Hospital hos = new Hospital();

		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal tiger = new Tiger();

		hos.inject(dog);
		hos.inject(cat);
		hos.inject(tiger);

	}

}
