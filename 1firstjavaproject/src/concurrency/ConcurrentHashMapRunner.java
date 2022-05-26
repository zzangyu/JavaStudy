package concurrency;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentHashMapRunner {
	// hashtable - 동기화o thread1이 들어가면 전체가 lock 걸림/ hashmap - 동기화x -> 불안정 ->
	// concurrentMap사용 -> hashMap을 다수의 지역으로 나눠 주변에 block을 생성하여 thread를 막는 느낌
	// 하지만 지역이 나눠지며 연결이 되지 않는 등 문제가 생길 수 있음

	public static void main(String[] args) {
		ConcurrentMap<Character, LongAdder> occurrences = new ConcurrentHashMap<>();

		String str = "ABCD ABCD ABCD";
		for (char character : str.toCharArray()) {
			occurrences.computeIfAbsent(character, ch -> new LongAdder()).increment();

		}
		System.out.println(occurrences);

	}

}
