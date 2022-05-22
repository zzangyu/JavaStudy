package study;
/*
 임의의 두 정수와 연산자를 입력받아 산술연산 프로그램을 구현하시오.
 단 산술연산자는 (+, -, *, /, %)
 	모든 입력은 bufferedReader로 처리하시오.
 */
import java.io.*;

public class Test_BufferedReader {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int num1, num2, op;
		
		System.out.print("첫번째 정수: ");
		num1= Integer.parseInt(br.readLine());
		System.out.print("연산자 입력:");
		op = (char)System.in.read();
		System.in.read();
		System.in.read();
		
		System.out.print("두번째 정수: ");
		num2= Integer.parseInt(br.readLine());
		
		System.out.printf("%d %c %d = %d\n", num1, op, num2, (num1+num2));

		
		
		
		
		
	}

}
