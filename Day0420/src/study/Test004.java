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

public class Test004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int a, a1 ,b , b1, c, c1 ,d , d1, e, e1, f, f1, g, g1, h, h1;
		
		System.out.print("금액 입력");
		i = sc.nextInt();
		
		a=i/50000;
		a1=i%50000;
		
		b=a1/10000;
		b1=a1%10000;
		
		c=b1/1000;
		c1=b1%1000;
		
		d=c1/100;
		d1=c1%100;
		
		
		e=d1/50;
		e1=d1%50;
		
		f=e1/10;
		f1=e1%10;
		
		g=f1/1;
		g1=f1%1;
		
		System.out.printf("%d는 아래로 구성\n", i);
		System.out.println("오만원권"+a+"매");
		System.out.println("만원권"+b+"매");
		System.out.println("천원권"+c+"매");
		System.out.println("백원 동전"+d+"개");
		System.out.println("오십원 동전"+e+"개");
		System.out.println("십원 동전"+f+"개");
		System.out.println("일원 동전"+g+"개");
		
		
		
	}

}
