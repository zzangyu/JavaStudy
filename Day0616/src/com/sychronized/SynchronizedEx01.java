package com.sychronized;

/*
 * Synchronized (����ȭ)
 * - �������� �����ϴ� ���� �����ϱ� ���� ����̴�.
 *
 * �Ӱ� ����
 * - multi thread�� ���� �����ڿ��� ������ �� �ִ� �ڵ��� ������ �ǹ��Ѵ�.
 * - multi thread program���� �Ӱ迵���� ó���� ��� �ɰ��� ������ �߻��ȴ�.
 * - �̷��� ��Ȳ�� �ذ��� �� �ִ� ����� ����ȭ�̴�.
 *
 *	����ȭ�� ó���ϱ� ���� ��� ��ü�� ���� ���Խ�Ų��.
 *
 *	���̶� ?
 *	- ������ü�� ���� thread�� ���ÿ� �������� ���ϵ��� �ϱ� ���� ���̴�.
 * - ��� ��ü�� �� ������ ������ �� �ڵ����� ��������� ���� ���̶�� �Ѵ�.
 * - ����ȭ�� �߸��Ǹ� Dead Lock(���� ����)�� �ɸ���.
 *
 * Dead Lock (��������)
 * - ���μ����� �ڿ��� ���� ���� ���� ó���� ���� ���ϴ� ����
 *
 * ����ȭ ���� ���
 *  Case 1.
 *  public synchronized void ##() { }
 *
 *  Case 2.
 *  public void synchronizedMethod() {
 *  synchronized(��ü �Ǵ� Ŭ����) { // ����ȭ�� �����ų ��ü
 *
 *  	}
 *  }
 *
 */

class ATM implements Runnable { // ����ȭ�ߴµ� ����!

	private long depositeMoney = 10000;

	@Override
	public void run() {
		synchronized (this) { // ���⼭ this�� ATM Ŭ������ ���Ѵ�.
			for (int i = 0; i < 10; i++) {

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				if (getDepositeMoney() <= 0)
					break;

				withDraw(1000);
			}
		}
	}

	public long getDepositeMoney() {
		return depositeMoney;
	}

	// ��� ���
	public void withDraw(long howMuch) {
		if (getDepositeMoney() > 0) {
			depositeMoney -= howMuch;
			System.out.print(Thread.currentThread().getName() + ", ");
			System.out.printf("�ܾ� %d��%n", getDepositeMoney());
		} else {
			System.out.print(Thread.currentThread().getName() + ", ");
			System.out.println("�ܾ��� �����մϴ�.");
		}
	}

	// �Ա� ���

	// �ܾ� ��ȸ

}

class ATM_Sub implements Runnable { // ����ȭ�ߴµ� �������� ������!

	private long depositeMoney = 10000;

	@Override
	public void run() {
		synchronized (this) {

			for (int i = 0; i < 10; i++) {
				if (getDepositeMoney() <= 0)
					break;

				withDraw(1000);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (getDepositeMoney() == 2000 || getDepositeMoney() == 4000 || getDepositeMoney() == 6000
						|| getDepositeMoney() == 8000) {
					try {
						this.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					this.notify();
				}

			}
		}

	}

	public long getDepositeMoney() {
		return depositeMoney;
	}

	public void withDraw(long howMuch) {
		if (getDepositeMoney() > 0) {
			depositeMoney -= howMuch;
			System.out.print(Thread.currentThread().getName() + ", ");
			System.out.printf("�ܾ� %d��%n", getDepositeMoney());
		} else {
			System.out.print(Thread.currentThread().getName() + ", ");
			System.out.println("�ܾ��� �����մϴ�.");
		}
	}

}

public class SynchronizedEx01 {

	public static void main(String[] args) {

		ATM_Sub atm = new ATM_Sub();
		Thread mother = new Thread(atm, "mother");
		Thread son = new Thread(atm, "son");

		mother.start();

		son.start();

	}

}
