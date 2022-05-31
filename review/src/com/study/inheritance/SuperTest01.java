package com.study.inheritance;

class Sawon {
	String name = "»×»§";
	String dept = "Å©Å©·ç»æ»Í";
	int salary = 2000000;

	String displayInfo() {
		return "ÀÌ¸§: " + name + ", ºÎ¼­: " + dept + ", ¿¬ºÀ: " + salary;
	}
}

class Sales extends Sawon {

	int commition = 10000000;

	@Override
	String displayInfo() {
		return super.displayInfo() + ", ¼ö´ç: " + commition;
	}
}

public class SuperTest01 {

	public static void main(String[] args) {
		Sales sales = new Sales();
		System.out.println(sales.displayInfo());
	}

}
