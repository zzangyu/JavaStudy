package com.ex99;

public class Flute extends Instrument {
	public static void main(String[] args) {
		Flute f = new Flute();
		f.play();
		f.volumeUp();
		f.volumeDown();
	}

	@Override
	void play() {
		System.out.println("Flute : play( ) ��í ȣ���");
	}

	@Override
	void volumeUp() {
		System.out.println("Flute : volumeUp( ) ��í ȣ���");
	}

	@Override
	void volumeDown() {
		System.out.println("Flute : volumeDown( ) ��í ȣ���");

	}

}
