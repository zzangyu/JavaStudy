package study;

/*
1�������� 10������ �հ踦 ���Ѵ�.
��Ģ�� �ľ��ϴ°��� ���� �߿��ϴ�.
������ 2�� �̻��� �ʿ��ϴ�.
 */

public class for��Ex1 {

	public static void main(String[] args) {
		
		int i, k, isum = 0, ksum = 0;
		
		for(i=0; i<11; i = i +2) {
			isum += i;
		}
		for(k=1; k<11; k= k+2) {
				ksum += k;
		}
		System.out.println("¦���� ���� "+isum+"Ȧ���� ���� "+ksum+"¦�� Ȧ���� ���� "+(isum+ksum));
		
	}

}
