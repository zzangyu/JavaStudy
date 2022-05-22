package HelloWorld;

public class BookRunner {
	public static void main(String[] args) {
		// 인스턴스 3개
		Book artOfComputerPrograming = new Book(1000);
		Book effectiveJava = new Book(1000);
		Book cleanCode = new Book(1000);
		
		System.out.println(artOfComputerPrograming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());
		
//		artOfComputerPrograming.setnoOfCopies(10);
//		effectiveJava.setnoOfCopies(3);
//		cleanCode.setnoOfCopies(2);
		
//		artOfComputerPrograming.increaseBook(4);
//		effectiveJava.setNoOfCopies(1);
//		cleanCode.setNoOfCopies(5);
		
		artOfComputerPrograming.increaseBook(5);
		effectiveJava.increaseBook(1);
		cleanCode.increaseBook(5);
		
		artOfComputerPrograming.decreaseBook(5);
		effectiveJava.decreaseBook(1);
		cleanCode.decreaseBook(5);
		
		
		
		System.out.println(artOfComputerPrograming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());
	}
}
