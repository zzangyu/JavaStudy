package Array;

import java.util.Scanner;

public class no3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int aa[] = new int [10];
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = a*b*c;
		System.out.println(sum);
		
		while(sum>0) {
			aa[sum%10]++;
			sum /= 10;
		}
		for(int i = 0; i<10; i++) {
			System.out.printf("%d의 개수는 - %d\n", i, aa[i]);
		}
		
	}
}
