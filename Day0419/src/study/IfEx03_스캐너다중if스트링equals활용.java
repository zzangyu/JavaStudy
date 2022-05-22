package study;


import java.util.*;

public class IfEx03_스캐너다중if스트링equals활용 {

	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		int a, b;
		char c;
		String s;
		
		System.out.print("첫번째 입력 값: ");
		a = sc.nextInt();
		
		System.out.print("연산자 입력: ");
		s=sc.next();
		
		
		System.out.print("두번째 입력 값: ");
		b = sc.nextInt();		
		
		if(s.equals("+")){
			System.out.printf("%d %s %d = %d\n", a, s, b, (a+b));
		
		}else if (s.equals("-")){
			System.out.printf("%d %c %d = %d\n", a, s, b, (a-b));
		
		}else if (s.equals("*")) {
			System.out.printf("%d %c %d = %d\n", a, s, b, (a*b));
			
		}else if (s.equals("/")) {
			System.out.printf("%d %c %d = %d\n", a, s, b, (a/b));
			
		}else if (s.equals("%")) {
			System.out.printf("%d %c %d = %d\n", a, s, b, (a%b));
			
		}else System.out.print("연산자가 아닙니다.");		
		
	}

}