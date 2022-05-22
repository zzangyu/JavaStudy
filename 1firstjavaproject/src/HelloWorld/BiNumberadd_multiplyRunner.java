package HelloWorld;

public class BiNumberadd_multiplyRunner {

	public static void main(String[] args) {
		BiNumberadd_multiply numbers = new BiNumberadd_multiply(3,5);
		
		System.out.println(numbers.add());
		System.out.println(numbers.multiply());
		
		numbers.doubleValue();
		
		System.out.println(numbers.getNumber1());
		System.out.println(numbers.getNumber2());
		

	}

}
