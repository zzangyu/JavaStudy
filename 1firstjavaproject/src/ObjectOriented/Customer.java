package ObjectOriented;

public class Customer {
	
	private String name;
	private Address homeAddress;
	private Address workAddress;
	
	public Customer(String name, Address homeAddress) {
		this.name = name;
		this.homeAddress = homeAddress;
	}

	public String getName() {
		return name;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getHomeaddress() {
		return homeAddress;
	}

	public void setHomeaddress(Address homeaddress) {
		this.homeAddress = homeaddress;
	}
	
	public String toString() {
		return String.format("name - [%s] home address - [%s], work address - [%s]",
				name, homeAddress, workAddress);
	}
	
	
}
