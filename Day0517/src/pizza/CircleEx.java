package pizza;

public class CircleEx {

	public static void main(String[] args) {
		Circle pizza; // reference 변수선언

		pizza = new Circle(); // 객체 생성

		// 반지름 10
		pizza.radius = 10;
		pizza.name = "초콜릿 피자";

		double area = pizza.getArea(pizza.radius);
		System.out.printf("%s의 면적은 %.3f", pizza.name, area);

		System.out.println();

		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "초콜릿 도넛";
		area = donut.getArea(donut.radius);
		System.out.printf("%s의 면적은 %.3f", donut.name, area);

	}

}
