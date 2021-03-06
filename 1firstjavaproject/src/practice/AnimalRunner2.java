package practice;

abstract class Animal2 {
	abstract void bark2();
}

class Dog2 extends Animal2 {

	@Override
	void bark2() {
		System.out.println("?۸?");
	}

}

class Cat2 extends Animal2 {
	@Override
	void bark2() {
		System.out.println("?߿?");
	}
}

public class AnimalRunner2 {
	public static void main(String[] args) {
		Animal2[] animals = { new Dog2(), new Cat2() };
		for (Animal2 animal2 : animals) {
			animal2.bark2();
		}
	}
}
