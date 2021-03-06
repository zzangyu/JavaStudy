package MethodEx;

/*
값에 의한 호출(call by value)
메소드 호출 시 기본 자료형의 값을 인자(매개변수)로 전달하는 방식
 */
public class ValueParameter {

	public int increase(int n) {

		n++;
		return n;
	}

	public static void main(String[] args) {

		ValueParameter vp = new ValueParameter();
		int value1 = 100;
		int value2 = vp.increase(value1);

		System.out.println("value: " + value1 + ", value2: " + value2);
	}

}
