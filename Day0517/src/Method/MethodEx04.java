package Method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodEx04 {

	public static int plus(int x, int y) {
		return x + y;
	}

	public static int min(int x, int y) {
		return x - y;
	}

	public static int multi(int x, int y) {
		return x * y;
	}

	public static int div(int x, int y) {
		return x / y;
	}

	public static int per(int x, int y) {
		return x % y;
	}

	public static void display(int a, char b, int c, int d) { // a: 첫번째 수 b: 연산자 c: 두번째 수 d: 결과 값
		System.out.println("\n " + a + " " + b + " " + c + " = " + d);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int su1 = 0, su2 = 0, tot = 0;
		char yon = 0;

		System.out.println("첫번째 수: ");
		su1 = Integer.parseInt(br.readLine());
		do {
			System.out.println("yon(+,-,*,/,%): ");
			yon = (char) System.in.read();
//			System.in.read();
//			System.in.read();

			System.in.skip(2);
		} while (yon != '+' && yon != '-' && yon != '*' && yon != '/' && yon != '%');
		System.out.println("두번째 수: ");
		su2 = Integer.parseInt(br.readLine());

		switch (yon) {
		case '+':
			tot = plus(su1, su2);
			break;
		case '-':
			tot = min(su1, su2);
			break;
		case '/':
			tot = div(su1, su2);
			break;
		case '*':
			tot = multi(su1, su2);
			break;
		case '%':
			tot = per(su1, su2);
			break;
		}
		display(su1, yon, su2, tot);
	}

}
