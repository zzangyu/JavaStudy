package com.study.inheritance;

class Super { // 아빠(나)
	int x = 90;

	void SuperMethod() {
		System.out.println("Super Method ,, @");
	}
}

class Sub extends Super { // 아들
	int y = 10;

	void SubMethod() {
		System.out.println("Sub Method ,, @");
	}
}

class Subsub extends Sub { // 손자
	int z = 20; // 상속에 상속을 받아서 x, y, z 모두 사용 가능

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
