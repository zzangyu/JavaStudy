package com.threadex;

// 체인처럼 연결하자 !
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
		System.out.println(Thread.currentThread().getName() + " start"); // 현재 Thread는 어디!?
		Runnable r = new MyThread();
		Thread myThread = new Thread(r);
		myThread.start();

		try {
			myThread.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		// join이 없으면 main하고 thread가 동시에 시작한다. 그래서 밑에 있는 end가 먼저 끝나버리게 된다.
		// 있으면 main이 끝까지 기다리고 end를 출력한다.
		System.out.println(Thread.currentThread().getName() + " end");
	}

}
