package com.threadex;

// �켱 ������ 1~10(�ֿ켱)���� �� �� �ִ�. getPriority, setPriotity �޼ҵ� ���

class Thread_ extends Thread {
	private String firstName;
	private String lastName;

	protected Thread_(String firstName, String lastName, int x) {
		this.firstName = firstName;
		this.lastName = lastName;
		setPriority(x);
		setDaemon(true); // main�� ����� �� ������ ������ �ϴ� thread�̴�. �켱 ������ ���� �Ʒ��� ���� daemon thread !
	}

	@Override
	public void run() {
		System.out.println("start");
		System.out.println(Thread.activeCount()); // ����ִ� thread � ?
		int xx = Thread.activeCount();
		Thread[] th = new Thread[xx];

		Thread.enumerate(th); // �ʼ� ! �μ��� ���� �迭�� �������� thread�� ä���.

		for (int i = 0; i < th.length; i++) {
			System.out.println(
					th[i].getName() + " : " + th[i].getPriority() + " : " + th[i].isDaemon() + " : " + th[i].isAlive());
		}

		while (true) {
			System.out.println("�̸� : " + firstName);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("�� : " + lastName);
		}
	}

}

public class Thread_Prioity {

	public static void main(String[] args) { // main�� �Ϲ� thread�� �켱���� 5�� ������.
		Thread_ t1 = new Thread_("ȿ��", "��", 1);
		t1.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Thread_ t2 = new Thread_("�����", "�̽��϶�", 6);
		t2.start();
		try {
			Thread.sleep(300); // main�� ���� �ð��� ���߱� ����
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("main end");

	}

}
