package Class;

import java.io.IOException;

public class ID_02 {

	public static void main(String[] args) throws IOException {
		ID_Ex02 id = new ID_Ex02();
		id.setX();
		id.setY();
		id.display();

		id.setX(50);
		id.setY(80);
		System.out.println("==?̵??? ??ǥ==");
		id.display();
	}

}
