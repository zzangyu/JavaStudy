package practice;

public class FlyableRunner {
	public static void main(String[] args) {
		Flyablee[] flyingObjects = { new Bird(), new Aeroplane() };
		for (Flyablee flyablee : flyingObjects) {
			flyablee.fly();
		}

	}
}
