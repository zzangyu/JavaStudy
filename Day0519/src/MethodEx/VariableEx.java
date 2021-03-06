package MethodEx;

/*
메소드 정의 시 통일된 인자의 자료형에 '...'라고 명시하므로 이를 통해 메소드를 수행하는데
필요한 인자의 수를 유연하게 구현할 수 있다.
 */
public class VariableEx {

	public void argsTest(int a1, int a2, String... n) {
		for (int i = 0; i < n.length; i++) {
			System.out.println("n[" + i + "]: " + n[i] + ", " + a1 + ", " + a2);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		VariableEx ve = new VariableEx();
		ve.argsTest(4, 5, "바보", "멍청이", "똥개");
		ve.argsTest(5, 6, "100", "600", "1000", "10000");

	}

}
