package com.ex99;

public class Piano extends Instrument {

	@Override
	void play() {
		System.out.println("Piano : play( ) ȣ���");
	}

	@Override
	void volumeUp() {
		System.out.println("Piano : volumeUp( ) ȣ���");
	}

	@Override
	void volumeDown() {
		System.out.println("Piano : volumeDown( ) ȣ���");

	}

}
