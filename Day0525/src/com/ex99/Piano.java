package com.ex99;

public class Piano extends Instrument {
	public static void main(String[] args) {
		Piano p = new Piano();
		p.play();
		p.volumeUp();
		p.volumeDown();
	}

	@Override // ø¿πˆ∂Û¿Ãµ˘ µ» ∏ﬁº“µÂ
	void play() {
		System.out.println("Piano : play( ) ∏‰√≠ »£√‚µ ");
	}

	@Override
	void volumeUp() {
		System.out.println("Piano : volumeUp( ) ∏‰√≠ »£√‚µ ");
	}

	@Override
	void volumeDown() {
		System.out.println("Piano : volumeDown( ) ∏‰√≠ »£√‚µ ");

	}

}
