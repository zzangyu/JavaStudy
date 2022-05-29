package review;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassRunner {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<>(List.of("Angel", "Cat", "Ball", "Elephant"));

		Comparator<String> lengthComparator = new Comparator<String>() {
			// �� Ŭ������ �����ؼ� ������ ������ ��ġ�� ���, ���� ���ڸ� ������ ���̴�.
			// ���� �ڵ带 ���� �Ἥ �ν��Ͻ��� �ٷ� ������ ��
			// �̷� ������ Ŭ������ ����� �� �͸� Ŭ������� �Ѵ�. (�� Ŭ������ �̸��� ���� ����)
			// �ٸ��������� ������� ���� ���� �����ؾ��Ѵ�.
			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(o1.length(), o2.length());
			}

		};
		Collections.sort(animals, lengthComparator);
		System.out.println(animals);
	}

}
