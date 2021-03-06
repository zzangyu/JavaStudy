package functional;

import java.util.List;

public class Ex01 {

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
		List<String> list2 = List.of("Banana", "Apple", "Cat", "Dog");

		printBasic(list);
		System.out.println();
		printWithFP(list2);
		System.out.println();
		printBasicWithFiltering2(list);
		System.out.println();
		printBasicWithFiltering(list);
	}

	private static void printBasic(List<String> list) {
		for (String string : list) {
			System.out.println("String - " + string);
		}
	}

	private static void printBasicWithFiltering2(List<String> list) {
		for (String string : list) {
			if (string.endsWith("at")) {
				System.out.println("String - " + string);
			}
		}
	}

	private static void printBasicWithFiltering(List<String> list) {
		list.stream().filter(element -> element.endsWith("g"))
				.forEach(element -> System.out.println("element - " + element));
	}

	private static void printWithFP(List<String> list) {
		list.stream().forEach(element -> System.out.println("element - " + element));
	}

}
