package DoWhile��;

import java.util.Scanner;

public class DoWhileEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = -1;
		do {
			if(number!=-1) {
			System.out.println("������ ���� " + number * number * number + "�Դϴ�.");
			}
			System.out.print("���ڸ� �Է����ּ���. - ");
			number = sc.nextInt();
		} while (number >= 0);
		System.out.println("Thank you! Have Fun!");
	}

}
