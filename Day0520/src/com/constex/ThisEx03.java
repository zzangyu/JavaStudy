package com.constex;

class BookEx03 {
	String title;
	String author;

	public void show() {
		System.out.println(title + "_" + author);
	}

	public BookEx03() {
		this("너 정말 !!", "뭐라는거야 !!"); // 아무것도 없기 떄문에 2개 다 불러와야 된다. ( 밑에꺼 말고 맨 밑에꺼임)
		System.out.println("생성자 호출");
	}

	public BookEx03(String title) {
		this(title, "메롱"); // 이미 title이 있어서 하나만 추가해주면 된다.
		System.out.println("두번째 생성자 호출");
	}

	public BookEx03(String title, String author) {
		this.title = title;
		this.author = author;
		System.out.println("세번째 생성자 호출");

	}
}

public class ThisEx03 {

	public static void main(String[] args) {

		BookEx03 b1 = new BookEx03("홍길동전", "허균");
		BookEx03 b2 = new BookEx03("홍길동전");
		BookEx03 b3 = new BookEx03();

		b1.show();
		b2.show();
		b3.show();

	}

}
