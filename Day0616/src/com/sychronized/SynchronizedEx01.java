package com.sychronized;

/*
 * Synchronized (동기화)
 * - 여러명이 접근하는 것을 방지하기 위한 방법이다.
 *
 * 임계 영역
 * - multi thread에 의해 공유자원이 참조될 수 있는 코드의 범위를 의미한다.
 * - multi thread program에서 임계영역을 처리한 경우 심각한 문제가 발생된다.
 * - 이러한 상황을 해결할 수 있는 방법이 동기화이다.
 *
 *	동기화를 처리하기 위해 모든 객체에 락을 포함시킨다.
 *
 *	락이란 ?
 *	- 공유객체에 여러 thread가 동시에 접근하지 못하도록 하기 위한 것이다.
 * - 모든 객체가 힙 영역에 생성될 때 자동으로 만들어지는 것을 락이라고 한다.
 * - 동기화가 잘못되면 Dead Lock(교착 상태)이 걸린다.
 *
 * Dead Lock (교착상태)
 * - 프로세스가 자원을 얻지 못해 다음 처리를 하지 못하는 상태
 *
 * 동기화 구현 방법
 *  Case 1.
 *  public synchronized void ##() { }
 *
 *  Case 2.
 *  public void synchronizedMethod() {
 *  synchronized(객체 또는 클래스) { // 동기화를 실행시킬 객체
 *
 *  	}
 *  }
 *
 */

class ATM implements Runnable { // 동기화했는데 에러!

	private long depositeMoney = 10000;

	@Override
	public void run() {
		synchronized (this) { // 여기서 this란 ATM 클래스를 말한다.
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

	// 출금 기능
	public void withDraw(long howMuch) {
		if (getDepositeMoney() > 0) {
			depositeMoney -= howMuch;
			System.out.print(Thread.currentThread().getName() + ", ");
			System.out.printf("잔액 %d원%n", getDepositeMoney());
		} else {
			System.out.print(Thread.currentThread().getName() + ", ");
			System.out.println("잔액이 부족합니다.");
		}
	}

	// 입금 기능

	// 잔액 조회

}

class ATM_Sub implements Runnable { // 동기화했는데 에러떠서 고쳐줌!

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
			System.out.printf("잔액 %d원%n", getDepositeMoney());
		} else {
			System.out.print(Thread.currentThread().getName() + ", ");
			System.out.println("잔액이 부족합니다.");
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
