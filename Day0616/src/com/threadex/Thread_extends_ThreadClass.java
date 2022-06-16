package com.threadex;

// thread 클래스 상속
public class Thread_extends_ThreadClass extends Thread {

	private int[] temp;

	public Thread_extends_ThreadClass(String threadname) {
		super(threadname); // thread 생성자를 의미
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

			System.out.printf("Thread의 이름 : %s", currentThread().getName()); // getName은 thread클래스에서 가져온것
			System.out.printf(" | Temp의 값 : %d\n", start);
		}
	}

	public static void main(String[] args) {
		Thread_extends_ThreadClass te = new Thread_extends_ThreadClass("홍길동"); // 인자값 : 이름
		te.start(); // 자동으로 run을 호출한다.
	}

}
