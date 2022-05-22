package study;

import java.util.*;

public class IfEx02_단순if {

	public static void main(String[] args) {
	
		// 입력받은 수가 짝수 ?
		
		int a;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("값을 입력하시오: ");
		a=sc.nextInt();
		
		if(a%2==0) 
			System.out.print("짝수 입니다.");
			System.out.println("홀수 입니다."); // 짝수가 아니면 위 프린트문 출력x ▶ 단순if문은 출력 하나만 인식하니까 두번째 코드문이 출력 된것이다.
	}

}
