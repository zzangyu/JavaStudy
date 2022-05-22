package study;
/*
[문제]
사칙 연산을 입력받아 계산하는 프로그램을 작성하시오.
연산자는 +,-,*,/ 네가지로 모두 처리한다.
피연산자와 연산자는 빈칸으로 분리하여 입력
0으로 나누기 시 "0으로 나눌 수 없습니다." 를 출력하고 종료한다.
scanner를 사용하여 문자열로 입력받으시오.
 */
import java.util.*;
public class switchcase연산자프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, result;
		String c;
		result = 0;
		
		System.out.println("첫번째 정수 입력");
		a = sc.nextInt();
		System.out.println("연산자 입력");
		c= sc.next();
		System.out.println("두번째 정수 입력");
		b = sc.nextInt();
		
		switch (c) {
		case "+":
			result = (a+b);
			break;
		case "-":
			result = (a-b);			
			break;
		case "/":
			if(b==0) {
				System.out.println("계산 불가능");
				return;
			}
			result = (a/b);			
			break;
		case "*":
			result = (a*b);
			break;
		default :
			System.out.println("사칙 연산이 아닙니다.");
		}
		System.out.printf("%d %s %d =%d", a, c, b, result);
	}

}
