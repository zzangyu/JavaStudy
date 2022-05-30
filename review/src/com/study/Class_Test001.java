package com.study;

/*
 * 지역 변수는 초기화 과정을 거치지 않으면 사용할 수 없다.
 * (자동 초기화 기능을 지원하지 않는다.)
 */
public class Class_Test001 {
	static int c; // 전역변수()
	int d; // 전역변수(인스턴스 멤버변수)
	// 사용하는 과정에서 초기화를 하지 않을 경우 int형은 컴파일러가 자동으로 0으로 초기화 된다.
	// 배열이면 null 값, boolean이면 false

	public static void main(String[] args) {
		int a;
		// System.out.println(a); compile error 뜸 !
		int b = 10;
		System.out.println("b: " + b);
		System.out.println("c: " + c); // static이라 바로 사용 가능 !
		System.out.println("d: " + new Class_Test001().d);

	}

}
