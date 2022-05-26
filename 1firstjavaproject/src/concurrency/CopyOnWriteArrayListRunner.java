package concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner { // write가 매우 적고 read가 매우 많은 경우 효율적

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

		// 만약 이 class에서의 method들이 전부 동기화 될 경우 10000개의 thread는 너무 큰 손해
		// 여기서 CopyOnWriteArrayList는 add 연산자만을 동기화해주는 역할o
		// get 연산자 동기화 안하는 이유: add 연산의 경우는 전체 array를 복사해서 실행하는 방법
		// 그래서 복사하는 과정에서 다른 thread들이 이전의 array 값을 계속 읽어올 수 있다.
		// 하지만 복사하는 순간 예전의 array가 새로운 array로 교체되는게 문제가 되어 add도 문제가 됨

	}

}
