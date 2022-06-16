package com.threadex;

// runnable interface Ȱ��

public class ThreadEx02 implements Runnable {

	private int[] temp;

	public ThreadEx02() {
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

			System.out.printf("Thread�� �̸� : %s", Thread.currentThread().getName());
			System.out.printf(" | Temp�� �� : %d\n", start);
		}
	}

	public static void main(String[] args) {
		ThreadEx02 te2 = new ThreadEx02();
		Thread t = new Thread(te2, "�ٲ�	"); // Ÿ�� thread, thread �̸�
		t.start();
	}

}
