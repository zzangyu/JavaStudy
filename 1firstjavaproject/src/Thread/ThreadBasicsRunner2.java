package Thread;

class Task2 extends Thread {
	@Override
	public void run() {
		System.out.println("\nTask 2 Started");
		for (int i = 100; i < 199; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask 2 Done");

	}
}

class Task1 implements Runnable {
	@Override
	public void run() {
		System.out.println("\nTask 1 Started");
		for (int i = 0; i < 99; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask 1 Done");
	}
}

public class ThreadBasicsRunner2 {

	public static void main(String[] args) {
		System.out.println("\nTask1 kicked off");
		Task2 task2 = new Task2();
//		task2.run(); // 꼭 불러와야 하는 메소드는 아니다 ! 얘는 병렬 처리를 안해줌 ㅠㅠ
		task2.start(); // 요게 필요해 !
//		task2.setPriority(1); // 우선 순위 메소드!
		// 기본적으론 5가 주어지는데 1~10까지 선택할 수 있다. MIN_PRIORTY : 1, MAX_PRIORITY : 10(요놈이 제일
		// 빠른거임)
		// 하지만 PRIORITY는 추천, 요청하는 것이므로 항상 우선적으로 행해지는건 아니다. 반영 될 수도 안 될 수도 있다.

		System.out.println("\nTask2 kicked off");
		Task1 task1 = new Task1();
		Thread task1thread = new Thread(task1);// Runnable은 이 클래스도 만들어줘야 됨
		task1thread.start();
//		task1thread.setPriority(10);

		// wait for Task1 and Task2 complete
//		task2.join();
//		task1thread.join();

		System.out.println("\nTask3 kicked off");
		System.out.println("\nTask 3 Started");
		for (int i = 200; i < 299; i++) {
			System.out.print(i);
		}
		System.out.println("\nTask 3 Done");

		System.out.println("main done");
	}

}
