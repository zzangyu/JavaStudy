package Rectangle;

import java.util.Scanner;

public class RectangleEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Rectangle r = new Rectangle();

		System.out.print("����");
		r.width = sc.nextInt();
		System.out.print("����");
		r.height = sc.nextInt();

		int Area = r.getArea();
		System.out.println("�簢���� ���̴� " + Area + " cm^2");
		int Circum = r.getCircum();
		System.out.println("�簢���� �ѷ��� " + Circum + " cm");

	}

}
