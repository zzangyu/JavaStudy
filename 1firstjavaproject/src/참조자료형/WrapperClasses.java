package �����ڷ���;

/*
Wrapper: Boolean, Byte, Integer, Float, Character ...ect
Primitive: boolean, byte, integer, float, char...ect
���� �����ϴ� Wrapper�� �ִ�.
���� Ŭ������ �� �ʿ��Ѱ�?
- �߰����� �ɼ��� �پ��ϰ� �������ش�.
- ��ƿ��Ƽ �޼ҵ带 �����Ѵ�.>> float to int, 2�������� �̷���� ��Ʈ���� ��ȯ��
- �⺻ ������ �÷��ǿ� ������ �� �ִ�. ���� ����� �� ��ü���� �ϰ� ���� Ŭ������ �� �⺻���� ��ü�� �����ϴ� ������ �Ѵ�.
Integer i1 = new Integer(5); ����� integer.ValueOf();�߿� ���ڰ� �� �� ���ٰ� �Ѵ�.
*/

public class WrapperClasses {


	public static void main(String[] args) {
		
//		@SuppressWarnings("removal")
//		Integer i1 = new Integer(5);
		
		Integer seven = Integer.valueOf(7);
		Integer seven1 = 7; // ���� �ʹ� ���! �׷��� �ڹ��� ����ڽ� ����� ����ϴ°ž�(����ڽ��� .valueOf();�� ��)
		System.out.println(seven);
		
		
		
	}
	
	
}
