package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithAtomicInteger {
	private int i = 0;
	private int j = 0;
	// Locks : 동기화된 코드를 여러 조각의 코드로 쪼갤 수 있도록 해준다.
	// 코드의 맨 처음에 lock을 사용하고 싶다고 알린 후, 마지막에 lock을 풀어주고 싶다고 적어주면 된다.

	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();

	public void incrementI() { // 동기화가 필요 없어짐
		lockForI.lock();// Get Lock For I
		lockForI.tryLock();// lock을 이곳과 저곳에서 사용할 수 있게 해준다. 못하게 되면 false라는 값을 반환하여 이에 반응한다.
		i++;
		lockForI.unlock();// Release Lock For I
	}

	public void incrementJ() {
		lockForJ.lock();// Get Lock For J
		j++;
		lockForJ.unlock();// Release Lock For J
	}

	public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}
// 문제점 : 하나의 thread가 incrementI method를 이용하고 있고
// 또 다른 thread가 incremenJ method를 이용하면 또 대기.. 대기..
}
