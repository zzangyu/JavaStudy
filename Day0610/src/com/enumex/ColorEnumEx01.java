package com.enumex;

public class ColorEnumEx01 {
	private Color myColor = Color.Red;

	public Color getMyColor() {
		return myColor;
	}

	public void setMyColor(Color myColor) {
		this.myColor = myColor;
	}

	public static void main(String[] args) {
		ColorEnumEx01 ee = new ColorEnumEx01();
		ee.setMyColor(Color.White);
		Color color = ee.getMyColor();

		switch (color) {
		case Red:
			System.out.println("Red");
			break;
		case Green:
			System.out.println("Green");
			break;
		case Blue:
			System.out.println("Blue");
			break;
		case White:
			System.out.println("White");
			break;
		case Black:
			System.out.println("Black");
			break;
		}
	}

}
