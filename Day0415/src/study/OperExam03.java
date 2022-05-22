package study;

public class OperExam03 {

	/*
	 * 비교연산 : > ,< ,<= ,>= 
	 * 항등 관계연산 : ==(같다), !=(같지 않다)
	 */
	
	public static void main(String[] args) {
	
		int i = 10;
		int j = 20;
		
		boolean c = i < j; // 변수 i가 j보다 작다.
		System.out.println(c);
		System.out.println("i<j:"+c);
		
		c = i != j; // 변수 i와 j는 같지 않다.
		System.out.println(c);
		System.out.println("i != j:"+c);
	}

}




