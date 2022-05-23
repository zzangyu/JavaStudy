package concurrency;

public class Counter_Problems {
	private int i = 0;

	public void increment() {
		i++;
		// i++ is not Atomic! Not thread-safe method
		// thread-safety ? ������ �޼ҵ尡 �پ��� thread�� ���� �� ���� �����ϰ� ����Ǵ� ��
		// first, get i
		// second, increment
		// third, set i
		// �������� Thread�� �� �޼ҵ带 ����� �� ���� �޶��� �� �ִ�.
		// ����ȭ �������� i�� ������ �Ұ� ������Ʈ�� ��ĥ Ȯ���� ŭ
	}

	synchronized public void increment2() {
		// ����ȭ ����
		// �� Ư�� �޼ҵ带 �� ���� �ϳ��� thread���� ������ �� �ְ� �ȴ�.
		// �ΰ��� thread�� ������ �� �ι�° thread�� ��⸦ �ؾ��Ѵ�.
		i++;
	}

	public int getI() {
		return i;
	}

}
