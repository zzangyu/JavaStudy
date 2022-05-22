package study;


/*
임의의 정수를 입력 받아 입력받은 수가 짝수인지 판정하시오.
 */

import java.util.*;

public class IfEx01_스캐너다중if활용 {

	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		int a, b;
		char c;
		
		System.out.print("첫번째 입력 값: ");
		a = sc.nextInt();
		
		System.out.print("연산자 입력: ");
		c = sc.next().charAt(0); // sc.next()까지는 문자열. 첫번째 인덱스만 가져오게 하는 것이다. ▶ 문자 첫번째 자리만 가져와진다.
		
		System.out.print("두번째 입력 값: ");
		b = sc.nextInt();		
		
		if(c == '+'){
			System.out.printf("%d %c %d = %d\n", a, c, b, (a+b));
		
		}else if (c == '-'){
			System.out.printf("%d %c %d = %d\n", a, c, b, (a-b));
		
		}else if (c == '*') {
			System.out.printf("%d %c %d = %d\n", a, c, b, (a*b));
			
		}else if (c == '/') {
			System.out.printf("%d %c %d = %d\n", a, c, b, (a/b));
			
		}else if (c == '%') {
			System.out.printf("%d %c %d = %d\n", a, c, b, (a%b));
			
		}else System.out.print("연산자가 아닙니다.");		
		
	}

}