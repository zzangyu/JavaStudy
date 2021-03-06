package practice;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String value1, String value2) {

		return Integer.compare(value1.length(), value2.length());
	}

}

class StringLengthComparator2 implements Comparator<String> {

	@Override
	public int compare(String value1, String value2) {
		return Integer.compare(value2.length(), value1.length());
	}

}

public class QueueEx {
	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
		queue.addAll(List.of("Zebra", "Monkey", "Cat"));
		Queue<String> queue2 = new PriorityQueue<>(new StringLengthComparator2());
		queue2.addAll(List.of("Zebra", "Monkey", "Cat"));

		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println();
		System.out.println(queue2.poll());
		System.out.println(queue2.poll());
		System.out.println(queue2.poll());
		System.out.println(queue2.poll());

	}
}
