package while문;

import java.util.Random;
import java.util.Scanner;

public class WhileExam03_card_teacher {

	public static void main(String[] args) {
		int low, high, card;
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		while (true) {
			int i = 0; // 입력한 횟수
			low = 0;
			high = 99;
			card = r.nextInt(100);
			System.out.println("카드 값을 맞춰 보세요");
			while (true) {
				System.out.println("입력할 수 있는 값의 범위" + low + "~~" + high + "입니다.");
				int n = 0;
				n = sc.nextInt();
				// 입력한 값이 범위를 벗어난 경우와 정산적인 경우 판정
				if (n > high || n < low) {
					System.out.println("입력하신 값이 범위를 벗어났습니다.");
					continue;
				} else {
					if (n == card) {
						System.out.println("정답~ 띵동~");
						System.out.println(i + "번만에 맞췄습니다 !");
						break;
					} else if (n > card) { // 입력된 값이 숨겨진 카드 값보다 큰 경우
						System.out.println("더 낮은 값을 입력하시오.");
						high = n;
					} else { // 입력된 값이 숨겨진 카드 값보다 작은 경우
						System.out.println("더 큰 값을 입력하시오.");
						low = n;
					}

				}
				i++;
			}
			System.out.println("게임을 계속 진행 하시겠습니까? (y/n) ");

			if (sc.next().equals("n")) {
				System.out.println("Thank you! Have fun! ");
				break;
			}
		}

	}

}
