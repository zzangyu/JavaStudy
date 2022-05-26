package concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class BiCounterWithLock {
	private AtomicInteger i = new AtomicInteger();
	private AtomicInteger j = new AtomicInteger();
	// Atomic - 코드 조각이 thread-safe에 해당하는지 자동으로 확인한다.
	// locks에서의 의무를 가져와서 AtomicInteger라는 클래스에 이를 부여하고 있는 것이다.
	// 자동 숫자 증가와 같은 응용 프로그램에 사용됬다는 것을 알 수 있다!

	public void incrementI() {
		i.incrementAndGet(); // 부르는 순간 AtomicInteger에 의존하여 thread-safe한지 확인
	}

	public void incrementJ() {
		j.incrementAndGet();
	}

	public int getI() {
		return i.get();
	}

	public int getJ() {
		return j.get();
	}
}
