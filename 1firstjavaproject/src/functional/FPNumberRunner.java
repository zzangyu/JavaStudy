package functional;

import java.util.List;

public class FPNumberRunner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);

		int sum = fpSum(numbers);
	}

	private static int fpSum(List<Integer> numbers) {
		return numbers.stream().reduce(0, (a1, a2) -> a1 + a2);
	}

	private static int normalSum(List<Integer> numbers) {
		int sum = 0;
		for (Integer number : numbers) {
			sum += number;
		}
		return sum;
	}
}
