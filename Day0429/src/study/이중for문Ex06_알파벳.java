package study;

/*
[문제]
Scanner를 이용하여 소문자 알파벳을 하나 입력 받고
다음과 같이 풀력하는 프로그램을 작성하시오
알파벳 입력 : e
abcde
abcd
abc
ab
a
 */
import java.util.Scanner;
public class 이중for문Ex06_알파벳 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c;
		
		System.out.print("알파벳을 입력 해주세요.");
		c = sc.next().charAt(0);
		
		for(char i = c; i>='a'; i--) {
		for(char j = 'a'; j<=i; j++) {
			
			
			System.out.print(j);
			}
			System.out.println();
		}
		
		

	}

}
