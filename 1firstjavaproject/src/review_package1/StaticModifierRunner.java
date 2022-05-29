package review_package1;
// static method

// static variables의 규칙
// static method안에는 static만 들어갈 수 있음
// 일반 method안에는 static변수*도* 들어갈 수 있음

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
