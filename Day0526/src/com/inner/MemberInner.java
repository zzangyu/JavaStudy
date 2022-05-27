package com.inner;

/*
 * Member Inner Class
 * - 객체를 생성해야지만 사용할 수 있는 멤버들과 같은 위치에 정의 되는 클래스
 * - 이너 클래스의 객체를 생성하려면 외부 클래스의 객체를 생성한 후에 생성할 수 있다.
 *
 * - 이너 클래스 내부에는 static이 존재할 수 없다.
 */
public class MemberInner {

	int a = 10;
	private int b = 20;
	static int c = 30;

	class Inner { // 본인의 변수를 사용하지 않아도 외부 클래스의 변수를 사용한다! 댕꿀!
					// static 클래스는 static 변수만 들어올 수 있다.

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
