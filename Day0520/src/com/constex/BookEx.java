package com.constex;

public class BookEx {

	public static void main(String[] args) {
		Book a = new Book();
		Book b = new Book("�����", "��������");
		Book loveStory = new Book("������");
		System.out.println(b.title + " -> " + b.author);
		System.out.println(loveStory.title + "-> " + loveStory.author);

		a.setTitle("â���� ����");
		a.setAuthor("���ξ߳��� ������");
		System.out.println(a.title + " -> " + a.author);

	}

}
