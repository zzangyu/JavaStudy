package concurrency;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentHashMapRunner {
	// hashtable - ����ȭo thread1�� ���� ��ü�� lock �ɸ�/ hashmap - ����ȭx -> �Ҿ��� ->
	// concurrentMap��� -> hashMap�� �ټ��� �������� ���� �ֺ��� block�� �����Ͽ� thread�� ���� ����
	// ������ ������ �������� ������ ���� �ʴ� �� ������ ���� �� ����

	public static void main(String[] args) {
		ConcurrentMap<Character, LongAdder> occurrences = new ConcurrentHashMap<>();

		String str = "ABCD ABCD ABCD";
		for (char character : str.toCharArray()) {
			occurrences.computeIfAbsent(character, ch -> new LongAdder()).increment();

		}
		System.out.println(occurrences);

	}

}
