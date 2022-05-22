package ObjectOriented;

public class Student {

	private int Noclass;
	private int human;

	public Student(int Noclass, int human) {
		this.Noclass = Noclass;
		this.human = human;
	}

	private int team() {

		return 5;
	}

	public String toString() {
		
		return String.format("Number Of class - %d, human - %d, test - %d", Noclass, human, team());
		
		
	}

	
	
	
}
