package study;

/*
[문제]
임의의 정수로 돈의 금액을 입력 받아서 오만원권, 만원권, 천원권, 오백원 동전, 백원 동전, 오십원 동전, 십원 동전, 일원 동전
각 몇개로 변환되는지를 출력하는 프로그램을 구현하시오.
안내멘트
금액 입력:
입력 금액: 65376 
*/
import java.util.Scanner;

public class Test005 {
	
	final static int a = 50000;
	final static int b = 10000;
	final static int c = 1000;
	final static int d = 500;
	final static int e = 100;
	final static int f = 10;
	final static int g = 1;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, res, a1, b1, c1, d1, e1, f1, g1;
		
		
		res = 0;
		System.out.print("금액 입력");
		i = sc.nextInt();
		
		
		
		if (i > 0) {
			a1 = i / a;
			res = i % a;
			System.out.println("오만원권" + a1 + "매");
		}
		if (i > 0) {
			b1 = res / b;
			res = res % b;
			System.out.println("만원권" + b1 + "매");
		}
		if (i > 0) {
			c1 = res / c;
			res = res % c;
			System.out.println("천원권" + c1 + "매");
		}
		if (i > 0) {
			d1 = res / d;
			res = res % d;
			System.out.println("500원 동전 " + d1 + "개");
		}
		if (i > 0) {
			e1 = res / e;
			res = res % e;
			System.out.println("100원 동전 " + e1 + "개");
		}
		if (i > 0) {
			f1 = res / f;
			res = res % f;
			System.out.println("10원 동전 " + f1 + "개");
		}
		if (i > 0) {
			g1 = res / g;
			res = res % g;
			System.out.println("1원 동전 " + g1 + "개");
		}
	}
}
