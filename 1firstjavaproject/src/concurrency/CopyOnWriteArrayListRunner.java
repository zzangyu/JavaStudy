package concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner {

	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();

		// add Threads�� 3����� ����
		list.add("Ant");
		list.add("Bat");
		list.add("Cat");

		// list.get() Threads�� 10000����� ����
		for (String element : list) {
			System.out.println(element);
		}
	}

}
