package study;

public class ¦��Ȧ���հ� {

	public static void main(String[] args) {
		int i, sum=0, even=0, odd=0;
		
		for(i=0; i<11; i++) {
			if(i%2==0) {
				even=even+i;
				System.out.println(i+", "+even);
			}else {
					odd=odd+i;
					System.out.println(i+", "+odd);
				}
				sum=even+odd;
			}
			System.out.println("Ȧ���� �հ�"+odd);
			System.out.println("¦���� �հ�"+even);
			System.out.println("Ȧ���� ¦���� �հ�"+sum);
		
		
		}

	}


