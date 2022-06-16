package com.threadex;

// 우선 순위는 1~10(최우선)까지 줄 수 있다. getPriority, setPriotity 메소드 사용

class Thread_ extends Thread {
	private String firstName;
	private String lastName;

	protected Thread_(String firstName, String lastName, int x) {
		this.firstName = firstName;
		this.lastName = lastName;
		setPriority(x);
		setDaemon(true); // main이 종료된 후 나머지 정리를 하는 thread이다. 우선 순위가 제일 아래인 것이 daemon thread !
	}

	@Override
	public void run() {
		System.out.println("start");
		System.out.println(Thread.activeCount()); // 살아있는 thread 몇개 ?
		int xx = Thread.activeCount();
		Thread[] th = new Thread[xx];

		Thread.enumerate(th); // 필수 ! 인수로 받은 배열을 실행중인 thread로 채운다.

		for (int i = 0; i < th.length; i++) {
			System.out.println(
					th[i].getName() + " : " + th[i].getPriority() + " : " + th[i].isDaemon() + " : " + th[i].isAlive());
		}

		while (true) {
			System.out.println("이름 : " + firstName);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("성 : " + lastName);
		}
	}

}

public class Thread_Prioity {

	public static void main(String[] args) { // main은 일반 thread라서 우선순위 5로 잡힌다.
		Thread_ t1 = new Thread_("효신", "박", 1);
		t1.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Thread_ t2 = new Thread_("사토미", "이시하라", 6);
		t2.start();
		try {
			Thread.sleep(300); // main의 종료 시간을 늦추기 위해
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("main end");

	}

}
