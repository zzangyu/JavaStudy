package Class;

public class Book { // 클래스 헤더(클래스 명)

	// 멤버필드(변수, 상수), 속성
	String name;
	String writer;
	int price;
	int nowPage;
	String isbn;

	public Book() { // 기본 생성자
	}

	public Book(String name, String writer, int price, String isbn, int nowPage) {
		this.name = name;
		this.writer = writer;
		this.price = price;
		this.isbn = isbn;
		this.nowPage = nowPage;
	}

	public void nextPage() { // 메소드(동작, 행위)
		nowPage++;
	}

	public void previousPage() {
		nowPage--;
	}

	@Override
	public String toString() {
		return name + writer + price + nowPage + isbn;
	}

}
