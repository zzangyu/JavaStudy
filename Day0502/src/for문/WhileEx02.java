package for문;
/*
[문제]
while문을 이용하여 구구단을 출력하시오.
 */


public class WhileEx02 {

	public static void main(String[] args) {
		int i=2 , j=1;
		
		while(i<=9) {
			while(j<=9) {
				System.out.printf("%d X %d = %d\n", i, j , i*j);
				j++;
			}
			System.out.println();
			i++;
			j=1;
		}
		
		

	}

}
