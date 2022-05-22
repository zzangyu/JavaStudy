package study;

public class for문Ex01 {

	public static void main(String[] args) {
	// 1부터 10까지의 합계 : 55
		
		int i, k, sum;
		sum = 0;
		i=0;
		for(;i<3; i++) {
			for(k = 0; k<3; k++) {
			sum = sum + i+k;
			System.out.printf("%d, %d이면 "+sum+"입니다.\n", i, k);
			}
		}
		System.out.println("합계는 "+sum+"입니다.");
	}

}
