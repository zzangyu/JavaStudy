package concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class BiCounterWithLock {
	private AtomicInteger i = new AtomicInteger();
	private AtomicInteger j = new AtomicInteger();
	// Atomic - 코드 조각이 thread-safe에 해당하는지 자동으로 확인한다.

	public void incrementI() {
		i.incrementAndGet(); // 부르는 순간 AtomicInteger에 의존하여 thread-safe한지 확인
	}

	public void incrementJ() {
		j.incrementAndGet();
	}

//	public int getI() {
//		return i;
//	}
//
//	public int getJ() {
//		return j;
//	}
}
