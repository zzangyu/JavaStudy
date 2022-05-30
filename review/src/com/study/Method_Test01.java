package com.study;

public class Method_Test01 {

	public void showHi() {
		System.out.println("Hi ~ Everyone ~!");
	}

	public static void showHello() {
		System.out.println("Hello ~ Everyone ~!");
	}

	public static void main(String[] args) {
		new Method_Test01().showHi(); // static이 아닌 경우엔 객체를 생성해야한다.
		showHello(); // method call - showHello method가 static이라서 호출 바로 가능하다.
		
		
		
	}

}
