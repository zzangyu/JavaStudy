package com.threadex;

class ThreadEx03 extends Thread {
	@Override
	public void run() {
		for (char ch = 'A'; ch <= 'z'; ch++) {
			System.out.println(ch);

			try {
				Thread.sleep(150);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}

		}
	}
}

public class ThreadExam01 {

	public static void main(String[] args) {

		ThreadEx03 te3 = new ThreadEx03();

		te3.start(); // 숫자는 main이 가지고 있으니까 main 먼저 실행하고 끝도 main이 제일 나중! 무조건 main이 1빠

		for (int i = 1; i < 60; i++) {
			System.out.println(i);

			try {
				Thread.sleep(150);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}

	}

}
