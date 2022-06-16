package com.threadex;

// thread Ŭ���� ���
public class Thread_extends_ThreadClass extends Thread {

	private int[] temp;

	public Thread_extends_ThreadClass(String threadname) {
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
		Thread_extends_ThreadClass te = new Thread_extends_ThreadClass("ȫ�浿"); // ���ڰ� : �̸�
		te.start(); // �ڵ����� run�� ȣ���Ѵ�.
	}

}
