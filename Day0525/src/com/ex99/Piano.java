package com.ex99;

public class Piano extends Instrument {
	public static void main(String[] args) {
		Piano p = new Piano();
		p.play();
		p.volumeUp();
		p.volumeDown();
	}

	@Override // �������̵� �� �޼ҵ�
	void play() {
		System.out.println("Piano : play( ) ��í ȣ���");
	}

	@Override
	void volumeUp() {
		System.out.println("Piano : volumeUp( ) ��í ȣ���");
	}

	@Override
	void volumeDown() {
		System.out.println("Piano : volumeDown( ) ��í ȣ���");

	}

}
