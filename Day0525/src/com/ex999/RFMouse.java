package com.ex999;

public class RFMouse extends Mouse implements IRFMouse {

	@Override
	public void wconnect() { // �������̽��� �޼ҵ带 ������
		System.out.println("���콺 ���� �����");

	}

	@Override
	public void wdisconnect() { // �������̽��� �޼ҵ带 ������
		System.out.println("���콺 ���� ���� ����");
	}

	@Override
	void move() { // �߻� Ŭ������ �޼ҵ带 ������
		System.out.println("���콺 ������");
	}

	@Override
	void scroll() { // �߻� Ŭ������ �޼ҵ带 ������
		System.out.println("���콺 ��ũ�� ����");
	}

	public static void main(String[] args) {
//		RFMouse rfm = new RFMouse();
//		IRFMouse irf = rfm;
//		RFMouse rfm2 = new RFMouse();
//		Mouse mm = rfm2;
		RFMouse rfm = new RFMouse();
		System.out.println("������� : " + RF_Type_BT);
		rfm.scroll();
		rfm.move();
		rfm.wconnect();
		rfm.wdisconnect();

	}
}
