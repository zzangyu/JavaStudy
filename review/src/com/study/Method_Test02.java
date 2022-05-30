package com.study;

import java.util.Scanner;

class Rect { // �簢�� class
	// �Ӽ�(Member Variable)�� ���(Member Method)�� �����Ѵ�.

	// ���� ����(����/����) - ���� ����(class variable, instance variable)
	int w, h; // ���� �Ǵ� ���� JVM�� �ִ� stack�� ����

	// method ����: method �̸��� ���س��� �� ex) abstract void aa();
	// method ����: �̸��Ӹ� �ƴ� method body�ȿ� ��ɵ鵵 ���� �� ���� ��

	// ��ȯ��
	// void ��ȯ�� - ��ȯ ���� ������ �ǹ��� (���� �� ���� ����.)
	// ��ȯ - method ���� �� ��� ���� ȣ���� ������ return �ϴ� ���� ��ȯ�̶�� �Ѵ�.
	void input() {
		// �ν��Ͻ�(��ü, ��������) ���� - �ּҰ� ����
		Scanner sc = new Scanner(System.in);
		// System.in -> Console�� �Է��Ѵٴ� ���� �ǹ�, in == inputStream, out == outputStream
		System.out.print("���� �Է�: ");
		w = sc.nextInt();
		System.out.print("���� �Է�: ");
		h = sc.nextInt();
	}

	// ���� ��� - method ���� �� ��� �ִ� ���(return��) return �ڷ����� int���� ����Ѵ�.

	public int area() {
		int result = w * h;
		return result;
		// method�� return���� ���ؼ��� ��� ���� ��ȯ�Ѵ�.
	}

	// �ѷ�
	int length() {
		return (w + h) * 2;
	}

	// ��� method
	void print(int a, int b) {
		// �Ű������� ���� �����͸� �Ѱ� ����(���� ���� ���� ������)
		a = area();
		b = length();
		System.out.println("����: " + w + ", ����: " + h);
		System.out.println("����: " + a + ", �ѷ�: " + b);

	}
}

// ���� class
public class Method_Test02 {

	public static void main(String[] args) {
		Rect r = new Rect(); // create instance
		r.input(); // method call

		int a = r.area();
		int b = r.length();

		r.print(a, b);

	}

}
