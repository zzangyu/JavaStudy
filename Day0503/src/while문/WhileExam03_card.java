package while문;

/*
[문제]
0에서부터 99까지 임의의 수를 가진 카드를 한장 숨기고 이 카드 수를 맞추는 게임임
카드속의 수가 77이라면 수를 맞추는 사람이 55를 입력하면 
더 높게 다시 70을 입력하면 더 높게 라는 식으로 범위를 좁혀가면서 게임을 맞추는 것임
게임을 반복하기 위해 y/n를 묻고, n인 경우는 종료함
컴퓨터가 숨길 수를 임의로 선택하기 위해 Random 클래스를 사용함
Random 클래스 사용법은
 */
import java.util.Random;
import java.util.Scanner;

public class WhileExam03_card {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yn = " ";
		Random r = new Random();
		int i = r.nextInt(100);
		int a = 0; // 사용자가 입력한 횟수
		while (true) {
			System.out.print("정답이 뭐게요~? ");
			int j = sc.nextInt();
			a++;
			if (j > i) {
				System.out.println("더 낮게! 입력하실 수 있는 범위는 0~"+j+"까지 입니다.");
			} else if (j < i) {
				System.out.println("더 높게!입력하실 수 있는 범위는 "+j+"부터 99까지 입니다.");
			} else if (j == i) {
				System.out.println(a+"번만에 맞췄습니다.");
				System.out.print("게임 더 할래요? (y/n)");
				yn = sc.next();
					if (yn.equals("n")) {
						System.exit(0);
						break;
				} else {
					i = r.nextInt(100);
				}
			}
		}
	}
}