package study;

/*
 [문제]
 정수 2개를 입력받아 두 수 사이의 수들의 합계를 구하는 프로그램을 작성하시오.
 */
import java.util.*;
public class for문Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i, k, sum=0;
		System.out.println("첫번째 정수를 입력하세요");
		i=sc.nextInt();
		System.out.println("두번째 정수를 입력하세요");
		k=sc.nextInt();
		
		if(i>k) {
			i = i^k;
			k= k^i;
			i = i^k;			
		}
		for(;i<=k;i++) {
			sum = sum+i;
			System.out.println(i+", "+sum);
		}
		
		/*
		 if(num1>num2){
		 	num1=num1^num2	또는	temp공간 만들고 temp=num1;
		 	num2=num2^num1								 num1=num2;
		 	num1=num1^num2	 							 num2=temp;
		 }
		 fir(i=num1; i<=sum;i++){
		 	sum+=i;
		 }
		 */
		
		
		
		
		
		
		
	}

}
