package study;

/* boolean: ������ �� �ڷ���
 *				  1byte ũ�������� 1��Ʈ�� ����Ѵ�.
 *				  ������ ���� true, false 
 */
public class BooleanEx {

	public static void main(String[] args) {
		
		boolean b = true;
		boolean a = !b;
		System.out.println("���� b�� ����: "+b);
		System.out.println("���� b�� ����: "+!b); // !�� not�̶�� ���̴�.
		System.out.println("���� b�� ����: "+a);
		System.out.println("���� b�� ����: "+b+", a����: "+a);
		
	}

}
