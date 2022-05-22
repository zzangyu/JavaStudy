package for문;

public class MyNumber {
	
	private int number;

	public MyNumber(int number) {
		this.number = number;
	}

	public boolean isPrime() { // 1<i사이의 수들로 나눠서 나머지가 있어야 함
		if(number<2) {
			return false;
		}
		
		for(int i = 2; i <= number-1 ;i++) {
		if(number % i == 0 ) {
			return false;
			}
		}
		return true;
	}

	public int sumUptoN() {
		int sum = 0;
		for(int i = 1; i <= number; i++) {
			sum += i;
		}
		return sum;
	}

	public int sumOfDivisors() {
		int sum = 0 ;
		for(int i = 2; i <= number -1 ; i++) {
			if(number%i==0) {
				sum+=i;
			}
		}
		return sum;
	}

	public void printANumberTriangle() {
		for(int i = 1; i <= number; i++ ) {
			for(int j = 1; j<=i; j++) {
			System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	

	
}
