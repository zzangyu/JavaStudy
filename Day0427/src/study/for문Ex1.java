package study;

/*
1에서부터 10까지의 합계를 구한다.
규칙을 파악하는것이 제일 중요하다.
변수는 2개 이상이 필요하다.
 */

public class for문Ex1 {

	public static void main(String[] args) {
		
		int i, k, isum = 0, ksum = 0;
		
		for(i=0; i<11; i = i +2) {
			isum += i;
		}
		for(k=1; k<11; k= k+2) {
				ksum += k;
		}
		System.out.println("짝수의 합은 "+isum+"홀수의 합은 "+ksum+"짝수 홀수의 합은 "+(isum+ksum));
		
	}

}
