package Array;

import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String subject[] = { "국어 점수", "영어 점수", "수학 점수" };
		int t[] = new int[subject.length];

		int i = 0;
		while (i < subject.length) {
			System.out.print("점수 입력해");
			t[i] = sc.nextInt();
			i++;
		}
		i = 0;
		for (String a : subject) {
			System.out.printf("%3s는 %d점\n", a, t[i]);
			i++;
		}
		System.out.println();

		char ch[] = new char[4];
		ch = new char[] { 'j', 'a', 'v', 'a' };
		System.out.println(ch);

	}

}
