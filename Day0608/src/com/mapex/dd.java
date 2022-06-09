package com.mapex;

abstract class aa {
	abstract public void a();
}

class bb extends aa {

	@Override
	public void a() {
		System.out.println("sss");
	}

}

public class dd {

	public static void main(String[] args) {
		bb b = new bb();
		b.a();

	}

}
