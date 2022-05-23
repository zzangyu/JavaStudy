package inheritance;

class Shape {
	public void Shape() {
		System.out.println("Shape");
	}

	public void draw() {
		System.out.println("¾³»è ¾³»è");
	}
}

class Circle2 extends Shape {

	@Override
	public void Shape() {
		super.Shape();
		super.draw();
		System.out.println("cheer up");
	}
}

class Triangle2 extends Shape {
	@Override
	public void Shape() {

	}
}

public class shapeTest {

	public static void main(String[] args) {
		Circle2 c = new Circle2();
		c.Shape();
	}

}
