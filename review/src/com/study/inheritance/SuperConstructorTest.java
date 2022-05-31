package com.study.inheritance;

class Sawon2 {
	String name;
	String dept;
	int salary;

	protected Sawon2(String name, String dept, int salary) {
		super(); // ��� java.lang.object��,, ��� class�� �� ���� ����� ����
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	String displayInfo() {
		return "�̸�: " + name + ", �μ�: " + dept + ", ����: " + salary;
	}

}

class Sales2 extends Sawon2 {

	int commition;

	protected Sales2(String name, String dept, int salary, int commition) {
		super(name, dept, salary);
		this.commition = commition;
	}

	@Override
	String displayInfo() {
		return super.displayInfo() + ", ����: " + commition;
	}

}

public class SuperConstructorTest {

	public static void main(String[] args) {
		Sales2 s2 = new Sales2("ȫ�浿", "���ߺ�", 1000000000, 10000000);
		System.out.println(s2.displayInfo());
	}

}
