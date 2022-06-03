package com.excp3;

public class ExceptionTest02 {
	public static void main(String[] args) throws Exception {
		int x = 100;
		int y = 0;
		int tot = 0;
		try {
			tot = x / y;
		} catch (ArithmeticException ae) {
			MyException me = new MyException("³ª´°¼À ", ae);
			me.printStackTrace();
//			throw me;
		}
		System.out.println("tot: " + tot);

	}
}
