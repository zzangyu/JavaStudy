package Array;

import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String subject[] = { "���� ����", "���� ����", "���� ����" };
		int t[] = new int[subject.length];

		int i = 0;
		while (i < subject.length) {
			System.out.print("���� �Է���");
			t[i] = sc.nextInt();
			i++;
		}
		i = 0;
		for (String a : subject) {
			System.out.printf("%3s�� %d��\n", a, t[i]);
			i++;
		}
		System.out.println();

		char ch[] = new char[4];
		ch = new char[] { 'j', 'a', 'v', 'a' };
		System.out.println(ch);

	}

}
