package pizza;

public class Circle {

	int radius; // 원의 반지름 필드
	String name; // 원의 이름 필드

	public Circle() {

	}

	public double getArea(int radius) { // 원의 면적을 구하는 메소드 , 반지름*반지름*3.14
		return radius * radius * Math.PI;
	}

}
