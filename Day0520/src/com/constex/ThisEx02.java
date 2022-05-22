package com.constex;

public class ThisEx02 {

	int aa;

	public ThisEx02() {
	}

	public ThisEx02(int a) {
		this.aa = a;
	}

	public void setAa(int aa) {
		this.aa = aa;
	}

	public int getAa() {
		return aa;
	}

	public static void main(String[] args) {
		ThisEx02 t = new ThisEx02();
		ThisEx02 t1 = new ThisEx02(1);
		ThisEx02 t2 = new ThisEx02(2);
		ThisEx02 t3 = new ThisEx02(3);

		System.out.println("t1 - [" + t1.aa + "], t2 - [" + t2.aa + "], t3 - [" + t3.aa + "]");
		t1.setAa(4);
		t2.setAa(5);
		t3.setAa(6);
		System.out.println("t1 - [" + t1.aa + "], t2 - [" + t2.aa + "], t3 - [" + t3.aa + "]");

		System.out.println(t1.getAa());
	}

}
