package com.threadex;

// thread Ŭ���� ���
public class ThreadEx01 extends Thread {

	private int[] temp;

	public ThreadEx01(String threadname) {
		super(threadname); // thread �����ڸ� �ǹ�
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

			System.out.printf("Thread�� �̸� : %s", currentThread().getName()); // getName�� threadŬ�������� �����°�
			System.out.printf(" | Temp�� �� : %d\n", start);
		}
	}

	public static void main(String[] args) {
		ThreadEx01 te = new ThreadEx01("ȫ�浿"); // ���ڰ� : �̸�
		te.start(); // �ڵ����� run�� ȣ���Ѵ�.
	}

}
