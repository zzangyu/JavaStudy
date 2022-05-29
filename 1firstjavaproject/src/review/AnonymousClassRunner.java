package review;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassRunner {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<>(List.of("Angel", "Cat", "Ball", "Elephant"));

		Comparator<String> lengthComparator = new Comparator<String>() {
			// 새 클래스를 생성해서 복잡한 과정을 거치는 대신, 곧장 비교자를 구현한 것이다.
			// 비교자 코드를 직접 써서 인스턴스로 바로 생성한 것
			// 이런 식으로 클래스를 만드는 걸 익명 클래스라고 한다. (이 클래스에 이름이 없기 때문)
			// 다른곳에서는 사용하지 않을 것을 주의해야한다.
			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(o1.length(), o2.length());
			}

		};
		Collections.sort(animals, lengthComparator);
		System.out.println(animals);
	}

}
