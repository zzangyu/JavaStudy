package com.inner;

public class MemberInner {

	int a = 10;
	private int b = 20;
	static int c = 30;

	class Inner { // ������ ������ ������� �ʾƵ� �ܺ� Ŭ������ ������ ����Ѵ�! ���!
					// static Ŭ������ static ������ ���� �� �ִ�.
		int d = 30;

		public void prt() {
			System.out.println("a: " + a);
			System.out.println("b: " + b);
			System.out.println("c: " + c);

		}
	}

	public static void main(String[] args) {
		MemberInner.Inner mi = new MemberInner().new Inner();
		mi.prt();
	}

}
