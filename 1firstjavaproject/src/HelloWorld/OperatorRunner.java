package HelloWorld;

import java.util.Scanner;

public class OperatorRunner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Type obj = new Type(argument);
		char ch ;
		
		System.out.println("Enter Number1: ");
		int number1 = sc.nextInt();
		System.out.println("Enter Number2: ");
		int number2 = sc.nextInt();
		System.out.println("Enter Operator: ");
		ch = sc.next().charAt(0);
		
		switch (ch) {
		case '+':
			System.out.println(number1+number2);
			break;
		case '-':
			System.out.println(number1-number2);
			break;
		case '*':
			System.out.println(number1*number2);
			break;
		case '/':
			System.out.println(number1/number2);
			break;
		default:
			break;
		}
		

	}

}
