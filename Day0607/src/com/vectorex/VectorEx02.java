package com.vectorex;

import java.util.Vector;

public class VectorEx02 extends Vector {

	public VectorEx02() {
		super(1, 1); // vector�� ������
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
		addElement(s); // String�� ��ü�̱� ������! �⺻ �ڷ���x
	}

	public void addCharArray(char[] a) {
		addElement(a);
	}

	public void write() {
		Object o;
		int length = size(); // size() -> Vector�� �޼ҵ�
		System.out.println("Number of Vector elements is " + length + " and they are: ");

		// vector�� ����� ��.. 4.. ?

		for (int i = 0; i < length; i++) {
			o = elementAt(i); // ������ �ε����� �������� ��

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

		// Vector v = new Vector(); -> �� ���� ����, �⺻ ũ��: 10
		// Vector v = new Vector(7); -> ũ��: 7
		// Vector v = new Vector(3, 5); -> ��(3): �ʱⰪ ����, ��(5): ���ڶ�� 5���� ����
	}

}
