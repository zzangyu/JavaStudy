package study;

/*
[����]
����ڷκ��� ������ ������ �Է¹޾� �Է¹��� ������ 2�� �������, 3�� �������, 2��3�� �������, 2��3�� ����� �ƴ��� �Ǻ��Ͽ� ����� ����ϴ� ���α׷��� �����Ѵ�.
 */
import java.util.*;

public class Test002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;

		System.out.print("������ �Է����ּ���.");
		i = sc.nextInt();

		if (i % 2 == 0 && i % 3 == 0) {
			System.out.print("2�� 3�� ���");
		} else if (i % 2 == 0) {
			System.out.println("2�� ���");
		} else if (i % 3 == 0) {
			System.out.println("3�� ���");
		} else {
			System.out.println("2�� 3�� ����� �ƴϴ�.");
		}
	}
}
