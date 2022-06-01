package 과제;

class Card {
	String[] names = { "'클럽 ", "'다이아몬드 ", "'하트 ", "'스페이드 " };
	String[] number = { "에이스'", "2'", "3'", "4'", "5'", "6'", "7'", "8'", "9'", "10'", "잭'", "퀸'", "킹'" };

	public Card() {
		boolean a = false;
		System.out.print("[");
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < number.length; j++) {
				System.out.print(names[i] + number[j]);
				if (i == 3 && j == 12) {
					a = true;
				} else {
					System.out.print(", ");
				}
			}
			if (a != true)
				System.out.println();
		}
		System.out.println("]");
	}

}

public class Deck {
	public static void main(String[] args) {
		Card card = new Card();

	}
}
