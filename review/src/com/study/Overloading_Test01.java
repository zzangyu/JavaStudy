package com.study;

class Boiler {
	String maker; // ������
	int temp; // ���� �µ��� ����

	void tempUp() {
		// �µ� ���
		temp++;
	}

	// �µ��� 20���� �ѹ��� �ø���. overloading !
	void tempUp(int amount) {
		temp = temp + amount;
	}

}

public class Overloading_Test01 {

	public static void main(String[] args) {
		Boiler b = new Boiler();
		System.out.println("���� �µ�: " + b.temp);
		b.tempUp();
		System.out.println("tempUp method ȣ�� �� ���� �µ�: " + b.temp);
		b.tempUp(20);
		System.out.println("tempUp method(20) ȣ�� �� ���� �µ�: " + b.temp);
	}

}
