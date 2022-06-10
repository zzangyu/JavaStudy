package com.enumex;

public class OperationEnumEx02 {

	public static void main(String[] args) {
		// wrapper class
		double x = Double.parseDouble("10.2");
		double y = Double.parseDouble("20.0");

		System.out.println(x + " + " + y + " = " + Operation.PLUS.eval(x, y));
		System.out.println(x + " - " + y + " = " + Operation.MINUS.eval(x, y));
		System.out.println(x + " * " + y + " = " + Operation.TIMES.eval(x, y));
		System.out.println(x + " / " + y + " = " + Operation.DIVIDE.eval(x, y));

		for (Operation op : Operation.values()) {
			System.out.printf("%.1f %s %.1f = %.1f%n", x, op, y, op.eval(x, y));
		}

	}

}
