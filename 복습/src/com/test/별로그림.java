package com.test;

public class 별로그림 {

	public static void main(String[] args) {
		int a, b, c;
		
		for(a = 0; a < 5; a++) {
			for(b = 4; b > a; b--) {
				System.out.print("  ");
			}
			
			for(c = 0; c < a+1; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
	
}
