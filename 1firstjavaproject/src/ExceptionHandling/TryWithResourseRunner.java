package ExceptionHandling;

import java.util.Scanner;

public class TryWithResourseRunner {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			int[] numbers = { 12, 3, 4, 5 };

			int number = numbers[5];

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("ababab");
	}

}
