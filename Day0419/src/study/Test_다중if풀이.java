package study;

import java.util.*;

public class Test_����ifǮ�� {

	public static void main(String[] args) {
		
		int kor, math, eng, sci, his, total=0, avrg=0;
		char grade;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ ������ �Է��Ͻÿ�.: ");
		math = sc.nextInt();
		System.out.print("������ ������ �Է��Ͻÿ�.: ");
		kor = sc.nextInt();
		System.out.print("������ ������ �Է��Ͻÿ�.: ");
		eng = sc.nextInt();
		System.out.print("������ ������ �Է��Ͻÿ�.: ");
		sci = sc.nextInt();
		System.out.print("������ ������ �Է��Ͻÿ�.: ");
		his = sc.nextInt();
		
		total = kor + math + eng + sci + his;
		avrg = total/5;
		
		//�ؿ� if�� ä�� �־����~ 
	}
}