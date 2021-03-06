package Method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
여러가지 기능
1. 최대값 구하기
2. 사이의 합계
3. 수열
4. 종료
*/

public class MethodEx03 {

	public static int aaa() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번째 정수 입력: ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("두번째 정수 입력: ");
		int b = Integer.parseInt(br.readLine());

		if (a > b) {
			return a;
		}
		return b;
	}

	public static void bbb() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번째 정수 입력: ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("두번째 정수 입력: ");
		int b = Integer.parseInt(br.readLine());
		int sum = 0;
		if (a > b) {
			a = a ^ b;
			b = b ^ a;
			a = a ^ b;
		} else {
			for (int i = a + 1; i < b; i++) {
				sum += i;
			}
		}
		System.out.print(sum);

	}
	// 큰 순서대로 나열하는 수열을 구현하는 메소드

	public static String ccc(int x, int y, int z) { // first = x, second = y, third = z

		if (y >= x && y >= z) {
			int imsi = x;
			x = y;
			y = imsi;

		} else if (z >= x && z >= y) {
			int imsi = x;
			x = z;
			z = imsi;
		}
		if (z >= y) {
			int imsi = y;
			y = z;
			z = imsi;
		}
//		String abc = x + " >= " + y + " >= " + z;
		return x + " >= " + y + " >= " + z; // abc;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = 0; // 메뉴를 입력 받을 변수

		while (true) {
			System.out.print("1: 최대값  2: 사이의 합계   3: 수열   4: 종료");
			x = Integer.parseInt(br.readLine());

			if (x == 1) {
				int k = aaa();
				System.out.println("두 수중 최대값은 " + k + "입니다.");

			} else if (x == 2) { // Call by Name (함수의 이름을 호출한다.)
				bbb();

			} else if (x == 3) { // Call by Value
				System.out.print("첫번째 정수 입력: ");
				int first = Integer.parseInt(br.readLine());
				System.out.print("두번째 정수 입력: ");
				int second = Integer.parseInt(br.readLine());
				System.out.print("세번째 정수 입력: ");
				int third = Integer.parseInt(br.readLine());

				String str = ccc(first, second, third);
				System.out.println("큰 순으로 나열은 " + str);

			} else if (x == 4) {
				break;
			} else {
				System.out.println("잘못 입력 하셨습니다.");
			}
			System.out.println();
		}
		System.out.println("오츠카레~");
	}

}
