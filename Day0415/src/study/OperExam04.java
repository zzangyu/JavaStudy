package study;

public class OperExam04 {

/*
    ������
    &&(����/and) A,B�� ������ ���� �� �ִ� ����� ���� �� ���� 
    ||(����/or) 
    !(not) 
 */
	public static void main(String[] args) {
	
		boolean a = false;
		boolean b = false;
		
		if((a = 4>3)||(b = 5>7)) { // ���� �� 3��. (a=4>3), (b=5>7), (a=4>3||b=5>7)
			System.out.println("a = "+a); 
			System.out.println("b = "+b);
			System.out.println(a||b);
		if((a = 4>3)&&(b = 5>7))  //�ڵ��� Ʋ�ȴµ� �׳� ���� �ϼ�
			System.out.println("a = "+a); 
			System.out.println("b = "+b);
			System.out.println(a&&b);
			
			
		
		}
	}

}
