package �����ڷ���;

public class StringConcatenationJoinReplace {


	public static void main(String[] args) {
		
		System.out.println("1"+1+2); // �� ���� ��Ʈ���̴ϱ�..
		System.out.println(1+2+"3");
		System.out.println(String.join(", ", "2", "3", "4"));
		System.out.println(String.join(", ", "A", "B", "C"));
		System.out.println("abcd".replace("ab", "xyz"));
		System.out.println("abcd".replace("abc", "xyz"));
	}

}
