package com.test;

public class 숫자그리기3 {

	public static void main(String[] args) {
		
		int a, b;
		
		for(a = 0; a < 5; a++) {
			for(b = 0; b < 4 - a; b++) {
				System.out.print("  ");
			}
			for(b = 0; b < 2*a+1; b++) {
				System.out.print((a-b>=0)?a-b+1:b-a+1);
			
			}		
			System.out.println();
		}
		

	}

}
