package concurrency;

public class ConcurrencyRunner {

	public static void main(String[] args) {
		Counter_Problems counter = new Counter_Problems();
		counter.increment();
		counter.increment();
		counter.increment();
		System.out.println(counter.getI());
	}

}
