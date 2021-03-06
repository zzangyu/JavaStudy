package practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Gogo extends Thread {

	private int number;

	public Gogo(int number) {
		this.number = number;
	}

	@Override
	public void run() {
		System.out.println("Task" + number + " start");
		for (int i = number * 100; i < number * 100 + 99; i++) {
			System.out.print(i + " ");
		}
		System.out.println("Task " + number + " end");
	}
}

public class ThreadEx01 {

	public static void main(String[] args) {
		ExecutorService ex = Executors.newFixedThreadPool(3);
		ex.execute(new Gogo(1));
		ex.execute(new Gogo(2));
		ex.execute(new Gogo(3));
		ex.execute(new Gogo(4));
		ex.shutdown();
	}

}
