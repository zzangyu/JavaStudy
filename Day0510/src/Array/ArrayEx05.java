package Array;

// �迭�� ũ��: 9, ������ �Է� ����: 4 7 9 1 3 2 5 6 8
import java.util.Scanner;

public class ArrayEx05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ũ�� �Է���! - ");
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
