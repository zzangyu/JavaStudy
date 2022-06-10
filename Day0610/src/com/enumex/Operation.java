package com.enumex;

public enum Operation {

	PLUS {
		@Override
		double eval(double x, double y) {
			return x + y;
		}
	},
	MINUS {
		@Override
		double eval(double x, double y) {
			return x - y;
		}
	},
	TIMES {
		@Override
		double eval(double x, double y) {
			return x * y;
		}
	},
	DIVIDE {
		@Override
		double eval(double x, double y) {
			return x / y;
		}

	};

	abstract double eval(double x, double y);

}