package Rectangle;

import java.util.Scanner;

public class RectangleEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Rectangle r = new Rectangle();

		System.out.print("가로");
		r.width = sc.nextInt();
		System.out.print("세로");
		r.height = sc.nextInt();

		int Area = r.getArea();
		System.out.println("사각형의 넓이는 " + Area + " cm^2");
		int Circum = r.getCircum();
		System.out.println("사각형의 둘레는 " + Circum + " cm");

	}

}
