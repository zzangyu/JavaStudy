package inherEx;

/*
다형성
- 한 타입의 참조변수로 여러 타입의 객체를 참조 할 수 있도록 하는 것을 의미함
- 부모클래스는 타입의 참조변수로 자식 클래스의 인스턴스를 참조 할 수 있도록 함
- 부모 클래스 = 자식

기존의 선언과 생성
Super super = new Super();
Sub sub = new Sub();

다형성의 선언과 생성
Super super = new Sub();
Super s1 = new Police();
Super s2 = new Boss();
Super s3 = new Fire();

다형성에서 메소드는 자식것을, 멤버변수는 부모것을 사용한다.
 */

class ParentEx {

	int foo = 5;

	public int getNumber(int a) {
		return a + 1;
	}

}

public class SonEx extends ParentEx {

	int foo = 7; // 자식의 멤버변수

	@Override
	public int getNumber(int a) { // 자식의 메소드

		return a + 2;
	}

	public static void main(String[] args) {
		ParentEx pe = new SonEx();
		System.out.println(pe.getNumber(0)); // 2: 메소드 자식
		System.out.println(pe.foo); // 5: 멤버변수는 부모

		SonEx se = new SonEx();
		System.out.println(se.foo);

	}

}
