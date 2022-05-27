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

	// 조건 1. 두 객체가 정확히 일치한다면, 그 둘의 hashCode 또한 정확하게 같아야 한다는 점
	// 조건 2. hashCode는 객체의 값이 변하지 않는 이상 그 값이 절대 변화하면 안된다.
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
		System.out.println(c1.equals(c2)); // equals를 메소드화 시켜서 true가 나옴!
		System.out.println(c1.equals(c3));
	}

}
