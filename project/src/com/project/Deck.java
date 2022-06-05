package com.project;

import java.util.ArrayList;

public class Deck extends Card {
	ArrayList<String> cards = new ArrayList<>();

	public void getSomething() {
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < number.length; j++) {
				if (j % 13 == 0 && i != 0) {
					cards.add("\n" + names[i] + number[j]);
				} else {
					cards.add(names[i] + number[j]);
				}
			}
		}
	}

	public void __Str__() {
		getSomething();
		System.out.println(cards);
	}

}
