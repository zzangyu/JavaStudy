package study;

import java.util.*;

public class 팩토리얼Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, sum;
		sum = 1;
		
		System.out.println("숫자를 입력해주세용~");
		n = sc.nextInt();
	
		for (int i = 1; i<=n; i++) {
			sum *= i;
		}
		
		System.out.println(n+"팩토리얼의 값은 " +sum+"입니다.");

	}

}
