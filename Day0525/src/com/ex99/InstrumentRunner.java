package com.ex99;

public class InstrumentRunner {

	public static void main(String[] args) {
		Instrument[] in = { new Piano(), new Flute() };

		for (Instrument i : in) {
			i.volumeUp();
			i.volumeDown();
			i.play();
		}
	}

}
