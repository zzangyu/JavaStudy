package study;
/*
[문제]
두개의 정수와 배수 n값을 입력받아 두 수 사이의 n값의 배수의 합을 구하는 프로그램을 작성하시오.
 */
import java.util.*;
public class for문Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num1_n, num2, sum=0;
		System.out.println("첫번째 정수");
		num1=sc.nextInt();
		System.out.println("두번째 정수");
		num2=sc.nextInt();
		System.out.println("배수를 입력해주세요.");
		num1_n=sc.nextInt();
		
		if(num1>num2) {
			num1=num1^num2;
			num2=num2^num1;
			num1=num1^num2;
		}
		
		for(;num1<=num2;num1++) {
				if(num1%num1_n==0) {
				sum=sum+num1;		
				System.out.println(num1+", "+sum);
	     	}
		}		
		
	}

}
