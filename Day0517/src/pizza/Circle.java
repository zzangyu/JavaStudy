package pizza;

public class Circle {

	int radius; // ���� ������ �ʵ�
	String name; // ���� �̸� �ʵ�

	public Circle() {

	}

	public double getArea(int radius) { // ���� ������ ���ϴ� �޼ҵ� , ������*������*3.14
		return radius * radius * Math.PI;
	}

}
