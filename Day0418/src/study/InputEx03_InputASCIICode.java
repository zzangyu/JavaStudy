package study;

/*

숫자 하나 입력
	System.in.read() - 48 or '0' 

 */

import java.io.IOException;
public class InputEx03_InputASCIICode {

	public static void main(String[] args) throws IOException{
		
		int num1;
		int num2;
		System.out.print("숫자 1: ");
		num1 = System.in.read() - 48;
		System.in.read(); // \r 엔터키를 의미한다.
		System.in.read(); // \n 줄이 바뀐다.
		System.out.print("숫자 2: ");
		num2 = System.in.read() - 48;
		
		
		System.out.println(num1); // 10 넣으면 1이 나온다. 숫자 2개 이상 인식이 안되고 맨 앞 숫자만 나온다.
		System.out.println(num2);
		System.out.println(num1+", "+num2);
		
	}

}
