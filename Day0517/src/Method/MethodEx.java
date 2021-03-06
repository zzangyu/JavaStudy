package Method;

/*
1. 메소드(멤버 함수)
- 객체가 할 수 있는 동작들을 정의한 것임
- 메소드의 종류는 두가지로 구분된다.
	1) 인스턴스 메소드
	2) Static 메소드
 */
public class MethodEx {

	public int add(int i, int j) {
		return i + j;
	}

	public int sub(int i, int j) {
		return i - j;
	}

	public int multi(int i, int j) {
		return i * j;
	}

	public int div(int i, int j) {
		return i / j;
	}

	public static void main(String[] args) {
		int i = 10;
		int j = 10;
		int a, b, c, d;

		MethodEx me = new MethodEx();

		a = me.add(i, j);
		b = me.sub(i, j);
		c = me.multi(i, j);
		d = me.div(i, j);

		System.out.println("더하기 한 결과: " + a);
		System.out.println("빼기 한 결과: " + b);
		System.out.println("곱하기 한 결과: " + c);
		System.out.println("나누기 한 결과: " + d);
	}
}
