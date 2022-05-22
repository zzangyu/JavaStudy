package study;

/*
입력된 정수의 평균을 구하는 프로그램을 구현하시오.
1. 제일 먼저 입력할 정수의 개수를 사용자로부터 입력 받는다.
2. 	입력받은 수 만큼 평균값을 구하여 출력한다.
단, 평균값은 실수로 처리한다.
*/

import java.util.*;

public class 응개어려워 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input, end, total;
		total = 0;
		double avg;

		System.out.println("몇개를 받을까요?");
		end = sc.nextInt();

		for (int i = 1; i <= end; i++) {
			System.out.println("정수를 입력해주세요.");
			input = sc.nextInt();
			total += input;
		}
		avg = (total / end);
		System.out.printf("입력된 값들의 평균은 %.2f입니다.", avg);

	}

}
