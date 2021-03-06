package functional;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer number) {
		return number % 2 == 0;
	}

}

class SystemOutConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer number) { // filter
		System.out.println(number);
	}

}

class NumberSquareMapper implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer number) { // map, ????
		return number * number;
	}

}

public class LambdaBehindTheScreenRunner {

	public static void main(String[] args) {
		List.of(23, 43, 34, 45, 36, 48).stream().filter(element -> element % 2 == 0).map(element -> element * element)
				.forEach(element -> System.out.println(element));
		List.of(23, 43, 34, 45, 36, 48).stream().filter(new EvenNumberPredicate()).map(new NumberSquareMapper())
				.forEach(new SystemOutConsumer());

	}

}
