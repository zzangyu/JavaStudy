package HelloWorld;

public class MotorBike {

	private int speed; // ����ũ�� ����

	MotorBike(){
		//this.speed = 5;
		this(5);
	}
	
	MotorBike(int speed){
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0)
			this.speed = speed;
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

}
