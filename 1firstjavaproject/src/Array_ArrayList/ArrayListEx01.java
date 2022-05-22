package Array_ArrayList;

import java.util.Arrays;

public class ArrayListEx01 {
   public static void main(String[] args) {
	
			
		int sum = 0;
		int[] a = {12, 34, 56};
		for(int b: a) {
		sum = sum + b;
		}
		System.out.println(sum);
		
		int[] c = {1, 2, 3, 4, 5, 6, 7, 8};
		for(int d = 0; d < 8; d++) {
			System.out.print(c[d]+"  ");
		}
		System.out.println(Arrays.toString(c));
		
		
		int[] e = {1, 2, 3, 4, 5, 6, 7, 8};
		for(int f:e) {
			System.out.print(f+"  ");
		}
		
	}


}
