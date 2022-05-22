package study;
/*
[문제]
임의의 정수를 입력받아 짝수인지, 홀수인지, 0인지를 판정하는 프로그램을 작성하시오.
단, 이외의 것이 들어오면 판정 불가를 출력
 */
import java.util.*;

public class Test001 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i;
		String s = "";
		char c;
		
		System.out.print("정수를 입력해주세요.");
		i = sc.nextInt();
		
		
		if(i%2==0){
			s = "짝수";
			if(i==0) {
				s = "0";					
			}
		}else if (i%2==1){
			s = "홀수";
		}
		System.out.print("입력받은 정수는 "+s+"입니다.");
		
	}
}
