package partice;

import java.math.BigDecimal;

public class BigDecimalEx01Runner {

	public static void main(String[] args) {
	
	BigDecimalEx01 calculator = new BigDecimalEx01("4500.00", "7.5");
	BigDecimal totalValue =
			calculator.calculateTotalValue(5);
	System.out.println(totalValue);
	
	}

}
