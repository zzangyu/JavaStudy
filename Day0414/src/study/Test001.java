package study;

/*
 * 형 변환
 * 		묵시적 형변환(자동형변환)
 * 			더 큰 자료형으로 변환(자동)
 * 			정보 손실이 없다.
 * 			ex) short a, b;
 * 				  a = b = 10;
 * 				  int c = a + b; (큰거에 들어가는건 상관이 없음 ▶ short가 int에 들어가는 것)
 * 
 * 		명시적 형변환(강제형변환)
 * 			더 작은 자료형으로 변환(명시)
 * 			정보의 손실 가능성이 있다.
 * 			ex) int c = 0;
 * 				  short s = 10;
 * 				  s = c + s; ▶ 에러가 생김
 * 				  s =(short)(c + s); ▶ 요렇게 하면 된다. 하지만 정보의 손실이 있다.. 그리고 무조건 다 되는건 아니다.
 *			boolean형은 형 변환이 안된다.
 * 			byte : char은 casting이다.
 * 			long : float는 자동으로 실수형 처리된다. 실수형은 정수형보다 크므로.
 * 
 * 			기본자료형 -> class화 wrapper
 * 			byte -> Byte
 * 			short -> Short
 * 			int -> Integer
 * 			long -> Long
 * 			char -> Character 
 * 
 */

public class Test001 {

	public static void main(String[] args) {

		// 형변환이란 변수 또는 상수 타입을 다른 타입으로 변환하고자 할 때
		// 변환 방법 ▶ (자료형)(변수명)
		double d = 97.64;
		int score = (int)d;
		System.out.println(d);
		
		int i = 10;
		byte b = (byte)i;
		System.out.println(i);
		
		i = 500;
		b = (byte)i;
		System.out.println(b);
		
		byte z = 1;
		char x = (char)z;
		System.out.println(z);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
