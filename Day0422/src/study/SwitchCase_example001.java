package study;

/*
[문제]
두 정수와 연산자를 입력받아서 계산하는 프로그램을 구현
switch~case 사용
 */

import java.io.*;

public class SwitchCase_example001 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1, num2, total=0;
		char op;

		System.out.print("첫번째 정수: ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("연산자 입력: ");
		op = (char) System.in.read();
			System.in.read();
			System.in.read();
		System.out.print("두번째 정수: ");
		num2 = Integer.parseInt(br.readLine());

		switch (op) {
		case '+':
			total = num1+num2;
			System.out.println(num1+"+"+num2+"="+total);
			break;
		case '-':
			total = num1-num2;
			System.out.println(num1+"-"+num2+"="+total);
			break;
		case '*':
			total = num1*num2;
			System.out.println(num1+"*"+num2+"="+total);
			break;
		case '/':
			total = num1/num2;
			System.out.println(num1+"/"+num2+"="+total);
			break;
		case '%':
			total = num1%num2;
			System.out.println(num1+"%"+num2+"="+total);
			break;
		default:
			System.out.print("삐비빅! 삐빅! 삐빅! 잘못된 연산자를 입력하셨습니다.");
			break;
		}
		
	}

}
