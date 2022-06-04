package 과제;

class Card2 {
	String[] names = { "'클럽 ", "'다이아몬드 ", "'하트 ", "'스페이드 " };
	String[] number = { "에이스'", "2'", "3'", "4'", "5'", "6'", "7'", "8'", "9'", "10'", "잭'", "퀸'", "킹'" };

}

class Deck2 extends Card2 {
	String[] cardList = new String[52];
	boolean a = false;

	public void makeACardList() {

		for (int i = 0; i < names.length; i++) {
			for (int j = 0, count = 0; j < number.length; j++, count++) {
				cardList[count] = names[i] + number[j];
				if (i == 3 && j == 12) {
					a = true;
				} else {
					System.out.print(", ");
				}
			}
			if (a != true)
				System.out.println();
		}

	}

	public void __str__() {

		System.out.print("[");
		makeACardList();
		System.out.println("]");
	}

}

public class ArrayDeck {
	public static void main(String[] args) {
		Deck2 deck = new Deck2();
		deck.__str__();

	}
}
