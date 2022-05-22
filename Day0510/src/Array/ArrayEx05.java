package Array;

// 배열의 크기: 9, 데이터 입력 숫자: 4 7 9 1 3 2 5 6 8
import java.util.Scanner;

public class ArrayEx05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기 입력해! - ");
		int input = sc.nextInt();

		int aa[] = new int[input];
		int cycle = 0;

		for (int a : aa) {
			aa[cycle] = sc.nextInt();
			cycle++;
		}

		int max = Integer.MIN_VALUE;
		for (int a : aa) {
			if (a > max) {
				max = a;
			}
		}
		System.out.println(max);

	}
}
