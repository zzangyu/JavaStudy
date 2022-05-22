package for¹®;

public class MyNumberRunner {

	public static void main(String[] args) {
		MyNumber number = new MyNumber(5);
		boolean isPrime = number.isPrime();
		System.out.println("iPrime "+isPrime);

		int sum = number.sumUptoN();
		System.out.println("sumUptoN "+sum);
		
		int sumOfDivisors = number.sumOfDivisors();
		System.out.println("sumOfDivisiors"+sumOfDivisors);
		
		number.printANumberTriangle();
	}

}
