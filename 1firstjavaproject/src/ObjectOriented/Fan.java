package ObjectOriented;

public class Fan {
	
	private String make;
	private double radius;
	private String color;
	
	private boolean isOn;
	private byte speed; //0 to 5
	
	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	
	}
	
	public void switchOn(){
		this.isOn = true;
		setSpeed((byte)1);
	}
	
	public void switchOff(){
		this.isOn = false;
		setSpeed((byte)0);
	}
	
	public void setSpeed(byte speed) {
		this.speed = speed;
	}
	
	public String toString() {
//		return "make -"+make+"radius -"+radius+"color - "+color+"isOn -"+isOn+"speed - "+speed;
		return String.format("make - %s, radius - %f, color - %s\nisOn - %b, speed - %d", make, radius, color, isOn, speed);
	
	}

}
