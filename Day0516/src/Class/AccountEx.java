package Class;

public class AccountEx {

	public static void main(String[] args) {
		Account ac = new Account();
		ac.setMoney(1000000, "1234");
		int myPay = ac.getMoney();
		System.out.printf("???? ???? ?ܾ?: %d??\n", myPay);

		ac.donjo(1, "1234");
		myPay = ac.getMoney();
		System.out.printf("???? ?? ?ܾ?: %d??\n", myPay);

		ac.donmogo(10000000);
		myPay = ac.getMoney();
		System.out.printf("?Ա? ?? ?ܾ?: %d??", myPay);
	}

}
