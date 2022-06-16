package com.threadex;

// ü��ó�� �������� !
class MyThread implements Runnable {
	@Override
	public void run() {
		System.out.println("run");
		first();
	}

	public void first() {
		System.out.println("first");
		second();
	}

	public void second() {
		System.out.println("second");
	}

}

public class Thread_Join {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " start"); // ���� Thread�� ���!?
		Runnable r = new MyThread();
		Thread myThread = new Thread(r);
		myThread.start();

		try {
			myThread.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		// join�� ������ main�ϰ� thread�� ���ÿ� �����Ѵ�. �׷��� �ؿ� �ִ� end�� ���� ���������� �ȴ�.
		// ������ main�� ������ ��ٸ��� end�� ����Ѵ�.
		System.out.println(Thread.currentThread().getName() + " end");
	}

}
