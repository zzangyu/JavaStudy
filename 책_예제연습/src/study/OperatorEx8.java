package study;

public class OperatorEx8 {

	public static void main(String[] args) {
		int a  = 1_000_000;
		int b  = 2_000_000;
		long c = a*b;
		System.out.println(c);
		
		c=0;
		c =(long)a*b; // (long)(a*b) �̰� �� �ȵǴ���
		System.out.println(c);
	}

}
