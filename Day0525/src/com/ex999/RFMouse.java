package com.ex999;

public class RFMouse extends Mouse implements IRFMouse {

	@Override
	public void wconnect() {
		System.out.println("���콺 ���� �����");

	}

	@Override
	public void wdisconnect() {
		System.out.println("���콺 ���� ���� ����");
	}

	@Override
	void move() {
		System.out.println("���콺 ������");
	}

	@Override
	void scroll() {
		System.out.println("���콺 ��ũ�� ����");
	}

	public static void main(String[] args) {
		RFMouse rfm = new RFMouse();
		IRFMouse irf = rfm;

		RFMouse rfm2 = new RFMouse();
		Mouse mm = rfm2;

		System.out.println(s);
		mm.scroll();
		mm.move();
		irf.wconnect();
		irf.wdisconnect();

	}
}
