package Class;

public class BookEx {

	public static void main(String[] args) {

		Book mybook = new Book();

		mybook.name = "논어";
		mybook.writer = "공자"; // 곡부 공
		mybook.price = 6000;
		mybook.isbn = "10000-11111-1111";
		mybook.nowPage = 1;

		Book mybook2 = new Book("논어", "공자", 6000, "10000-11111-1111", 1);
		System.out.println(mybook2);
	}

}
