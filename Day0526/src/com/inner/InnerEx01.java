package com.inner;

public class InnerEx01 {

	public static void main(String[] args) {

		// ���� Ŭ������ ��� ������ �����Ϸ��� ���� �ܺ� Ŭ������ ��ü�� ����
		OuterEx oe = new OuterEx();

		// �ܺ� Ŭ������ ���ؼ� ���� Ŭ������ ��ü�� ����
//		OuterEx.InnerEx oi = new OuterEx().new InnerEx();
		OuterEx.InnerEx oi = oe.new InnerEx();

		System.out.println("oi.x: " + oi.x);
	}

}
