package review_package1;

class Player {
	private String name;
	private static int count;

	protected Player(String name) {
		super();
		this.name = name;
		count++;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}

public class StaticModifierRunner {

	public static void main(String[] args) {
		Player player1 = new Player("Ronaldo");
		System.out.println(player1.getCount());
		Player player2 = new Player("Federer");
		System.out.println(player1.getCount());
		System.out.println(player2.getCount());
	}

}
