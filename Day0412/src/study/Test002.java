package study;

public class Test002 {
	
	//int aa; //staticint 
	//������ �Ǵ� int aa; -> Test002 t= new Test002();�� ����������
	
	public static void main(String[] args) { //static�� ���� �Ѵٴ� ���̴�.
		// ���ڿ��� ����� ��� " ":(�ֵ���ǥ, ��������)
		// ���, �Ű������� �׳� ����Ѵ�. 
		// ���� ���ڿ��� �Ű������� ����� ��� ���� ��ȣ +�� �����
		
		//Test002 t= new Test002();
	
		
		String str ="�츮��";
		char ch ='d'; //ĳ�����̱� ������ ���� �ϳ��� �� �� �ִ�.
		System.out.println(str);
		System.out.println(ch);
		System.out.printf("%s\n", str);
		System.out.printf("%c\n", ch);
		System.out.printf("%s, %c\n", str, ch);
	
		System.out.println(10);
		System.out.println(2.14+"�� �Ǽ��Դϴ�.");
		
		int a=0;
		System.out.println(a);
		//System.out.println(aa); aa�� main���� �����ϱ� �ҷ����� �޼ҵ带 �Է��ؾ� �Ѵ�.
		//��������-��ü������ ��� ����, ��������-Ŭ���� �ȿ����� ��� ����
		

	}

}
