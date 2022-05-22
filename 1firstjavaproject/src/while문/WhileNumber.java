package while문;

public class WhileNumber {
	
private int number;


	public WhileNumber(int number) {
		this.number = number;
	}

	public void printSquaresUptoLimit() {
		int i = 1;
		System.out.print("숫자들의 제곱값: ");
		while(i*i<=number) {
			System.out.print(i*i+"  ");
			i++;
		}
		
	}

	public void printCubesUptoLimit() {
		int i = 1;
		System.out.print("숫자들의 세제곱값: ");
		while(i*i*i<=number) {
			System.out.print(i*i*i + "  ");
			i++;
		}
		
	}

	

}
