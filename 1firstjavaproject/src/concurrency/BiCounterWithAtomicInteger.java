package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithAtomicInteger {
	private int i = 0;
	private int j = 0;
	// Locks : ����ȭ�� �ڵ带 ���� ������ �ڵ�� �ɰ� �� �ֵ��� ���ش�.
	// �ڵ��� �� ó���� lock�� ����ϰ� �ʹٰ� �˸� ��, �������� lock�� Ǯ���ְ� �ʹٰ� �����ָ� �ȴ�.

	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();

	public void incrementI() { // ����ȭ�� �ʿ� ������
		lockForI.lock();// Get Lock For I
		lockForI.tryLock();// lock�� �̰��� �������� ����� �� �ְ� ���ش�. ���ϰ� �Ǹ� false��� ���� ��ȯ�Ͽ� �̿� �����Ѵ�.
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
// ������ : �ϳ��� thread�� incrementI method�� �̿��ϰ� �ְ�
// �� �ٸ� thread�� incremenJ method�� �̿��ϸ� �� ���.. ���..
}
