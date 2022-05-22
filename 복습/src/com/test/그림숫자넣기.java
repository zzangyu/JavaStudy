package com.test;

public class 그림숫자넣기 {

	public static void main(String[] args) {
		
		for(int a = 0; a < 5; a++) {
			
			for(int b = 4; b >= a; b--) {
				System.out.print("  ");
			}
			
			for (int c = 0, d = 4; c < a; c++) {
				d -= 1;
				System.out.print(Math.abs(d));
			}
			
			System.out.println();
		}

	}

}
