package com.absex;

public class AbsExam extends AbsEx02 {
	@Override
	public String getStr() { // AbsEx02�� �߻� �޼ҵ带 ������
		return str; // AbsEx01�� ��� ����
	}

	public static void main(String[] args) {
		AbsExam ae = new AbsExam();
		System.out.println("ae.getA(): " + ae.getA()); // AbsEx02
		System.out.println("ae.getStr(): " + ae.getStr());
	}

}
