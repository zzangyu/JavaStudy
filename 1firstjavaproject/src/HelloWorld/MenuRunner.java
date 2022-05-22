package HelloWorld;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Type obj = new Type(argument);
		
		System.out.println("Enter Number1: ");
		int number1 = sc.nextInt();
		System.out.println("Enter Number2: ");
		int number2 = sc.nextInt();
		System.out.println("Choices Available are ");
		System.out.println("1 - Add, 2 - Subtract, 3 - Divide, 4 - Muliply ");
		String choice = sc.next();
		
		System.out.println("Your Choices are");
		System.out.println("Number1 "+number1);
		System.out.println("Number2 "+number2);
		
		switch (choice) {
		case "1":
			System.out.println("Result is "+(number1+number2));
			break;
		case "2":
			System.out.println("Result is "+(number1-number2));
			break;
		case "3":
			System.out.println("Result is "+(number1/number2));
			break;
		case "4":
			System.out.println("Result is "+(number1*number2));
			break;
		default:
			System.out.println("please choice a operation again");
			break;
		}
		}
		
		

	}
