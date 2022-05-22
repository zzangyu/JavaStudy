package com.constex;

class ThisEx {

	String name, id, tel;

	public ThisEx() {
		this.name = "Guest";
		this.id = "000000-0000000";
		this.tel = "000-0000-0000";
	}

	public ThisEx(String name) {
		this();
		this.name = name;
	}

	public ThisEx(String name, String id) {
		this(name, id, "");
		this.name = name;
		this.id = id;
	}

	public ThisEx(String name, String id, String tel) {
		this.name = name;
		this.id = id;
		this.tel = tel;
	}

	public void show() {
		System.out.println(name + "//" + id + "//" + tel);
	}
}

public class ThisEx04 {

	public static void main(String[] args) {
		ThisEx t = new ThisEx();
		t.show();
		ThisEx t1 = new ThisEx("한찬규");
		t1.show();
		ThisEx t2 = new ThisEx("사토미", "555555-5555555");
		t2.show();
		ThisEx t3 = new ThisEx("아이유", "777777-7777777", "777-7777-7777");
		t3.show();
	}

}
