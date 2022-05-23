package inheritance;

class Parent {
	void print() {
		System.out.println("Parent 메소드 호출");
	}
}

class Child extends Parent {
	@Override
	void print() {
		System.out.println("Child 메소드 호출");
	}
}

public class Casting {

	public static void main(String[] args) {
		Parent p = new Child(); // 업캐스팅: 자식 객체를 부모 객체로 형변환
		p.print(); // 동적 메소드 호출, 자시의 print() 호출
		Parent pa = new Parent();
		pa.print();

		// Child c = new Parent -> 컴파일 오류

		Child c = (Child) p; // 다운캐스팅: 부모 객체를 자식 객체로 형변환
		// Child ch = p; p앞에 (Child)를 붙여서 (Child)p가 되어여 한다.
		c.print(); // 메소드 오버라이딩, 자식 객체의 print() 호출
	}

}
