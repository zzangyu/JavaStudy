package Class;

class Car {
	private String color;
	private int speed;

//	public Car(String color, int speed) {
//		this.color = color;
//		this.speed = speed;
//	}

	void upSpeed(int value) {
		speed = speed + value;
	}

	void downSpeed(int value) {
		speed = speed - value;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}

public class ClassEx01 {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println(car1.getSpeed());
		car1.upSpeed(30);
		System.out.println(car1.getColor());
		car1.setColor("Blue");
		System.out.println(car1.getColor());
		System.out.println(car1.getSpeed());
	}

}
