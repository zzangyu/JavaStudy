package inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class AClass {
	protected int x, y;
	protected char ch;

	public AClass() {

	}

	public void write(double result) {
		System.out.printf("%d %c %d = %.2f\n", x, ch, y, result);
	}

}

class BClass extends AClass {
	// 데이터 입력 기능(메소드)
	boolean input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("임의의 두 정수 입력(공백 구분): ");
		String temp = br.readLine(); // "20 15" 이렇게 입력해도 됨 (line이라)
		String[] str = temp.split("\\s");

		if (str.length != 2)
			return false;

		x = Integer.parseInt(str[0]);
		y = Integer.parseInt(str[1]);

		System.out.print("연산자 입력[+-*/]: ");
		ch = (char) System.in.read();
		if (ch == '+' || ch == '-' || ch == '*' || ch == '/')
			return true;

		return false;
	}

	// 연산 및 처리 기능
	public double calc() {
		double result = 0;
		switch (ch) {
		case '+':
			result = x + y;
			break;
		case '-':
			result = x - y;
			break;
		case '*':
			result = x * y;
			break;
		case '/':
			result = x / y;
			break;
		}
		return result;
	}
}

public class InheritanceEx02 {

	public static void main(String[] args) throws IOException {
		BClass bc = new BClass();
		if (!bc.input()) {
			System.out.println("Error!!!!");
		}
		double result = bc.calc();
		bc.write(result);
	}

}
