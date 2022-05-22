package study;

/*
무한대로 두개의 정수를 입력받아 합계를 구하는 프로그램 작성하시오.
*/
import java.util.*;
public class 팩토리얼Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, sum;
		n1 = n2 = 1;
		sum = 0;
		for(;;) {
			System.out.println("첫번째 정수: ");
			n1 = sc.nextInt();
			if(n1==0) 
				break;
			System.out.println("두번째 정수: ");
			n2 = sc.nextInt();
			sum = n1+n2;
				System.out.println(n1+"과 "+n2+"의 합은 "+sum);
			
		}

	}

}
