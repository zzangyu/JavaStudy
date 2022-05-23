package concurrency;

public class Counter_Problems {
	private int i = 0;

	public void increment() {
		i++;
		// i++ is not Atomic! Not thread-safe method
		// thread-safety ? 임의의 메소드가 다양한 thread에 의해 한 번에 안전하게 실행되는 것
		// first, get i
		// second, increment
		// third, set i
		// 여러개의 Thread로 이 메소드를 사용할 때 값이 달라질 수 있다.
		// 동기화 과정에서 i가 방향을 잃고 업데이트를 놓칠 확률이 큼
	}

	synchronized public void increment2() {
		// 동기화 적용
		// 이 특정 메소드를 한 번에 하나의 thread만이 실행할 수 있게 된다.
		// 두개의 thread를 실행할 시 두번째 thread는 대기를 해야한다.
		i++;
	}

	public int getI() {
		return i;
	}

}
