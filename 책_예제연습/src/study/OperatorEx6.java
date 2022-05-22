package study;

public class OperatorEx6 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a+b); // 연산자 +때문에 int 형으로 바뀌어서 계산된다. 그래서 다시 바꿔줘야 됨
		System.out.println(c);

	}

}
