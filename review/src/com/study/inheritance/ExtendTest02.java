package com.study.inheritance;

class Super { // �ƺ�(��)
	int x = 90;

	void SuperMethod() {
		System.out.println("Super Method ,, @");
	}
}

class Sub extends Super { // �Ƶ�
	int y = 10;

	void SubMethod() {
		System.out.println("Sub Method ,, @");
	}
}

class Subsub extends Sub { // ����
	int z = 20; // ��ӿ� ����� �޾Ƽ� x, y, z ��� ��� ����

	void SubsubMethod() {
		System.out.println("Subsub Method ,, @");
	}
}

public class ExtendTest02 {

	public static void main(String[] args) {
		Subsub sbsb = new Subsub();
		System.out.println("x: " + sbsb.x + ", y: " + sbsb.y + ", z: " + sbsb.z);
		sbsb.SuperMethod();
		sbsb.SubMethod();
		sbsb.SubsubMethod();
	}
}
