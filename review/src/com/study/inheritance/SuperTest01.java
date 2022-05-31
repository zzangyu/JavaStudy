package com.study.inheritance;

class Sawon {
	String name;
	String dept;
	int salary;

	String displayInfo() {
		return "이름: " + name + ", 부서: " + dept + ", 연봉: " + salary;
	}
}

class Sales extends Sawon {

	int commition;

	@Override
	String displayInfo() {
		return super.displayInfo() + ", 수당: " + commition;
	}
}

public class SuperTest01 {

	public static void main(String[] args) {
		Sales sales = new Sales();
		System.out.println(sales.displayInfo());
	}

}
