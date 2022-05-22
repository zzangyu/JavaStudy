package 참조자료형;

/*
Wrapper: Boolean, Byte, Integer, Float, Character ...ect
Primitive: boolean, byte, integer, float, char...ect
각자 상응하는 Wrapper가 있다.
래퍼 클래스는 왜 필요한가?
- 추가적인 옵션을 다양하게 제공해준다.
- 유틸리티 메소드를 제공한다.>> float to int, 2진법으로 이루어진 스트링을 전환등
- 기본 값들을 컬렉션에 저장할 수 있다. 저장 대상은 꼭 객체여야 하고 래퍼 클래스는 이 기본값에 객체를 제공하는 역할을 한다.
Integer i1 = new Integer(5); 방법과 integer.ValueOf();중에 후자가 좀 더 좋다고 한다.
*/

public class WrapperClasses {


	public static void main(String[] args) {
		
//		@SuppressWarnings("removal")
//		Integer i1 = new Integer(5);
		
		Integer seven = Integer.valueOf(7);
		Integer seven1 = 7; // 위는 너무 길어! 그래서 자바의 오토박싱 기능을 사용하는거야(오토박싱이 .valueOf();를 씀)
		System.out.println(seven);
		
		
		
	}
	
	
}
