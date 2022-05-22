package DoWhile문;

import java.util.Scanner;

public class DoWhileEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = -1;
		do {
			if(number!=-1) {
			System.out.println("세제곱 값은 " + number * number * number + "입니다.");
			}
			System.out.print("숫자를 입력해주세요. - ");
			number = sc.nextInt();
		} while (number >= 0);
		System.out.println("Thank you! Have Fun!");
	}

}
