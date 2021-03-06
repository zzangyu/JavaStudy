package ExceptionHandling;

class Amount3 {
	private String currency;
	private int amount;

	public Amount3(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	public void add(Amount3 that) { // checked exeption을 던지는 방법
		if (!this.currency.equals(that.currency)) {
//			throw new Exception("Currencies Don't Match " + this.currency + " & " + that.currency);
			throw new CurrenciesDoNotMatchException("Currencies Don't Match " + this.currency + " & " + that.currency);
		}

		this.amount += that.amount;
	}

	@Override
	public String toString() {
		return amount + "  " + currency;
	}
}

class CurrenciesDoNotMatchException extends RuntimeException {
	public CurrenciesDoNotMatchException(String msg) {
		super(msg);
	}
}

public class ThrowingExceptionRunner3_Custom {

	public static void main(String[] args) {
		Amount3 amount1 = new Amount3("USD", 10);
		Amount3 amount2 = new Amount3("EUR", 20);
		amount1.add(amount2);
		System.out.println(amount1);
	}

}
