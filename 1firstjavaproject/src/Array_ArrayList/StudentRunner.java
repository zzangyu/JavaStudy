package Array_ArrayList;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		int[] marks = {99, 98, 88, 33, 57, 77};
		
		Student student = new Student ("Ranga", marks);
		
		int number = student.getNumberOfMarks();
		System.out.println("number of marks: "+number);
		
		int sum = student.getTotalSumOfMarks();
		System.out.println("Total sum of makrs: "+sum);
		
		int maximumMark = student.getMaximumMark();
		System.out.println("MaximumMkkkkark of marks: "+maximumMark);
		
		int minimumMark = student.getMinimumMark();
		System.out.println("MinimumMark of marks: "+minimumMark);
		
		BigDecimal average = student.getAverageMarks();
		System.out.println("average: "+average);
		
		System.out.println(student);
		
	}

}
