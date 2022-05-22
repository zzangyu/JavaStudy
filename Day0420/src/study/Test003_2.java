package study;
/*
[문제]
사용자로부터 임의의 정수 세개를 입력받아 작은수에서 큰수 순으로 출력하는 프로그램을 작성한다.
 */
import java.util.*;

public class Test003_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, temp=0;
		
		System.out.print("첫번째 정수를 입력해주세요.\n:");
		a = sc.nextInt();
		System.out.print("두번째 정수를 입력해주세요.\n:");
		b = sc.nextInt();
		System.out.print("세번째 정수를 입력해주세요.\n:");
		c = sc.nextInt();
		
		if(a>b) {
			temp = a ;
			a = b;
			b = temp;  
		}
		if(b>c) {
			temp = b;
			b = c; 
			c = temp;
		}
		if(a>c) {
			temp = a;
			a = c;
			c = temp;
		}
		System.out.printf("%d %d %d", a, b, c);
		
	}
		
}
