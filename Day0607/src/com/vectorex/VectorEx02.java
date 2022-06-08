package com.vectorex;

import java.util.Vector;

public class VectorEx02 extends Vector {

	public VectorEx02() {
		super(1, 1); // vector의 생성자
	}

	public void addInt(int i) {
		addElement(new Integer(i));
//		addElement(i);
	}

	public void addfloat(float f) {
		addElement(new Float(f));
//		addElement(f);
	}

	public void addString(String s) {
		addElement(s); // String은 객체이기 때문에! 기본 자료형x
	}

	public void addCharArray(char[] a) {
		addElement(a);
	}

	public void write() {
		Object o;
		int length = size(); // size() -> Vector의 메소드
		System.out.println("Number of Vector elements is " + length + " and they are: ");

		// vector의 사이즈가 왜.. 4.. ?

		for (int i = 0; i < length; i++) {
			o = elementAt(i); // 각각의 인덱스를 가져오는 것

			if (o instanceof char[]) {
				System.out.print(String.copyValueOf((char[]) o));
			} else {
				System.out.print(o.toString());
			}

		}
	}

	public static void main(String[] args) {

		VectorEx02 v = new VectorEx02();

		int digit = 5;
		float real = 3.14f;
		char[] letters = { 'J', 'A', 'V', 'A' };
		String s = new String(" is Love !!!!");

		v.addInt(digit);
		v.addfloat(real);
		v.addCharArray(letters);
		v.addString(s);

		v.write();

		// Vector v = new Vector(); -> 빈 벡터 생성, 기본 크기: 10
		// Vector v = new Vector(7); -> 크기: 7
		// Vector v = new Vector(3, 5); -> 앞(3): 초기값 설정, 뒤(5): 모자라면 5개씩 증가
	}

}
