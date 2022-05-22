package partice;

import java.util.Scanner;
public class isWeekDay {

	public static void main(String[] args) {
		

		int dayNumber;
		Scanner sc = new Scanner(System.in);
		System.out.println("0 - Monday, 1 - Tuesday, 2 - Wednesday, 3 - Thursday, 4 - Friday, 5 - Saturday, 6 - Sunday");
		System.out.print("choice day - ");
		dayNumber = sc.nextInt();
		
		switch (dayNumber) {
		case 0:
			System.out.println("Monday");
			break;
		case 1:
			System.out.println("Tuesday");
			break;
		case 2:
			System.out.println("Wednesday");
			break;
		case 3:
			System.out.println("Thursday");
			break;
		case 4:
			System.out.println("Friday");
			break;
		case 5:
			System.out.println("Saturday");
			break;
		case 6:
			System.out.println("Sunday");
			break;	
		default:
			System.out.println("choice again");
			break;
		}
		
		
		
	}

}
