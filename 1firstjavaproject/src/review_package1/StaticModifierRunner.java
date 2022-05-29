package review_package1;
// static method

// static variables의 규칙
// - 사용해도 될 때
// - 사용하면 안될 때

class Player {
	private static String name; // instance variable, member variable
	private static int count;

	protected Player(String name) {
		super();
		this.setName(name);
		count++;
	}

	static public int getCount() {
		System.out.println(name);
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getName() {
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
