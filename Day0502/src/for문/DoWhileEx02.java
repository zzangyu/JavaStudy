package for��;

/*
[����]
����, ����, ���� ������ �Է¹޾� ������ ��� �׸��� ������ ���ϴ� ���α׷��� �ۼ�
����: 100~90:A, 60�� ���ϴ� F�� ó��
����� �Ҽ������� ���ڸ�����
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoWhileEx02 {

	public static void main(String[] args) throws IOException {
		float avg = 0;
		char grade = 0 ;
		int math, eng, kor, total = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			System.out.print("���� ������ �Է����ּ���.");
			kor = Integer.parseInt(br.readLine());
		}while(kor<0||kor>100);
		do{
			System.out.print("���� ������ �Է����ּ���.");
			math = Integer.parseInt(br.readLine());
		}while(math<0||math>100);
		do {
			System.out.print("���� ������ �Է����ּ���.");
			eng = Integer.parseInt(br.readLine());
		}while(eng<0||eng>100);
		
			total = math + eng + kor;
			avg = total/3.0f;
		
		switch ((int)(avg/10)) {
		case 10:
		case 9: grade = 'A'; break;
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		default: grade = 'F'; break;

		}
			System.out.printf("���� %d, ��� %.2f, ���� %c�Դϴ�.\n", total, avg, grade);

}

}
