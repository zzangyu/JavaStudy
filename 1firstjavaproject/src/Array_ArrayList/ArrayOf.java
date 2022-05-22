package Array_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayOf {

	public static void main(String[] args) {

		List<String> words = new ArrayList<>();
		words.add("car");
		words.add("bus");
		words.add(1, "sss");
		words.remove(1);
		for (String word : words) {
			System.out.println(word);
		}

	}

}
