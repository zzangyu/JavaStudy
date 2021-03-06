package com.constex;

/*
this: 객체 자신으르
 */
class CircleEx001 {
	int radius;

	public CircleEx001() {
		this(10); // this = 기본 생성자가 아닌 다른 생성자를 부를 때 사용한다.
	}

	public CircleEx001(int r) {
		this(10, 10);
	}

	public CircleEx001(int r, int a) {
		this(10, 10, 10);
		this.radius = r;
	}

	public CircleEx001(int r, int a, int b) {
		this.radius = r;
	}

	public int getRadius() {
		return radius;
	}
}

public class ThisEx01 {

	public static void main(String[] args) {

		CircleEx001 c = new CircleEx001();
		System.out.println(c.getRadius());

		CircleEx001 c2 = new CircleEx001(5);
		System.out.println(c2.getRadius());

	}

}
