package com.ex2;

public class DiagramRunner {

	public static void main(String[] args) {
		Diagram[] dd = { new Circle(), new Rectengle(), new Triangle() };

		for (Diagram diagram : dd) {
			diagram.draw();
		}

//		Circle c = new Circle();
//		Rectengle r = new Rectengle();
//		Triangle t = new Triangle();
//		c.draw();
//		r.draw();
//		t.draw();

	}

}
