package study;

// [문제] 정수 35가 짝수인지 홀수인지 판정하는 프로그램 구현. 단, 삼항 연산자를 활용하시오.

public class OperExam06 {

	public static void main(String[] args) {
		
		/*
		int a = 20, b = 30, max;
		max = a > b ? ++a : ++b; 
		연산자는 두개(?, :), 항은 3개. 만약 ~라면(?) ~하고 아니면(:) ~해라
		거짓이므로 ++b를 해서 b값이 31이 된다. max는 31이 된다.
		
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		System.out.println("max :"+max);
		*/

		int i = 35;
		String result; // 문자를 쓰니까 string
		
		result = i % 2 ==0 ? "짝수" : "홀수";
		
		System.out.println("정수 35는 "+result+"입니다.");

	}

}
