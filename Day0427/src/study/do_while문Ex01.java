package study;

public class do_while��Ex01 {

	public static void main(String[] args) {
		
		int i, sum=0;
		i=1;
		 do{ // ***������ ����, ������ do ��� �ȿ�, ������ �� �ؿ�***
			sum = sum + i;
			System.out.println(i+", "+sum);
			i++;
		}while(i<10);
		
	}

}
