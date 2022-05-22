package HelloWorld;

public class Book {

	private int noOfCopies;

	Book(int noOfCopies){
		this.noOfCopies = noOfCopies;
	}
	
	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setnoOfCopies(int noOfCopies) {
		if (noOfCopies > 0)
			this.noOfCopies = noOfCopies;
	}

	public void increaseBook(int howMuch) {
		setnoOfCopies(this.noOfCopies + howMuch);
	}
	
	public void decreaseBook(int howMuch) {
		setnoOfCopies(this.noOfCopies - howMuch);
	}
	

}
