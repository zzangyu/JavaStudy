package com.study;

public class Overloading_Test02 {

	public int area(int w, int h) {
		return w * h;
	}

	public double area(int r) { // 이것도 overloading이다.
		return r * r * r * 3.141592;
	}

	public void write(int result) {
		System.out.println("사각형의 넓이: " + result + "cm²");
	}

	public void write(double result) {
		System.out.println("원의 넓이: " + result + "cm³");
	}

	public static void main(String[] args) {
		Overloading_Test02 ot = new Overloading_Test02();
		int res = ot.area(5, 7);
		double cc = ot.area(10);

		ot.write(res);
		ot.write(cc);

	}

}
