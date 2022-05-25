package concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class BiCounterWithLock {
	private AtomicInteger i = new AtomicInteger();
	private AtomicInteger j = new AtomicInteger();
	// Atomic - �ڵ� ������ thread-safe�� �ش��ϴ��� �ڵ����� Ȯ���Ѵ�.

	public void incrementI() {
		i.incrementAndGet(); // �θ��� ���� AtomicInteger�� �����Ͽ� thread-safe���� Ȯ��
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
