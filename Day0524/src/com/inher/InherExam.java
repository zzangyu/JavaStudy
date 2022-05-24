package com.inher;

class SuperExam {

	private int a = 5;
	protected int b = 10;
	public int c = 20;

	public void write() {
		System.out.println("super write method: " + a + " : " + b + " : " + c);

	}

	public int getA() {
		return a;
	}

}

class SubExam extends SuperExam {

	protected int b = 100;

	public void print() {
		System.out.println("sub print method: " + super.b + " : " + c);
	}

	public void getWrite() {
		super.write();
	}

	@Override
	public void write() {
		System.out.println("sub write method: " + b + " : " + c);
	}

}

public class InherExam {

	public static void main(String[] args) {
		SubExam se = new SubExam();
		se.write();
		se.print();
		((SuperExam) se).write(); // 부모것을 호출한 것 같지만 자식 method를 사용한 것... but 변수는 부모의 변수 사용.. 이것이 다양성 !
		se.getWrite();

		System.out.println("se.b: " + se.b);
		System.out.println("((SuperExam) se).b: " + ((SuperExam) se).b);

	}

}
