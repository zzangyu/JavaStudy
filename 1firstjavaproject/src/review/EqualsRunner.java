package review;

import java.util.Objects;

class Client {
	private int id;

	protected Client(int id) {
		super();
		this.id = id;
	}
	// equals
	// hashcode

	// ���� 1. �� ��ü�� ��Ȯ�� ��ġ�Ѵٸ�, �� ���� hashCode ���� ��Ȯ�ϰ� ���ƾ� �Ѵٴ� ��
	// ���� 2. hashCode�� ��ü�� ���� ������ �ʴ� �̻� �� ���� ���� ��ȭ�ϸ� �ȵȴ�.
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return id == other.id;
	}

}

public class EqualsRunner {

	public static void main(String[] args) {
		Client c1 = new Client(1);
		Client c2 = new Client(1);
		Client c3 = new Client(3);
		System.out.println(c1.equals(c2)); // equals�� �޼ҵ�ȭ ���Ѽ� true�� ����!
		System.out.println(c1.equals(c3));
	}

}
