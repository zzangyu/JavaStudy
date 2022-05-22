package study;

public class Â¦¼öÈ¦¼öÇÕ°è {

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
			System.out.println("È¦¼öÀÇ ÇÕ°è"+odd);
			System.out.println("Â¦¼öÀÇ ÇÕ°è"+even);
			System.out.println("È¦¼ö¿Í Â¦¼öÀÇ ÇÕ°è"+sum);
		
		
		}

	}


