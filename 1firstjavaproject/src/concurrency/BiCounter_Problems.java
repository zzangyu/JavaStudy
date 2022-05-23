package concurrency;

public class BiCounter_Problems {
	private int i = 0;
	private int j = 0;

	synchronized public void incrementI() {
		i++;
	}

	synchronized public void incrementJ() {
		j++;
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
