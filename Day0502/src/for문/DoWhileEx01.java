package for문;

import java.util.Scanner;

public class DoWhileEx01 {

	public static void main(String[] args) {
		int a = 1 , sum = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("숫자를 입력해주세용~ ☞ ");
			a = sc.nextInt();
			sum += a;
			System.out.println("현재 입력 된 정수들의 합은 "+sum+"입니다.");
	
		} while(a!=0);
			System.out.print("0이 입력되어 종료됩니다. 입력 된 정수들의 합은 "+sum+"입니다.");
		
		

	}

}
