package com.constex;

public class CircleEx2 {

	static int radius;

	static void set(int r) {
		radius = r;
		System.out.println(radius);
	}

	public CircleEx2() {

	}

	void set2(int r) {
		radius = r;
	}

	public CircleEx2(int r) {
		radius = r;
	}

	public static void main(String[] args) {
		set(20);
		CircleEx2 c = new CircleEx2(22);
		System.out.println(c.radius);

	}

}
