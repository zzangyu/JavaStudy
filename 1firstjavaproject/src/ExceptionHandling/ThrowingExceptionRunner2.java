package ExceptionHandling;

class Amount2 {
	private String currency;
	private int amount;

	public Amount2(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	public void add(Amount2 that) throws Exception { // checked exeption을 던지는 방법
		if (!this.currency.equals(that.currency)) {
			throw new Exception("Currencies Don't Match " + this.currency + " & " + that.currency);
		}

		this.amount += that.amount;
	}

	@Override
	public String toString() {
		return amount + "  " + currency;
	}
}

public class ThrowingExceptionRunner2 {

	public static void main(String[] args) throws Exception {
		Amount2 amount1 = new Amount2("USD", 10);
		Amount2 amount2 = new Amount2("EUR", 20);
		amount1.add(amount2);
		System.out.println(amount1);
	}

}
