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
	void input() {
		// 인스턴스(객체, 참조변수) 생성 - 주소값 저장
		Scanner sc = new Scanner(System.in);
		// System.in -> Console에 입력한다는 것을 의미, in == inputStream, out == outputStream
		System.out.print("가로 입력: ");
		w = sc.nextInt();
		System.out.print("세로 입력: ");
		h = sc.nextInt();
	}

	// 넓이 계산 - method 실행 후 결과 있는 경우(return형) return 자료형은 int형을 사용한다.

	public int area() {
		int result = w * h;
		return result;
		// method는 return문을 통해서만 결과 값을 반환한다.
	}

	// 둘레
	int length() {
		return (w + h) * 2;
	}

	// 출력 method
	void print(int a, int b) {
		// 매개변수를 통해 데이터를 넘겨 받음(갖고 있지 않은 데이터)
		a = area();
		b = length();
		System.out.println("가로: " + w + ", 세로: " + h);
		System.out.println("넓이: " + a + ", 둘레: " + b);

	}
}

// 실행 class
public class Method_Test02 {

	public static void main(String[] args) {
		Rect r = new Rect(); // create instance
		r.input(); // method call

		int a = r.area();
		int b = r.length();

		r.print(a, b);

	}

}
