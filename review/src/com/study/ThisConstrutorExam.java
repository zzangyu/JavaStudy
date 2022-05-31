package com.study;

class House {
	int price; // 멤버 변수
	int size;
	String dong;
	String kind;

	public House() {
		this(100, 32, "상계동", "아파트");
	}

	public House(int price) {
		this(price, 32, "상계동", "아파트");
	}

	public House(int price, int size) {
		this(price, size, "상계동", "아파트");
	}

	public House(int price, int size, String dong) {
		this(price, size, dong, "단독주택");

	}

	public House(int price, int size, String dong, String kind) {
		// 초기 작업
		this.price = price;
		this.size = size;
		this.dong = dong;
		this.kind = kind;

	}

	@Override
	public String toString() {
		return "[" + price + "조] [" + size + "평] [" + dong + "] [" + kind + "]";
	}
}

public class ThisConstrutorExam {

	public static void main(String[] args) {
		House h1 = new House();
		House h2 = new House(300);
		House h3 = new House(500, 40);
		House h4 = new House(600, 45, "신흥동");
		House h5 = new House(800, 50, "금광동", "아파트");
		System.out.println("h1 - " + h1.toString());
		System.out.println("h2 - " + h2.toString());
		System.out.println("h3 - " + h3.toString());
		System.out.println("h4 - " + h4.toString());
		System.out.println("h5 - " + h5.toString());
	}

}
