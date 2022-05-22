package while문;
/*
[문제]
-1^2 + 2^2 + -3^2 + 4^2 + -5^2 +...+100^100 의 합계를 구하는 프로그램을 작성하시오,
*/

public class WhileExam02 {

	public static void main(String[] args) {
		int a=1, sum1=0, simbol=-1;
		
		while(a<=99) {
			sum1 = sum1 + (simbol*a*a+(a+1)*(a+1));
			a = a+2;
		}System.out.println(sum1);
		
		while(a<=99) {
			simbol = -simbol;
			sum1 = sum1 + (simbol*a*a);
			a = a+1;
		}System.out.println(sum1);
	}
		
}
