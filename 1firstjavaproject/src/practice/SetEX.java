package practice;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetEX {
	public static void main(String[] args) {

		Set<Integer> numbers = new TreeSet<>();

		Scanner sc = new Scanner(System.in);
		int a = 1;
		while (a > 0) {
			System.out.print("�Է� �ٶ� - ");
			numbers.add(a);
			a = sc.nextInt();
		}
		System.out.println(numbers);

	}
}
