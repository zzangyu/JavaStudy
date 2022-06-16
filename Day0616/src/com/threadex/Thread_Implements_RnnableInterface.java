package com.threadex;

// runnable interface 활용

public class Thread_Implements_RnnableInterface implements Runnable {

	private int[] temp;

	public Thread_Implements_RnnableInterface() {
		temp = new int[10];
		for (int start = 0; start < temp.length; start++) {
			temp[start] = start;
		}
	}

	@Override
	public void run() {
		for (int start : temp) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.printf("Thread의 이름 : %s", Thread.currentThread().getName());
			System.out.printf(" | Temp의 값 : %d\n", start);
		}
	}

	public static void main(String[] args) {
		Thread_Implements_RnnableInterface te2 = new Thread_Implements_RnnableInterface();
		Thread t = new Thread(te2, "꾸꾸	"); // 타겟 thread, thread 이름
		t.start();
	}

}
