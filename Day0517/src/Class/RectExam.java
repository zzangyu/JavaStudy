package Class;

import java.util.Scanner;

/*
사각형의 넓이와 둘레를 계산, 클래스로 표현
클래스의 속성: 가로, 세로(넓이, 둘레, 무게, 색깔, 재질)
클래스의 기능: 넓이 계산, 둘레 계산, 가로와 세로 입력 기능, 출력 기능

객체의 구성: 데이터(속성, 상태) + 기능(행위)
클래스의 구성: 멤버변수 + 메소드
 */

class Rect { // 클래스 정의(설계)

//멤버 변수 선언
//전역 변수: 클래스 안에서 활동 가능한 변수(static)
//멤버 변수: 클래스에 소속되어 있는 변수
//인스턴스 변수: 인스턴스가 생성될 때를 의미한다. >> Rect re = new Rect();

	int w, h;

// 메소드 정의 (가로/세로 입력)
// void: 메소드 실행 후 메소드를 호출한 곳에 결과를 돌려줄 필요가 없을 때 사용함
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 입력: ");
		w = sc.nextInt();
		System.out.print("세로 입력: ");
		h = sc.nextInt();
	}

	int area() {
		int result;
		result = w * h;
		return result;
	}

	int length() {
		return 2 * (w + h);
	}

	void print(int a, int i) { // 출력 메소드: 매개변수를 통해 데이터를 넘겨 받음(갖지 있지 않는 데이터), 메소드의 매개 변수는 메소드 내에서만 활동 가능, 변수마다
								// 자료형 따로 지정
		System.out.println("가로: " + w);
		System.out.println("세로: " + h);
		System.out.println("넓이: " + a);
		System.out.println("둘레: " + i);

	}
}

public class RectExam {
	public static void main(String[] args) {
		Rect r = new Rect();
		r.input();
		int a = r.area();
		int b = r.length();
		r.print(a, b);
	}
}