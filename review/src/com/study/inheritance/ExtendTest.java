package com.study.inheritance;

class Parents {
	int parentsVariable = 10;

	void parentsMethod() {
		System.out.println("Parents Method .. @");
	}

}

class Child extends Parents {
	int childVariable = 20;

	void childMethod() {
		System.out.println("chile Method .. @");

	}

}

public class ExtendTest {

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.childVariable);
		c.childMethod();
		System.out.println(c.parentsVariable);
		c.parentsMethod();

		System.out.println("ªÃ'^'ªÃ   '-'@,, ");
	}

}
