package com.inter;

public class InterfaceEx implements InterEx {

	@Override
	public int getA() {
		return A;
	}

	public static void main(String[] args) {
		InterfaceEx ie = new InterfaceEx();
		System.out.println("getA(): " + ie.getA());
	}

}
