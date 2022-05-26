package Array_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayOf {

	public static void main(String[] args) {

		List<String> words = new ArrayList<>();
		words.add("car");
		words.add(1, "bus");
		words.add(2, "bnus");
		words.add(2, "sss");
		for (String word : words) {
			System.out.println(word);
		}

	}

}
