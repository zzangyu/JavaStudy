package concurrency;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {

	public static void main(String[] args) {
		Map<Character, LongAdder> occurrences = new Hashtable<>();
		// HashMap�� �Ҿ����ؼ� Hashtable�� ���� �Ҿ���������.
		String str = "ABCD ABCD ABCD";
		for (char character : str.toCharArray()) {
			LongAdder longAdder = occurrences.get(character);
			if (longAdder == null) {
				longAdder = new LongAdder();
			}
			longAdder.increment();
			occurrences.put(character, longAdder);
		}
		System.out.println(occurrences);

	}

}
