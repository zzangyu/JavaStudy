package com.study;

public class Method_Test01 {

	public void showHi() {
		System.out.println("Hi ~ Everyone ~!");
	}

	public static void showHello() {
		System.out.println("Hello ~ Everyone ~!");
	}

	public static void main(String[] args) {
		new Method_Test01().showHi(); // static�� �ƴ� ��쿣 ��ü�� �����ؾ��Ѵ�.
		showHello(); // method call - showHello method�� static�̶� ȣ�� �ٷ� �����ϴ�.
		
		
		
	}

}
