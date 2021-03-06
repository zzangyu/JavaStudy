package Generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class genericRunner01 {

	static <X> X doublevalue(X value) {

		return value;
	}

	static <X extends List> void duplicate(X list) {
		list.addAll(list);
	}

	static double sumOfNumberList(List<? extends Number> numbers) {
		double sum = 0.0;
		for (Number number : numbers) {
			sum += number.doubleValue();
		}
		return sum;
	}

	static void addACoulpeOfValues(List<? super Number> numbers) {
		numbers.add(1);
		numbers.add(1.0);
		numbers.add(1.0f);
		numbers.add(1l);

	}

	public static void main(String[] args) {

		System.out.println(sumOfNumberList(List.of(1, 2, 3, 4, 5)));
		System.out.println(sumOfNumberList(List.of(1.1, 2.1, 3.1, 4.1, 5.1)));
		System.out.println(sumOfNumberList(List.of(1l, 2l, 3l, 4l, 5l)));

		List emptyList = new ArrayList<Number>();
		addACoulpeOfValues(emptyList);
		System.out.println(emptyList);

//		System.out.println(addACoulpeOfValues(List.of(1, 2, 3, 4, 5, 6))); ???ʵ? ?

		String value1 = doublevalue(new String());
		int number1 = doublevalue(Integer.valueOf(5));
		ArrayList list1 = doublevalue(new ArrayList());

		ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3));
		LinkedList<Integer> numbers2 = new LinkedList<>(List.of(1, 2, 3, 4));
		duplicate(numbers);
		duplicate(numbers2);
		System.out.println(numbers);
		System.out.println(numbers2);

		MyCustomList<String> list = new MyCustomList<>();
		list.addElement("Element 1");
		list.addElement("Element 2");
		String value = list.get(0);
		System.out.println(value);

		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(8));
		Integer number = list2.get(0);
		System.out.println(number);
	}

}
