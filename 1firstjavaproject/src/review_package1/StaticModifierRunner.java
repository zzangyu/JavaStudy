package review_package1;
// static method

// static variables�� ��Ģ
// static method�ȿ��� static�� �� �� ����
// �Ϲ� method�ȿ��� static����*��* �� �� ����

class Player {
	private String name; // instance variable, member variable
	private static int count;

	protected Player(String name) {
		super();
		this.setName(name);
		count++;
	}

	static public int getCount() {
		System.out.println();
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getName() {
		System.out.println(count);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class StaticModifierRunner {

	public static void main(String[] args) {
		Player player1 = new Player("Ronaldo");
		System.out.println(Player.getCount());
		Player player2 = new Player("Federer");
		System.out.println(Player.getCount());

	}

}
