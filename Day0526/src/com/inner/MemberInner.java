package com.inner;

public class MemberInner {

	int a = 10;
	private int b = 20;
	static int c = 30;

	class Inner { // 본인의 변수를 사용하지 않아도 외부 클래스의 변수를 사용한다! 댕꿀!
					// static 클래스는 static 변수만 들어올 수 있다.
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
