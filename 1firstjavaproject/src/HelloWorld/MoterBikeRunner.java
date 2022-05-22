package HelloWorld;

public class MoterBikeRunner {

	public static void main(String[] args) {
		
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(200);
		MotorBike somethingElse = new MotorBike();
		
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(somethingElse.getSpeed());
		
		//ducati.setSpeed(100);
		
		ducati.decreaseSpeed(100);
		honda.decreaseSpeed(100);
		
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(somethingElse.getSpeed());
		
		
	}

}
