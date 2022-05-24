package inherEx;

class PointEx {
	private int x;
	private int y;

	public PointEx() {

	}

	public PointEx(int x) {
		this.x = x;
	}

	public PointEx(int x, int y) {
		this(x);
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void display() {
		System.out.println("x value is " + x + ", y value is " + y);
	}
}

public class CircleEx extends PointEx {

	private int r;

	public CircleEx() {

	}

	public CircleEx(int x) {
		super(x);
		this.r = x;
		r = 1;
	}

	public CircleEx(int x, int y) {
		super(x, y);
		r = 2;
	}

	public CircleEx(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("r value is " + r);
	}

	public static void main(String[] args) {
		CircleEx c = new CircleEx(5, 6);
		c.display();
	}

}
