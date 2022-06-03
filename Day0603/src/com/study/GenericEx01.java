package com.study;

class Box<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}

public class GenericEx01 {

	public static void main(String[] args) {
		Box<Integer> box = new Box<>();
		box.setT(123213123);
		System.out.println(box.getT());

		Box<String> bs = new Box<>();
		bs.setT("Hi ~");
		System.out.println(bs.getT());

		Box<Integer> bi;
		bi = createBox();
		bi.setT(1323);
		System.out.println(bi.getT());

	}

	static Box createBox() {
		return new Box();
	}

}
