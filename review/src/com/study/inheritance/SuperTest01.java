package com.study.inheritance;

class Sawon {
	String name;
	String dept;
	int salary;

	String displayInfo() {
		return "�̸�: " + name + ", �μ�: " + dept + ", ����: " + salary;
	}
}

class Sales extends Sawon {

	int commition;

	@Override
	String displayInfo() {
		return super.displayInfo() + ", ����: " + commition;
	}
}

public class SuperTest01 {

	public static void main(String[] args) {
		Sales sales = new Sales();
		System.out.println(sales.displayInfo());
	}

}