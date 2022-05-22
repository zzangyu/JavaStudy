package Array;

import java.util.Arrays;
import java.util.Scanner;

public class no2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cycle = 0, max = Integer.MIN_VALUE;
		
		int[] aa = new int[9];
		
		while(cycle < 9 && aa[cycle] < 100) {
			aa[cycle] = sc.nextInt();
			cycle++;
		}
		
		for(int a: aa) {
			if(a>max) {
				max = a;
			}
		}
		
		System.out.println(max);
		System.out.println(Arrays.binarySearch(aa, max));
		
	}

}
