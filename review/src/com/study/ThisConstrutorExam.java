package com.study;

class House {
	int price; // ��� ����
	int size;
	String dong;
	String kind;

	public House() {
		this(100, 32, "��赿", "����Ʈ");
	}

	public House(int price) {
		this(price, 32, "��赿", "����Ʈ");
	}

	public House(int price, int size) {
		this(price, size, "��赿", "����Ʈ");
	}

	public House(int price, int size, String dong) {
		this(price, size, dong, "�ܵ�����");

	}

	public House(int price, int size, String dong, String kind) {
		// �ʱ� �۾�
		this.price = price;
		this.size = size;
		this.dong = dong;
		this.kind = kind;

	}

	@Override
	public String toString() {
		return "[" + price + "��] [" + size + "��] [" + dong + "] [" + kind + "]";
	}
}

public class ThisConstrutorExam {

	public static void main(String[] args) {
		House h1 = new House();
		House h2 = new House(300);
		House h3 = new House(500, 40);
		House h4 = new House(600, 45, "���ﵿ");
		House h5 = new House(800, 50, "�ݱ���", "����Ʈ");
		System.out.println("h1 - " + h1.toString());
		System.out.println("h2 - " + h2.toString());
		System.out.println("h3 - " + h3.toString());
		System.out.println("h4 - " + h4.toString());
		System.out.println("h5 - " + h5.toString());
	}

}
