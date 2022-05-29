package review;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class LengthComparator implements Comparator<String> {

	@Override
	public int compare(String str1, String str2) {

		return Integer.compare(str1.length(), str2.length());

	}

}

public class ArrayListHowtoSortThatUseComparatorInterface {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<>(List.of("Angel", "Cat", "Ball", "Elephant"));

		Collections.sort(animals, new LengthComparator());
		System.out.println(animals);
	}

}
