package study;
/*  
	[����] ����, ����, ������ �ִ�. �� ������ ������ ������ �Է� �޾Ƽ� ������ ����� ����ϴ� ���α׷��� �����Ͻÿ�.
	��, ����� �Ҽ� 2�ڸ����� ����Ѵ�.
	�Է��� scanner
 */
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	double math, eg, kr, av, total;
	
	System.out.println("���� ������ : ");
	math = sc.nextDouble();
	System.out.println("���� ������ : ");
	eg = sc.nextDouble();
	System.out.println("���� ������ : ");
	kr = sc.nextDouble();
	
	av = (math + eg + kr)/3;
	total = math + eg + kr;

	System.out.printf("��� ������ %.2f��, ������ %.0f���̴�.", av, total);
	
	
	
	
	
		
	}

}
