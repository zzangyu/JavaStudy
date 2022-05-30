package com.study;

import java.util.Scanner;

class Rect { // 사각형 class
	// 속성(Member Variable)과 기능(Member Method)을 정의한다.

	// 변수 선언(가로/세로) - 전역 변수(class variable, instance variable)
	int w, h; // 선언 되는 순간 JVM에 있는 stack에 저장

	// method 선언: method 이름만 말해놓은 것 ex) abstract void aa();
	// method 정의: 이름뿐만 아닌 method body안에 기능들도 정의 해 놓은 것

	// 반환형
	// void 반환형 - 반환 값이 없음을 의미함 (돌려 줄 값이 없다.)
	// 반환 - method 실행 후 결과 값을 호출한 곳으로 return 하는 것을 반환이라고 한다.
	void Input() {
		// 인스턴스(객체, 참조변수) 생성 - 주소값 저장
		Scanner sc = new Scanner(System.in);
		// System.in -> Console에 입력한다는 것을 의미, in == inputStream, out == outputStream
		System.out.print("가로 입력: ");
		w = sc.nextInt();
		System.out.print("세로 입력: ");
		h = sc.nextInt();
	}
}

// 실행 class
public class Method_Test02 {

	public static void main(String[] args) {
		Rect r = new Rect(); // create instance
		r.Input(); // method call

	}

}
