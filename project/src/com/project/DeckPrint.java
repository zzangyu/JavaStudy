package com.project;

class CardList {
	String[] names = { "'Ŭ�� ", "'���̾Ƹ�� ", "'��Ʈ ", "'�����̵� " };
	String[] number = { "���̽�'", "2'", "3'", "4'", "5'", "6'", "7'", "8'", "9'", "10'", "��'", "��'", "ŷ'" };

	public void List() {
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

	public void __str__() {
		List();
	}

}

public class DeckPrint {
	public static void main(String[] args) {
		CardList card = new CardList();
		card.__str__();

	}

}
