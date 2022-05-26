package concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner {

	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();

		// add Threads가 3개라고 가정
		list.add("Ant");
		list.add("Bat");
		list.add("Cat");

		// list.get() Threads가 10000개라고 가정
		for (String element : list) {
			System.out.println(element);
		}
	}

}
