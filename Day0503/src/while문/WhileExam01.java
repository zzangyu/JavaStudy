package while��;

/*
[����]
����ڰ� �Է��ϴ� ������ ����ؼ� ���� ���ư�
���� 0�� �ԷµǸ� ���ݱ��� �Էµ� ������ ���� ����� ����ϰ� ������
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileExam01 {

	public static void main(String[] args) throws IOException{
		int sum = 0, a = 1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(a!=0){
			System.out.print("������ �Է����ּ���. - ");
			a = Integer.parseInt(br.readLine());
			sum += a;
		
		}System.out.println("0 �Է��ؼ� ������! ���� "+sum);
		
		
		
	}

}
