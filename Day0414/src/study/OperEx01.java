package study;

/*
 * 증감 연산자(++/--)
 * 		하나씩 증가 시키거나, 감소 시키는 연산자
 */

public class OperEx01 {

	public static void main(String[] args) {
		
		// 후위형 (전 대입 후 연산)
		int x = 10;
		int y = x++; // 계산을 위해 y에 10이 들어간다. 그래서 y가 10이 나온다.
		System.out.println("x: "+x+" y :"+y);
		
		// 전위형 (전 연산 후 대입)
		int a = 10;
		int b = ++a;
		System.out.println("a: "+a+" b :"+b);
		
		int i = 5;
		i++; // i = i+1 과 동일한 의미이다. 대입하고 더한다. (전위형) sum = sum + 1
		System.out.println(i);
		i = 5;
		System.out.println(i);
		++i; // 먼저 더하고 대입한다. (후위형)
		System.out.println(i);
		
		
		///////////////////////////////////////////////////////////////////////////////
		
		/*
		 * 연산자 (+ - * 나누기(몫) %(나머지)) *는 곱하기 말고도 만능문자라는 뜻도 있다. 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
	}

}
