package ObjectOriented;

public class CustomerRunner {

	public static void main(String[] args) {
		
		Address homeAddess = new Address("line 1", "city", "1234");
		Customer customer = new Customer("han", homeAddess);
		
		Address workAddress = new Address("line 1 for work", "city", "12344");
		customer.setWorkAddress(workAddress);
		
		System.out.println(customer);
		
	}

}
