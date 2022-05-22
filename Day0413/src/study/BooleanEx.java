package study;

/* boolean: 유일한 논리 자료형
 *				  1byte 크기이지만 1비트만 사용한다.
 *				  가지는 값은 true, false 
 */
public class BooleanEx {

	public static void main(String[] args) {
		
		boolean b = true;
		boolean a = !b;
		System.out.println("변수 b의 값은: "+b);
		System.out.println("변수 b의 값은: "+!b); // !는 not이라는 뜻이다.
		System.out.println("변수 b의 값은: "+a);
		System.out.println("변수 b의 값은: "+b+", a값은: "+a);
		
	}

}
