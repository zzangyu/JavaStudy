package inheritance;

class Shape {
	public void Shape() {
		System.out.println("Shape");
	}

	public void draw() {
		System.out.println("���� ����");
	}
}

class Circle extends Shape {

	@Override
	public void Shape() {
		super.Shape();
		super.draw();
		System.out.println("cheer up");
	}
}

class Triangle extends Shape {
	@Override
	public void Shape() {

	}
}

public class shapeTest {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.Shape();
	}

}
