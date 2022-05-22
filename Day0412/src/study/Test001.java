package study;

/*	 클래스명의 첫 글자는 대문자로.
 *  자바 프로그램을 시작할 때 class, main()을 기본적으로 입력
 *  
 *  main() 메소드 안에 소스 코드를 자겅하여 클래스 이름과 동일한 파일명으로 저장한다.
 *  확장자는 ~.java 
 * 
 * 
 * 
 */
public class Test001 {
	
	//main():main method 프로그램 시작하면 바로 찾아오는게 main임, 시작점이라고 생각하면 된다. main이 없으면 시작이 안됨
	 
	public static void main(String[] args) {
		
      // 코딩영역
		System.out.print("프로그램 실행 테스트");
		System.out.println("프로그램 실행 테스트");
		System.out.print("프로그램 실행 테스트\n"); // \n도 줄 바꿔준다.
		System.out.print("프로그램 실행 테스트");
		// print()라는 method 안에 있는 문자열을 출력해라~ 라는 의미임
		
		int a=10, b=20, c=200;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+","+b); // a랑 b를 연결한다는 의미.
		
		System.out.printf("%d\n", a);
		System.out.printf("%d, %d\n", a, b);
		
		System.out.printf(c+"원");
		
		/* println() 메소드와 print() 메소드의 차이는
		 * 라인 스킵(줄 바꿈) 유무에 있다.
		 * [\n]을 문자열에 포함하면 라인 스킵이 된다.
		*/
		
		
	}

}
