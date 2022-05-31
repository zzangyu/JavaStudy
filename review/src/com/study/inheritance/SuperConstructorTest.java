package com.study.inheritance;

class Sawon2 {
	String name;
	String dept;
	int salary;

	protected Sawon2(String name, String dept, int salary) {
		super(); // 얘는 java.lang.object임,, 모든 class는 맨 위에 요놈이 있음
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	String displayInfo() {
		return "이름: " + name + ", 부서: " + dept + ", 연봉: " + salary;
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
		return super.displayInfo() + ", 수당: " + commition;
	}

}

public class SuperConstructorTest {

	public static void main(String[] args) {
		Sales2 s2 = new Sales2("홍길동", "개발부", 1000000000, 10000000);
		System.out.println(s2.displayInfo());
	}

}
