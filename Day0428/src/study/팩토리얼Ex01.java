package study;

import java.util.*;

public class ���丮��Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, sum;
		sum = 1;
		
		System.out.println("���ڸ� �Է����ּ���~");
		n = sc.nextInt();
	
		for (int i = 1; i<=n; i++) {
			sum *= i;
		}
		
		System.out.println(n+"���丮���� ���� " +sum+"�Դϴ�.");

	}

}
