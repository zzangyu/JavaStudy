package com.constex;

public class CircleEx {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(10, "원");
		Circle c3 = new Circle(12, "원");
		Circle c4 = new Circle(14, "원");
		Circle c5 = new Circle(16, "원");
		System.out.println("원의 반지름은 " + c2.radius + "이고 이름은 " + c2.name + "이다.");
		System.out.println("원의 반지름은 " + c3.radius + "이고 이름은 " + c3.name + "이다.");
		System.out.println("원의 반지름은 " + c4.radius + "이고 이름은 " + c4.name + "이다.");
		System.out.println("원의 반지름은 " + c5.radius + "이고 이름은 " + c5.name + "이다.");

		System.out.println("원의 넓이는 " + c3.getArea() + "입니다.");
	}

}
