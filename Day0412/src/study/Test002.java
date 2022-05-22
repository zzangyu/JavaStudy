package study;

public class Test002 {
	
	//int aa; //staticint 
	//위에꺼 또는 int aa; -> Test002 t= new Test002();를 만들어줘야함
	
	public static void main(String[] args) { //static은 공유 한다는 뜻이다.
		// 문자열을 사용할 경우 " ":(쌍따움표, 더블쿼터)
		// 상수, 매개변수는 그냥 사용한다. 
		// 여러 문자열과 매개변수를 사용할 경우 연결 기호 +를 사용한
		
		//Test002 t= new Test002();
	
		
		String str ="우리는";
		char ch ='d'; //캐릭터이기 때문에 문자 하나만 들어갈 수 있다.
		System.out.println(str);
		System.out.println(ch);
		System.out.printf("%s\n", str);
		System.out.printf("%c\n", ch);
		System.out.printf("%s, %c\n", str, ch);
	
		System.out.println(10);
		System.out.println(2.14+"는 실수입니다.");
		
		int a=0;
		System.out.println(a);
		//System.out.println(aa); aa가 main위에 있으니까 불러오는 메소드를 입력해야 한다.
		//전역변수-전체적으로 사용 가능, 지역변수-클래스 안에서만 사용 가능
		

	}

}
