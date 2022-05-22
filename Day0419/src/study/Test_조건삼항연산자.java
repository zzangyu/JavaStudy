package study;
/*
 [문제]
 사용자로부터 임의의 정수를 입력받아 입력받은 정수가 짝수인지 홀수인지를 판정하는 프로그램을 작성하시오.
 단, 조건삼항연산자를 이용하여 처리하시오.
 */

import java.util.*;

public class Test_조건삼항연산자 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int a;
		String s;	
		
		System.out.print("임의의 정수를 입력하시오.\n:");
		a = sc.nextInt();
		
		s = (a%2==0)?"짝수":"홀수";
		System.out.printf("사용자님께서 입력하신 정수 %d은(는) %s입니다.", a, s);
				
		}
		
	}
