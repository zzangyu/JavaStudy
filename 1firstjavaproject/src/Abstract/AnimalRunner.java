package Abstract;

abstract class Animal{
	abstract void bark();		
}

class Cat extends Animal{

	public void bark() {
		System.out.println("Meow Meow");
	}
	
}

class Dog extends Animal{

	public void bark() {
		System.out.println("Bow Bow");
	}
	
}


public class AnimalRunner {

	public static void main(String[] args) {
		Animal[] animals = {new Cat(), new Dog()};
		for(Animal animal: animals) {
			animal.bark();
		}
		
	}

}
