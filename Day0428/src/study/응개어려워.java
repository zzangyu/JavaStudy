package study;

/*
�Էµ� ������ ����� ���ϴ� ���α׷��� �����Ͻÿ�.
1. ���� ���� �Է��� ������ ������ ����ڷκ��� �Է� �޴´�.
2. 	�Է¹��� �� ��ŭ ��հ��� ���Ͽ� ����Ѵ�.
��, ��հ��� �Ǽ��� ó���Ѵ�.
*/

import java.util.*;

public class ��������� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input, end, total;
		total = 0;
		double avg;

		System.out.println("��� �������?");
		end = sc.nextInt();

		for (int i = 1; i <= end; i++) {
			System.out.println("������ �Է����ּ���.");
			input = sc.nextInt();
			total += input;
		}
		avg = (total / end);
		System.out.printf("�Էµ� ������ ����� %.2f�Դϴ�.", avg);

	}

}
